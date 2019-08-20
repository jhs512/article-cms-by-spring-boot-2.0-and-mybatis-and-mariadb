<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>커뮤니티 사이트 - 게시물 리스트</title>
</head>
<body>
	<h1>게시물 리스트</h1>

	<h2>v2</h2>

	<c:forEach items="${list}" var="article">
		<section>번호 : ${article.id}, 제목 : ${article.title}</section>
		<hr>
	</c:forEach>
</body>
</html>