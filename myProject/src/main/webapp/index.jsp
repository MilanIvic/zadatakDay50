<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="/WEB-INF/pages/style.jsp" flush="true"/>
<html>
<body>

<main>
	<h2>Dobro dosli</h2>
	<div id="link">
		<c:url value="/app/login" var="urlLogin"/>
		<a href="${urlLogin}">Prijavi se</a>
	</div>
</main>
</body>
</html>
