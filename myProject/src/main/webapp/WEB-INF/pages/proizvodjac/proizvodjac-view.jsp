<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@page isELIgnored="false"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Prikaz proizvodjaca</title>
</head>
<body>
	<h2>Podaci o proizvodjacu</h2>
	<article>
		<div>
			<form action="/myProject/app/proizvodjac/edit_or_delete" method="GET">
				<label>Pib</label>
				<input type="number" name="pib" value="${pro.pib}" readonly="readonly"/>
				<br>
				<label>Maticni broj</label>
				<input type="text" name="matBr" value="${pro.maticniBroj}" readonly="readonly"/>
				<br>
				<label>Adresa</label>
				<input type="text" name="adress" value="${pro.adresa}" readonly="readonly"/>
				<br>
				<label>Mesto</label>
				<input type="text" name="mesto" value="${pro.mesto}" readonly="readonly"/>
				<div>
					<input type="submit" value="Izmeni" name="button">
				
					<input type="submit" value="Obrisi" name="button">
				
					<input type="submit" value="Nazad" name="button">
				</div>
			</form>
		</div>
		
	
	</article>

</body>
</html>