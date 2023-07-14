<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />
<c:set value="20230714-017" var="version" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="${rootPath}/static/css/home.css?${version}" rel="stylesheet">
<link href="${rootPath}/static/css/insert.css?${version}"
	rel="stylesheet">
<script>
	// JSP 에서 사용하는 rootPath 변수를 
	// JS 코드에서 사용하기 위한 rootPath 변수로 재설정
	var rootPath = "${rootPath}"
</script>
<script src="${rootPath}/static/js/list.js?${version}"></script>
</head>
<body>
	<header>
		<h1>MY CAR MANAGE</h1>
	</header>
	<section>
		<c:if test="${empty BODY}">
			<%@ include file="/WEB-INF/views/insert.jsp"%>
		</c:if>
		<c:if test="${BODY == 'UPDATE'}">
			<%@ include file="/WEB-INF/views/update.jsp"%>
		</c:if>
	</section>
</body>
</html>