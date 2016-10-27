<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@taglib uri="http://www.springframework.org/tags" prefix="t"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>login formulario</title>
</head>
<body>
<h1>login</h1>
<form:form action="login2" method="post" modelAttribute="usuario">
	mail("ingresa axel por es beta")<form:input path="mail"/>
	contraseña("ingresa oro por es beta")<form:input path="contraseña"/>
	<input type="submit" value="logear">
</form:form>

</body>
</html>