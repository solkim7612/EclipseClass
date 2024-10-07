<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        body{text-align: center;}
    </style>
</head>
<body>
    <h1>기본 구조를 가진 표</h1><hr>
    <section>1학기 성적</section>
    <table border="1">
    <thead>
        <tr><th>이름</th><th>HTML</th><th>CSS</th></tr>
    </thead>
    <tbody>
        <tr><td>황기태</td><td>80</td><td>70</td></tr>
        <tr><td>이재문</td><td>95</td><td>99</td></tr>
        <tr><td>이병은</td><td>40</td><td>61</td></tr>
    </tbody>
    <tfoot>
        <tr><th>합</th><th>225</th><th>230</th> </tr>
    </tfoot>
</table>
</body>
</html>