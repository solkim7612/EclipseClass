<%@page import="blind.bestTopic"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<table>
<tr>
<td>토픽베스트 5</td>
<td>댓글 수</td>
</tr>

<% ArrayList<bestTopic> BT = (ArrayList<bestTopic>)request.getAttribute("list"); 
for(bestTopic bt : BT){
%>

<tr>
<td><a href = "/blind/blindpost?id=<%= bt.getId() %>"><%= bt.getTitle() %></a></td>
<td><%= bt.getCnt_comment() %></td>
</tr>
<%} %>

</table>



</body>
</html>