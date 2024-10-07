package blindWeb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserInfoDAO {
    // Database connection information
    private final String driver = "oracle.jdbc.driver.OracleDriver";
    private final String url = "jdbc:oracle:thin:@localhost:1521:testdb";
    private final String user = "scott";
    private final String password = "tiger";

    // Constructor to load the JDBC driver
    public UserInfoDAO() {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    // Method to get a list of all user information by companyId
    public List<UserInfo> getUsersByCompanyId(String companyId) {
        List<UserInfo> userList = new ArrayList<>();
        
        String query = "SELECT * FROM userInfo WHERE company_id = ?";
        
        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            
            // Setting the companyId parameter
            preparedStatement.setString(1, companyId);
            
            // Executing the query and processing the result set
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    UserInfo userInfo = new UserInfo();
                    userInfo.setUserId(resultSet.getString("userId"));
                    userInfo.setUserPw(resultSet.getString("userPw"));
                    userInfo.setUserName(resultSet.getString("userName"));
                    userInfo.setCompany_id(resultSet.getString("company_id"));
                    userList.add(userInfo);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return userList;
    }
}