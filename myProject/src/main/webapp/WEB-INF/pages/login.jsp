<html>
<head>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
</head>
<jsp:include page="/WEB-INF/pages/style.jsp" flush="true"/>

<body>
	
	<main>
	<div class="gradient">
	<div class="container">
		<h3>Prijavite se na nasu aplikaciju</h3>
		<form action="/myProject/app/login" method="post">
			<div>
				${error_message}
			</div>
			
			username:
			<div>
				<input type="text" name="username" value="" placeholder = "Enter username">
			</div>
			
			password:
			<div>
				<input type="password" name="password" value="" placeholder = "Enter password">
			</div>
			
			
			<div>
				<input type="submit" name="login" value="Prijavi se">
			</div>
		</form>
	</div>
	</div>
	</main>
	
	
</body>
</html>
