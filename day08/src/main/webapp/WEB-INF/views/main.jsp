<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<% 
String id=(String) session.getAttribute("loginId");
%>
<% if (id==null){%>
<a href="/day08/loginex">로그인</a>
<%} else{ %>
<%= id %>님 반갑습니다 
<a href="/day08/logoutex">로그아웃 </a>
<%} %>
<a href="/day08/orderex">주문하기</a>

</body>
</html>