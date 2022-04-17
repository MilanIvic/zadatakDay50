<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@page isELIgnored="false"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dodaj proizvodjaca</title>
<jsp:include page="/WEB-INF/pages/style.jsp" flush="true"/>
</head>
<body>
<header>
		<jsp:include page="/WEB-INF/fragment/login-user.jsp" flush="true"/>
</header>
<main>
	<h2>Unesite podatke</h2>
	<article>
		<div>
			<c:url var="link" value="/app//proizvodjac"></c:url>
			
			<form action="${link}" method="POST">
				<label>pib</label>
				<br>
				<input type="text" name="pib" placeholder = "pib"/>
				<br>
				<label>Maticni broj</label>
				<br>
				<input type="text" name="matBr" placeholder="maticni broj"/>
				<br>
				<label>Adresa</label>
				<br>
				<input type="text" name="adress" placeholder = "adresa"/>
				<br>
				<label>Mesto</label>
				<br>
				<select name="mesto">
					<c:forEach items = "${mesta}" var = "m">
						<option value="${m.pttBroj}" name="mesto">${m.pttBroj} ${m.naziv}</option>
					</c:forEach>
				</select>
		
				<div>
					<input type="submit" value="Potvrdi" name="buttonConf">
				</div>
			</form>
			<form action="${link}" method="GET">	
				<div>
					<input type="submit" value="Odustani" name="buttonConf">
				</div>
			</form>	
		</div>
		
	
	</article>
</main>
<footer> Copyright 2022.</footer>
</body>
</html>