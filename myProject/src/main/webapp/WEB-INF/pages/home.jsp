<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:url value="/app/proizvodjac" var="pro"/>
<html>
<body>
	
	<main>
		<h2>Dobro dosli, uspesno ste se prijavili na aplikaciju</h2>
		<article>
			<div>
				<nav>
					<a href="${pro}">Prikazi sve proizvodjace</a>
				</nav>
			</div>
		</article>
	</main>
	
	<footer> Copyright 2022.</footer>
</body>
</html>
