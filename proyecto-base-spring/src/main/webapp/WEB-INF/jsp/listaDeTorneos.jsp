<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags" prefix="t"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
 <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">
    <title>Lista de Torneos</title>
    <link rel="stylesheet" href="../css/bootstrap.min.css"></head>
<body >
<jsp:include page="headerLogeado.jsp" />
<div class="container-fluid"> 
	<div class="col-md-6 col-md-offset-3">
	<div class="col-md-offset-3 col-md-8">
		<h2>Lista de torneos<small>Aqui se veran los torneos del usuario</small></h2>
		<table class="table table-striped col-md-6">
			<tr>
				<th>Nombre </th>
			</tr>
		
			<c:forEach var="list" items="${listaDeTorneos}">
				<tr>
					<td>${list.getNombre()}</td>
					<td>
					<a href="${list.getNombre()}">eliminar</a>
					</td>
					
				</tr>
				
			</c:forEach>
		</table>	
	
		</div>
  
</div>
		<br>
		
			<a href="agregarTorneo" class="btn btn-warning btn-sm">Agregar torneo</a> 
</div>

			
		
		
	
		
	
	

<!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js" ></script>
    <script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
    <script src="js/bootstrap.min.js" type="text/javascript"></script>

    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js" ></script>
    <script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
    <script src="js/bootstrap.min.js" type="text/javascript"></script>

</body>
</html>