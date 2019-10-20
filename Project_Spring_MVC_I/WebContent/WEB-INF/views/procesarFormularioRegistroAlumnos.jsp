<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>Confirmación del Registro</title>
	</head>
	<body>
	
		<h2>El alumno con nombre: <strong>${elAlumno.nombre}</strong> y apellido
			<strong>${elAlumno.apellidos}</strong></h2>
			
		<p>La asigantura escogida es: <strong>${elAlumno.optativas}</strong></p>
	
	</body>
</html>