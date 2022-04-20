<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:url value="/app/logout" var="urlLogout"></c:url>

<div>
	prijavljeni ste kao: ${sessionScope.loginUser.username}, 
	<a href="/myProject/app/proizvodjac">Prikaži proizvođače</a>
	<a href="/myProject/app/proizvodjac/add">Dodaj proizvođača</a>
	<a href="${urlLogout}">Odjavite se</a>
</div>