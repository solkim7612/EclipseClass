
<%@page import="blind.Comment"%>
<%@page import="java.util.ArrayList"%>
<%@page import="blind.post"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>

table{
	width: 500px;
}


</style>
</head>
<body>


<table>

<% post  postdetail = (post)request.getAttribute("postdetail"); %>

<tr>
<td colspan="2"><%= postdetail.getTitle() %></td>
</tr>

<tr>
<td><%= postdetail.getCompany() %></td>
<td><%= postdetail.getId() %></td>
</tr>

<tr>
<td colspan="2"><%= postdetail.getDate() %></td>
</tr>

<tr>
<td colspan= "2"><hr></td>
</tr>

<tr>
<td colspan="2"><%= postdetail.getContents() %></td>
</tr>

</table>

<br>
<hr>
<br>
<% int cnt_comm = (int)request.getAttribute("cnt_comm"); %>
<% String id = (String)request.getAttribute("post_id"); %>
<h3>댓글 &emsp; <%= cnt_comm %></h3>

<form action="/blind/insertComment" method="post">
	<input type ="hidden" name="post_id"  value="<%= id %>" > 
	<label for="user_Id">사용자 ID:</label>
    <input type="text" name="user_Id" required/><br><br>
    <textarea rows="3" cols="50"  name= "contents" required></textarea><br/>
	<input type="submit" value = "댓글 추가">
</form>
<br>

<table>


<% ArrayList <Comment> comm = (ArrayList <Comment>)request.getAttribute("comments"); 
for(Comment comment : comm){
%>

<tr>
<td><pre> <%= comment.getCompany() %>  -  <%= comment.getUser_id() %>			<a href="/blind/deletecomm?comm_id=<%= comment.getComment_id()%>&post_id=<%= comment.getPost_id()%>">댓글 삭제</a></pre></td>
</tr>

<tr>
<td><%= comment.getContents() %></td>
</tr>

<tr>
<td><%= comment.getDate() %></td>
</tr>

<tr>
<td><hr></td>
</tr>



<%} %>
</table>


</body>
</html>