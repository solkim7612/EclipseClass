package blindWeb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CompanyDAO {
    // Database connection information
    private final String driver = "oracle.jdbc.driver.OracleDriver";
    private final String url = "jdbc:oracle:thin:@localhost:1521:testdb";
    private final String user = "scott";
    private final String password = "tiger";

    // Constructor to load the JDBC driver
    public CompanyDAO() {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    // Method to get a list of all companies
    public List<Company> getAllCompanies() {
        List<Company> companyList = new ArrayList<>();
        
        String query = "SELECT * FROM company";
        
        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement preparedStatement = connection.prepareStatement(query);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                Company company = new Company();
                company.setCompany_id(resultSet.getString("company_id"));
                company.setCompany_name(resultSet.getString("company_name"));
                companyList.add(company);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return companyList;
    }
}