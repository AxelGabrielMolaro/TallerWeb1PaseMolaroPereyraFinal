<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@taglib uri="http://www.springframework.org/tags" prefix="t"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Iformulario de registro1</title>
</head>
<body>
	<form:form action="loginFormularioLogin" modelAttribute="usuario" >
		
		nombre
		<form:input path="nombre"/>
		apellido
		<form:input path="apellido"/>
		mail
		<form:input path="mail"/>
		contraseņa
		
		<form:input path="contraseņa"/>
		<input type="submit">
		("agregar contra 2")
	</form:form>
</body>
</html>