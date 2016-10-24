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




<div class="container-fluid contenido col-md-12">





<div class="menu col-md-offset-4  col-md-8">
 	<ul>
 		<a href=""><li>Buscar torneo </li></a>
 		<a href="usuarioRegistrado/listaDeTorneos"><li>Administrar torneo </li></a>
 		<a href="miPerfil"><li>Ver Pefil </li></a>
 		<a href="index"><li>Salir </li></a>
 	</ul>
</div>

       
	<div class="usuarioLoguiado col-md-offset-5 col-md-7 " >
		
		<div class="personita col-md-12">
			<img alt="imagen de persona" src="http://ccs.infospace.com/ClickHandler.ashx?encp=ld%3d20161024%26app%3d1%26c%3dairziphosted%26s%3dairzip%26rc%3dAirziphosted%26dc%3d%26euip%3d179.40.178.242%26pvaid%3dae314e23d2334b96949d1b0cf76c20a7%26dt%3dDesktop%26fct.uid%3d51b1ed7eed7e4dd7a6a27613a4f8a9ea%26en%3dL3uXZvn7lGF%252bJ7ci1QCbRRmYxNKoXGrwRc4%252bRpZGyqXHcwwvo6YaTffPQ7suqrf9%26ru%3dhttps%253a%252f%252fbahiaespectaculos.files.wordpress.com%252f2014%252f11%252fsilueta.png%26coi%3d772%26npp%3d9%26p%3d0%26pp%3d0%26mid%3d9%26ep%3d9%26du%3dhttps%253a%252f%252fbahiaespectaculos.files.wordpress.com%252f2014%252f11%252fsilueta.png%26hash%3dB1307DE9C075E05C20A6638A6A1557AC&ap=9&cop=main-title">
		</div>
		<div class="datos col-md-5">
			Usuario: ${m}
		
		</div>	
	</div>
	
</div>

</body>
</html>