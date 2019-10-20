<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>Forms MVC Tags. Formulario Registro Alumnos</title>
	</head>
	<body>
		<form:form action="procesarFormularioRegistroAlumnos" modelAttribute="elAlumno">
			Nombre: <form:input path="nombre"/>			
			<br/><br/><br/>			
			Apellidos: <form:input path="apellidos"/>			
			<br/><br/><br/>
			<input type="submit" value="Enviar"/>			
		</form:form>
	</body>
</html>