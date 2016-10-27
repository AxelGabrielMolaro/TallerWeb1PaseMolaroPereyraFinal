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
	<link rel="stylesheet" type="text/css" href="css/a.css"/>
<title>Insert title here</title>
</head>
<body>
<<<<<<< HEAD
		
		
	<div class="container-fluid tablaEquipos">
		<div class="col-md-12 ">
			<table class="table ">
			<thead>Torneo ="${nombreTorneo}"</thead>
=======
	<div class="container-fluid">
		<div class="col-md-6 col-md-offset-3">
			<table class="table condensed">
			
>>>>>>> refs/remotes/origin/master
			<th>Equipo</th>
			
			
			<c:forEach var="list" items="${listaDeEquipos}"> 
				<tr>
					<td>${list.getNombre()} <a href="equipo/${list.getNombre()}">Ver Equipo</a> <a href="${list.getNombre()}">Eliminar Equipo</a></td>
				
				<!-- adaddssa s-->
				
				
				</tr>
			</c:forEach>
			
	</table>
		</div>
		
	</div>
<<<<<<< HEAD
	<a href="${nombreTorneo}/agregarEquipo">agregarEquipo</a>
=======
	<a href="agregarEquipo"><input class="btn btn-success" type="button" value="Agregar otro equipo al torneo"></a>
>>>>>>> refs/remotes/origin/master
	<!-- <a href="modificarEquipo" ><input type="button"  value="modificarUnEquipo"></a>  -->
	
	
</body>
</html>