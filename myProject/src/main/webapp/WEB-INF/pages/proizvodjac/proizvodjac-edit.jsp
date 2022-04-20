<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@page isELIgnored="false"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Izmena proizvodjaca</title>
<jsp:include page="/WEB-INF/pages/style.jsp" flush="true"/>
</head>
<body>
<header>
		<jsp:include page="/WEB-INF/fragment/login-user.jsp" flush="true"/>
</header>
<main>
	<div class="gradient">
		<h2>Unesite promene</h2>
		<article>
			<div>
				<c:url var="link" value="/app//proizvodjac"></c:url>
			
				<form action="${link}" method="POST">
					<label>pib</label>
					<br>
					<input type="text" name="pib" value="${pro.pib}" readonly="readonly"/>
					<br>
					<label>Matični broj</label>
					<br>
					<input type="text" name="matBr" value="${pro.maticniBroj}"/>
					<br>
					<label>Adresa</label>
					<br>
					<input type="text" name="adress" value="${pro.adresa}"/>
					<br>
					<label>Mesto</label>
					<br>
					<select name="mesto">
						<c:forEach items = "${mesta}" var = "m">
							<option value="${m.pttBroj} ${m.naziv}" name="mesto">${m.pttBroj} ${m.naziv}</option>
						</c:forEach>
					</select>
					<div>
						<input type="submit" value="Potvrdi" name="buttonConf">
					</div>
						</form>
							<form action="${link}" method="GET">	
							<input type="submit" value="Odustani" name="buttonConf">
						</form>	
			</div>
		</article>
	</div>
</main>
<footer> Copyright 2022.</footer>
</body>
</html>