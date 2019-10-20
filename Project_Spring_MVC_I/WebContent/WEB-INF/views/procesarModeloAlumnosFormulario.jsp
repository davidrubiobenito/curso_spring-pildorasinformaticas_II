<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Respuesta Formulario Alumnos</title>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/asserts/css/miestilo.css">
	</head>
	<body>
	
		<h2>Hola ${param.nombreAlumno}. Bienvenido al curso de Spring.</h2> 
		
		<h2>Atención a todos</h2>
		<p>${mensajeClaro}</p>
		<img alt="foto" src="${pageContext.request.contextPath}/asserts/imgs/logoori.png">
	
	</body>
</html>