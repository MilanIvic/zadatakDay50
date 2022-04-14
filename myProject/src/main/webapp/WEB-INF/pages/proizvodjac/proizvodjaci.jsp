<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<body>
	
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
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${proizvodjaci}" var="pro">
						<tr>
							<td>${pro.pib}</td>
							<td>${pro.maticniBroj}</td>
							<td>${pro.adresa}</td>
							<td>${pro.mesto}</td>
						</tr>
					</c:forEach>	
				</tbody>
			
			</table>
		</div>
	</article>
</body>
</html>