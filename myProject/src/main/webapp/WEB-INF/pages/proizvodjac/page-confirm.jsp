<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@page isELIgnored="false"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
 <jsp:include page="/WEB-INF/pages/style.jsp" flush="true"/>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Confirm</title>
</head>
<body>
<header>
		<jsp:include page="/WEB-INF/fragment/login-user.jsp" flush="true"/>
</header>
<main>
	<div class="gradient">
		<h2>Da li zelite da uklonite proizvodjaca?</h2>
		<article>
			<div>
				<form action="/myProject/app/proizvodjac/delete" method="GET">
					<label>Pib</label>
					<br>
					<input type="text" name="pib" value="${pro.pib}" readonly="readonly"/>
					<br>
					<label>Matični broj</label>
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
			
					<div>
						<input type="submit" value="Da" name="button">
						<br>
						<input type="submit" value="Ne" name="button">
					</div>
				</form>
			</div>
		</article>
	</div>
</main>
<footer> Copyright 2022.</footer>
</body>
</html>