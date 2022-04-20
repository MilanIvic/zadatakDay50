<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="/WEB-INF/pages/style.jsp" flush="true"/>
<html>
<body>

<main>
	<div class="gradient">
		<h2>Dobro došli</h2>
		<div id="link">
			<c:url value="/app/login" var="urlLogin"/>
			<a href="${urlLogin}">Prijavi se</a>
		</div>
	</div>
</main>
</body>
</html>
