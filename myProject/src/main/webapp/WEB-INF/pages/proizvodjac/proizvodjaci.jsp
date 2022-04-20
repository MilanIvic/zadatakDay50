<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="/WEB-INF/pages/style.jsp" flush="true"/>
<html>
<body>
	<header>
		<jsp:include page="/WEB-INF/fragment/login-user.jsp" flush="true"/>
	</header>
	<main>
		<div class="gradient">
			<h2>Svi proizvodjači</h2>
				<table>
					<thead>
						<tr>
							<th>PIB</th>
							<th>Matični broj</th>
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
								<td><a href="/myProject/app/proizvodjac/view?pib=${pro.pib}">Prikaži</a></td>
							</tr>
						</c:forEach>	
					</tbody>
				</table>
				<c:url value="/app/proizvodjac/add" var="proAdd"/>
				<a href="${proAdd}">Dodaj proizvodjača</a>
		</div>
</main>
<footer> Copyright 2022.</footer>
</body>
</html>