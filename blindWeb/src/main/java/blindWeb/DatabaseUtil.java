package blindWeb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtil {

    // JDBC URL, 사용자 이름, 비밀번호를 설정합니다.
	static String driver = "oracle.jdbc.driver.OracleDriver";
	static String url = "jdbc:oracle:thin:@localhost:1521:testdb";
	static String user = "scott";
	static String password = "tiger";

    // 데이터베이스 연결을 가져오는 메서드
    public static Connection getConnection() {
        Connection connection = null;
        try {
            // JDBC 드라이버 로드
            Class.forName(driver);
            
            // 데이터베이스 연결 생성
            connection = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC 드라이버를 찾을 수 없습니다.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("데이터베이스 연결에 실패했습니다.");
            e.printStackTrace();
        }
        return connection;
    }
}