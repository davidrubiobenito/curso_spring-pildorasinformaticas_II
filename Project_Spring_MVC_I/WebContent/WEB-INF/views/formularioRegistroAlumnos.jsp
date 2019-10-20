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
			Asignaturas optativas: <br/>
			<form:select path="optativas" multiple="true">
				<form:option value="Diseño" label="Diseño"></form:option>
				<form:option value="Karate" label="Karate"></form:option>
				<form:option value="Comercio" label="Comercio"></form:option>
				<form:option value="Danza" label="Danza"></form:option>
			</form:select>
			<br/><br/><br/>
			<input type="submit" value="Enviar"/>			
		</form:form>
	</body>
</html>