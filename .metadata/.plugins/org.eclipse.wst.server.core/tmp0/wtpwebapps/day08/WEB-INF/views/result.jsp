<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<h2> 설문결과</h2>

<%
// 세션에 저장한 데이터 꺼내오기 

String servey1  =(String) session.getAttribute("servey1");
String servey2  =(String) session.getAttribute("servey2");

%>


<p>당신이 좋아하는 꽃   :     <%= servey1 %>   </p>
<p>당신이 좋아하는 동물  :     <%= servey2 %> </p> 


</body>
</html>