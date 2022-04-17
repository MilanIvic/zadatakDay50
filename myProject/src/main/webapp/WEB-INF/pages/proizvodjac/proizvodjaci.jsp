<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="/WEB-INF/pages/style.jsp" flush="true"/>
<html>
<body>
<header>
		<jsp:include page="/WEB-INF/fragment/login-user.jsp" flush="true"/>
	</header>
	<main>
	<h2>Svi proizvodjaci</h2>
	<article>
		<div>
			<table>
				<thead>
					<tr>
						<th>PIB</th>
						<th>Maticni broj</th>
						<th>Adresa</th>
						<th>Mesto</th>
						<th>Detalji</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${proizvodjaci}" var="pro">
						<tr>
							<td>${pro.pib}</td>
							<td>${pro.maticniBroj}</td>
							<td>${pro.adresa}</td>
							<td>${pro.mesto}</td>
							<td><a href="/myProject/app/proizvodjac/view?pib=${pro.pib}">Prikazi</a></td>
						</tr>
					</c:forEach>	
				</tbody>
			
			</table>
		</div>
		<c:url value="/app/proizvodjac/add" var="proAdd"/>
		<a href="${proAdd}">Dodaj proizvodjaca</a>
	</article>
</main>
<footer> Copyright 2022.</footer>
</body>
</html>