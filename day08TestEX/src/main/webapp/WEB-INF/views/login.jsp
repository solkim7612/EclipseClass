<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<Style>
*{

padding:0px;
margin:0px;

}
.login_wrap{

width:400px; 
margin: 200px auto;
border:1px solid black;
padding:20px;

}
.info{
 
 width:350px; 
 padding:20px;
 margin:0px auto;
 

}

 

.info input{
   width:100%;
   height:40px;
   margin-top: 5px;
   border:0px;
   background-color:#CCCCCC;
   color:white;
   
 
}

.info button{
   width:100%;
   height:40px;
   margin-top: 5px;  
   border:0px;
   
 
}
</Style>
</head>
<body>
<div class="login_wrap">	
	<div class="info">
<form action="/day08TestEX/login" method="post">
아이디 : <input type="text" name="id">
비밀번호 : <input type="text" name="pw">
<button>로그인</button>
</form>
</div>
</div>


</body>
</html>