<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.sql.*" %>  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>



<%

String driver = "oracle.jdbc.driver.OracleDriver" ;
String url="jdbc:oracle:thin:@localhost:1521:testdb";
String user="scott";
String password="tiger";


Class.forName(driver);
Connection con =DriverManager.getConnection(url, user, password);

String sql=" SELECT "   +
    " p.post_title  HOME   , " +
   " COUNT(c.comments_id) AS  \"댓글 수\"  " +
   " FROM post p  " +
   " JOIN comments c ON p.post_id = c.post_id  " +
   " GROUP BY p.post_title ";


System.out.println( sql);


PreparedStatement  pst  =con.prepareStatement(sql);
ResultSet   rs  = pst.executeQuery();

 

while( rs.next()){
	 out.println( rs.getString(1));
}




%>



</body>
</html>