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

	<link rel="stylesheet" href="css/formularioRegistro.css">
		
		<!-- java scipst -->
	<script type="text/javascript" src="js/validarFormularios.js"></script>

<title>Iformulario de registro1</title>
</head>
<body>
<jsp:include page="header.jsp" />
<div class="col-md-offset-3 col-md-6">
	<form:form action="loginFormularioLogin" name="registroForm" id="registroForm" modelAttribute="usuario" class="col-md-12 formularioRegistro" >
		
		Nombre
		<form:input id="nombre2" path="nombre" onblur="validarTexto('nombre2')" />
		Apellido
		<form:input path="apellido" onblur="validarTexto('apellido')" />
		Mail
		<form:input path="mail" onblur="validarTexto('mail')"/>
		Contraseña
		
		<form:input path="contraseña" onblur="validarTexto('contraseña')"/>
		
		Repetir contraseña(falta para validar con js)
		<input id="contraseña2" onblur="validarTexto('contraseña2')" >
		
		<input type="submit"  class="btn btn-success"  value="Registrarse" onclick="enviarFormularioRegistro()">
		
	</form:form>
</div>

</body>
</html>