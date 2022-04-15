<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:url value="/app/logout" var="urlLogout"></c:url>

<div>
	prijavljeni ste kao: ${sessionScope.loginUser.username}, <a href="${urlLogout}">Odjavite se</a>
</div>