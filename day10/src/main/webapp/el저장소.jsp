<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>저장소 꺼내오는 순서</h2> 
<p> pageContext -> request -> session -> application </p>
<% pageContext.setAttribute("id", "pageContext id"); %>
<% request.setAttribute("id", "requst id"); %>
<% session.setAttribute("id", "session id"); %>
<% application.setAttribute("id", "application id"); %>

<h2>저장소에서 꺼내오기</h2>
${id}

<h4> 저장소별로 값을 꺼내기 </h4>
${ sessionScope.id}
${ requestScope.id} 
${ applicationScope.id}
${ pageScope.id}

</body>
</html>