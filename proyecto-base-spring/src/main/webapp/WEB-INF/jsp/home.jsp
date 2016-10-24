<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags" prefix="t"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
	<link rel="stylesheet" href="css/bootstrap.min.css">
	<link rel="stylesheet" href="css/index.css">
<title>Home</title>
</head>
<body>
<jsp:include page="header.jsp" />
<div class="container-fluid">

	<div class="col-md-6 mitadIzq">
		<div class="col-md-offset-2 col-md-8 formularioBuscarTorneo">
			<form:form action="#" modelAttribute="torneo">
			
			Buscar Torneo
			<br>
			Nombre del torneo
			<br>
			<form:input path="nombre"/>
			<br>
			<input type="submit" class="btn btn-success" valur="Buscar torneo">	
		
			</form:form>
		</div>
	</div>
	<div class="col-md-6 mitadDer">
		<div class="col-md-offset-3 col-md-4  formularioLogin">
			 <form:form action="home2" modelAttribute="usuario" method="post">
	
				mail
				<form:input path="mail"/>
				contraseña
				<form:input path="contraseña"/>
				<input type="submit" class="btn btn-success" value="login">
				
			</form:form>
				
		</div>
		<div class=" col-md-offset-3 col-md-9 quieroSer">
			<span class="col-md-12">Quiero ser</span> <a href="registro"><span class=" col-md-5 palabraOrganizador">organizador</span></a>
		</div>
	</div>
</div>
</body>
</html>