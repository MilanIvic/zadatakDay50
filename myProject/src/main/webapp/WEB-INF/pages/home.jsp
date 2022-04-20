<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:url value="/app/proizvodjac" var="pro"/>
<jsp:include page="/WEB-INF/pages/style.jsp" flush="true"/>
<html>
<body>
	<header>
		<jsp:include page="/WEB-INF/fragment/login-user.jsp" flush="true"/>
	</header>
	<main>
		<div class="gradient">
			<h2>Dobro došli, uspešno ste se prijavili na aplikaciju</h2>
			<article>
			<div>
				<nav>
					<a href="${pro}">Prikaži sve proizvodjače</a>
				</nav>
			</div>
			</article>
		</div>
	</main>
	
	<footer> Copyright 2022.</footer>
</body>
</html>
