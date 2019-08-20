<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.*"%>
<%@ page import="com.sbs.starter.dto.Article"%>
<%
	List<Article> list = (List<Article>) request.getAttribute("list");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>커뮤니티 사이트 - 게시물 리스트</title>
</head>
<body>
	<h1>게시물 리스트</h1>

	<h2>v1</h2>

	<%
		for (int i = 0; i < list.size(); i++) {
	%>
	<%
		Article article = list.get(i);
	%>
	<section>
		번호 :
		<%=article.getId()%>, 제목 :
		<%=article.getTitle()%>
	</section>
	<hr>
	<%
		}
	%>

	<h2>v2</h2>

	<c:forEach items="${list}" var="article">
		<section>
			번호 :
			${article.id}, 제목 :
			${article.title}
		</section>
		<hr>
	</c:forEach>
</body>
</html>