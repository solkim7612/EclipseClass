<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<style>
.content{
width: 200px;
border: 1px solid;
margin: 0 auto;
padding: 10px;
}

</style>


<body>

<h2>구구단</h2>

<%  String result  =  (String) request.getAttribute("result"); %>
<div class="content">

<%= result %>
</div>

</body>
</html>