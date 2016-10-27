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
		<div class="row">
			<div class="col-md-6 col-sm-6 col-xm-12 ">
				<form:form action="buscar" modelAttribute="torneo">
				<div class="form-group">
					<form:label path="nombre"> Nombre del torneo</form:label>
					<form:input class="form-control" placeholder="Buscar" path="nombre"/>
					<div class="form-group">
						<input class="btn btn-warning" type="submit" value="Buscar">
					</div>
				</div>
				</form:form>
			</div>
			<div class="col-md-6 col-sm-6 col-xm-12">
				<form:form action="home2" modelAttribute="usuario" method="post">
					<div class="form-group">
						<form:label path="mail"> Correo</form:label>
						<form:input placeholder="Correo" class="form-control" path="mail"/>
					</div>
					<div class="form-group">
						<form:label path="mail"> Contraseña</form:label>
						<form:input  placeholder="Contraseña" class="form-control" path="contraseña"/>
					</div>
					<div class="form-group">
						<input type="submit" class="btn btn-success" value="Entrar">
					</div>
					<div class="form-group">
<<<<<<< HEAD
						<a href="registro"><input type="button" class="btn btn-warning"  class="btn btn-success" value="Quiero ser organizador"></a>
=======
						<input type="submit" class="btn btn-warning" href="registro" class="btn btn-success" value="Quiero ser organizador">
>>>>>>> refs/remotes/origin/master
					</div>
					
				</form:form>
			</div>
		</div>
		
	</div>
</body>
</html>