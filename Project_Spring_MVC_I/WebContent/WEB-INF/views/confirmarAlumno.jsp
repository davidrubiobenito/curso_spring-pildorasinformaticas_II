<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>Confirmaci�n del Registro</title>
	</head>
	<body>
	
		<p>El alumno con nombre: <strong>${elAlumno.nombre}</strong> y apellido
			<strong>${elAlumno.apellidos}</strong></p>
			
		<p>La asigantura escogida es: <strong>${elAlumno.optativas}</strong></p>
		
		<p>La ciudad deonde iniciar� los estudios el alumno: <strong>${elAlumno.ciudadEstudios}</strong></p>
		
		<p>Los idiomas escogidos por el alumno son: <strong>${elAlumno.idiomasAlumno}</strong></p>
	
	</body>
</html>