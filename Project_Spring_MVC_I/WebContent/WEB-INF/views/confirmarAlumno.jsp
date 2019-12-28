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
	
		<p>El alumno con nombre <strong>${elAlumno.nombre}</strong>, apellido <strong>${elAlumno.apellidos}</strong>, edad <strong>${elAlumno.edad}</strong> 
		, email <strong>${elAlumno.email}</strong> y código postal <strong>${elAlumno.codigoPostal}</strong> se ha registrado con éxito.</p> 
			
		<p>La asigantura escogida es: <strong>${elAlumno.optativas}</strong></p>
		
		<p>La ciudad deonde iniciará los estudios el alumno: <strong>${elAlumno.ciudadEstudios}</strong></p>
		
		<p>Los idiomas escogidos por el alumno son: <strong>${elAlumno.idiomasAlumno}</strong></p>
	
	</body>
</html>