<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@taglib uri="http://www.springframework.org/tags" prefix="t"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>login</title>
</head>
<body>
usuarios registrados
<br>

<c:forEach var="list" items="${listaDeUsuarios}">
	
	
	
	${list.getNombre()}
	<br>
	
	${list.getApellido()}
	<br>
	
	${list.getContrase�a()}
	<br>
	
	
	${list.getMail()}
	<br>

</c:forEach>

<br>
 <form:form action="validacionPrueba" modelAttribute="usuario" method="post">
	
	mail
	<form:input path="mail"/>
	contrase�a
	<form:input path="contrase�a"/>
	<input type="submit" value="login">
	
</form:form>
</body>
</html>