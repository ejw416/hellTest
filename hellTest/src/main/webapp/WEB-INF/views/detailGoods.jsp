<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>상품상세</h2>
	<hr>
	상품번호 : ${g.no }<br>
	상품명 : ${g.name }<br>
	가격 : ${g.price }<br>
	수량 : ${g.qty }<br>
	파일명 : <img src="./image/${g.fname }">
	<hr>
</body>
</html>