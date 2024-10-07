package blind;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DBDAO_blind {

	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:testdb";
	String user = "scott";
	String password = "tiger";	
	
	
	private  Connection  dbcon() {
		Connection con= null;		
		try {
			Class.forName(driver);
			con =DriverManager.getConnection(url, user, password);
			//if( con != null) System.out.println(" dbok");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return con;
		
	}
	
	private void dbclose(AutoCloseable ...autoCloseables) {
		
		for(AutoCloseable a : autoCloseables) {
			try {
				a.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public  ArrayList<bestTopic>  selectAllBestTopic(){
		Connection con =null;
		PreparedStatement pst =null;
		ResultSet rs = null;
		ArrayList<bestTopic> list  = new ArrayList<>();		
		 	
		con= dbcon();		
		
		String sql = "SELECT post_id, post_title, comment_count " +
                "FROM ( " +
                "    SELECT p.post_id, p.post_title, COUNT(s.comments_id) AS comment_count " +
                "    FROM post p " +
                "    LEFT JOIN comments s ON p.post_id = s.post_id " +
                "    GROUP BY p.post_id, p.post_title " +
                "    ORDER BY comment_count DESC " +
                ") " +
                "WHERE ROWNUM <= 5";		
		
		try {
			pst =con.prepareStatement(sql);
			rs  =pst.executeQuery();
			
			while( rs.next()) {  //rs => 한 행(레코드) 데이가 있음 
				String id  = rs.getString(1);
				String title  = rs.getString(2);
				String count_com  = rs.getString(3);
				
				bestTopic bt = new bestTopic( id, title , count_com );
				
				list.add(bt);				
			}	
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			dbclose(rs,pst,con);
		}
		
		return list;
		
	}
	
	
	public  post  selectPostDetail(String id){
		Connection con =null;
		PreparedStatement pst =null;
		ResultSet rs = null;
		//ArrayList<post> list  = new ArrayList<>();		
		post pt = null ;	
		
		con= dbcon();		
		
		String sql = "SELECT \r\n"
				+ "    p.post_title,\r\n"
				+ "    c1.company_name,\r\n"
				+ "    RPAD(p.userId, 8, '*') ,\r\n"
				+ "    p.post_contents,\r\n"
				+ "    p.post_date\r\n"
				+ "FROM \r\n"
				+ "    post p\r\n"
				+ "JOIN \r\n"
				+ "    comments s ON p.post_id = s.post_id\r\n"
				+ "JOIN \r\n"
				+ "    company c1 ON p.post_usercompany = c1.company_id \r\n"
				+ "WHERE \r\n"
				+ "    p.post_id = ? \r\n"
				+ "GROUP BY\r\n"
				+ "    p.post_title,\r\n"
				+ "    c1.company_name,\r\n"
				+ "    p.post_contents,\r\n"
				+ "    p.userId,\r\n"
				+ "    p.post_date";		
		
		try {
			pst =con.prepareStatement(sql);
			pst.setString(1, id);
			rs  =pst.executeQuery();
			
			while( rs.next()) {  //rs => 한 행(레코드) 데이가 있음 
				String title  = rs.getString(1);
				String company  = rs.getString(2);
				String user_id  = rs.getString(3);
				String contents  = rs.getString(4);
				String date  = rs.getString(5);
				
				
				pt = new post(title, company, user_id, contents, date);
				
								
			}	
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			dbclose(rs,pst,con);
		}
		
		return pt;
		
	}
	
	
	public  ArrayList<Comment>  selectAllComment(String id){
		Connection con =null;
		PreparedStatement pst =null;
		ResultSet rs = null;
		ArrayList<Comment> list  = new ArrayList<>();		
		
		con= dbcon();		
		
		String sql = "SELECT \r\n"
				+ "    c2.company_name,\r\n"
				+ "    RPAD(s.userId,8,'*'),\r\n"
				+ "    s.comments_contents,\r\n"
				+ "    TO_CHAR(s.comments_date, ' YYYY-MM-DD'),\r\n"
				+ "    s.COMMENTS_ID\r\n"
				+ "FROM post p\r\n"
				+ "JOIN comments s ON p.post_id = s.post_id\r\n"
				+ "JOIN company c2 ON s.comments_userCompany = c2.company_id\r\n"
				+ "WHERE p.post_id = ? ";		
		
		try {
			pst =con.prepareStatement(sql);
			pst.setString(1, id);
			rs  =pst.executeQuery();
			
			while( rs.next()) {  //rs => 한 행(레코드) 데이가 있음 
				String post_id  = id;
				String user_id  = rs.getString(2);
				String company  = rs.getString(1);
				String contents  = rs.getString(3);
				String date  = rs.getString(4);
				String COMMENTS_ID  = rs.getString(5);
				
				//System.out.println(date);
				
				Comment comm = new Comment( COMMENTS_ID, post_id, user_id, company, contents, date);
				
				list.add(comm);
				
								
			}	
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			dbclose(rs,pst,con);
		}
		
		return list;
		
	}
	
	int cnt_comm(String id) {
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		int count_comment = -1;
		
		String sql ="SELECT p.post_id, COUNT(s.comments_id) \r\n"
				+ "FROM post p\r\n"
				+ "JOIN comments s ON p.post_id = s.post_id\r\n"
				+ "WHERE p.post_id =  ?  \r\n"
				+ "GROUP BY p.post_id";
		
		con= dbcon();
		
		try {
			pst = con.prepareStatement(sql);
			pst.setString( 1 , id);
			rs = pst.executeQuery();
			
			if (rs.next()) {
			    String result = rs.getString(2);
			    count_comment = Integer.parseInt(result);
			}

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			dbclose(rs,pst,con);
		}
		
		
		
		
		return count_comment;
				
	}

	int insertComm(String user_id, String post_id, String contents) {
		
		Connection con = null;
		PreparedStatement pst = null;
		
		con= dbcon();
		String sql = "INSERT INTO comments (COMMENTS_ID, POST_ID, USERID, COMMENTS_USERCOMPANY, COMMENTS_CONTENTS) " +
                "VALUES ( ? , ? , ? , (SELECT company_id FROM userinfo WHERE userid = ? ), ? )";
		int rRow = 0;
		
		String COMMENTS_ID = post_id+user_id;
		
		try {
			pst= con.prepareStatement(sql);
			pst.setString(1,COMMENTS_ID);
			pst.setString(2, post_id);
			pst.setString(3, user_id);
			pst.setString(4, user_id);
			pst.setString(5, contents);
			
			rRow = pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			dbclose(pst,con);
		}
		
		
		
		return rRow;
	}
	
	int deleteComment(String comment_id) {
		
		Connection con = null;
		PreparedStatement pst = null;
		
		con = dbcon();
		int rRow= 0;
		String sql = "delete from comments where COMMENTS_ID = ? ";
		
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, comment_id);
			rRow = pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			dbclose(pst,con);
		}
		
		
		
		return rRow;
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		/*
		DBDAO_blind dao = new DBDAO_blind();
		post list = dao.selectPostDetail("240911U001");
		//System.out.println(list);
		System.out.println(list.getContents());
		*/
	}
	
	
}
