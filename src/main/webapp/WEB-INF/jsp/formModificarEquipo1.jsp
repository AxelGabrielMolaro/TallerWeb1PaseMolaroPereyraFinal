<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@taglib uri="http://www.springframework.org/tags" prefix="t"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>M EQUIPO1</title>
</head>
<body>
	<form:form action="modificarEquipo2" method="POST" modelAttribute="equipo">
		
		<form:select path="nombre">
			
			
			<c:forEach var="list" items="${listaDeEquipos}">
				<form:option value="${list.getNombre()}">${list.getNombre()}</form:option>
			</c:forEach>
			
			
				
		</form:select>
		<input type="submit" value="selecionar">	
	</form:form>
</body>
</html>