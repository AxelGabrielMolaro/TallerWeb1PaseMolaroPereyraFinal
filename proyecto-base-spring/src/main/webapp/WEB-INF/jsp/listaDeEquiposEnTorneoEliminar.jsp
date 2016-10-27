<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@taglib uri="http://www.springframework.org/tags" prefix="t"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LISTA DE EQUIPOS EN TORNEO2</title>
</head>
<body>
	<div class="container-fluid">
		<div class="col-md-6 col-md-offset-3">
			<table class="table condensed">
			<thead>Torneo ="${nombreTorneo}"</thead>
			<th>Equipo</th>
			
			
			<c:forEach var="list" items="${listaDeEquipos}"> 
				<tr>
					<td>${list.getNombre()} <a href="equipo/${list.getNombre()}">Ver Equipo</a> <a href="${list.getNombre()}">Eliminar Equipo</a></td>
				
				
				
				
				</tr>
			</c:forEach>
			
	</table>
		</div>
		
	</div>
	<a href="agregarEquipo">agregarEquipo</a>
	<!-- <a href="modificarEquipo" ><input type="button"  value="modificarUnEquipo"></a>  -->
	
	
</body>
</html>