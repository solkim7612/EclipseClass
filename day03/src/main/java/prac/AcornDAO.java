package prac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AcornDAO {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:testdb";
	String user = "scott";
	String password = "tiger";
	
	
	Connection dbcon() {
		
		Connection con=null;
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(url, user, password);
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return con;
	}
	
	public ArrayList<Acorn> getAcornList(){
		Connection con=dbcon();
		PreparedStatement pst=null;
		
		String sql="select * from acornbtl";
		
		ArrayList<Acorn> list = new ArrayList<>();
		try {
			pst  =con.prepareStatement(sql);
			ResultSet  rs= pst.executeQuery();
			
			while( rs.next()) {   //  
				String id =rs.getString(1);
				String pw =rs.getString(2);
				String name =rs.getString(3);
				
				Acorn acorn = new Acorn(id, pw, name );
				list.add(acorn);
				
				
				
			}
			
			//
			rs.close();
			pst.close();
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
		
		
	
		 
	}
}
