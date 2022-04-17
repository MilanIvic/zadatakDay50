<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@page isELIgnored="false"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
 <jsp:include page="/WEB-INF/pages/style.jsp" flush="true"/>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Prikaz proizvodjaca</title>
</head>
<body>
<header>
		<jsp:include page="/WEB-INF/fragment/login-user.jsp" flush="true"/>
</header>
<main>
	<h2>Podaci o proizvodjacu</h2>
	<article>
		<div>
		
			<form action="/myProject/app/proizvodjac/edit_or_delete" method="GET">
				<label>Pib</label>
				<br>
				<input type="text" name="pib" value="${pro.pib}" readonly="readonly"/>
				<br>
				<label>Maticni broj</label>
				<br>
				<input type="text" name="matBr" value="${pro.maticniBroj}" readonly="readonly"/>
				<br>
				<label>Adresa</label>
				<br>
				<input type="text" name="adress" value="${pro.adresa}" readonly="readonly"/>
				<br>
				<label>Mesto</label>
				<br>
				<input type="text" name="mesto" value="${pro.mesto}" readonly="readonly"/>
				</div>
				<div>
					<input type="submit" value="Izmeni" name="button">
					<br>
					<input type="submit" value="Obrisi" name="button">
					<br>
					<input type="submit" value="Nazad" name="button">
				</div>
			</form>
		</div>
		
	
	</article>
</main>
<footer> Copyright 2022.</footer>
</body>
</html>