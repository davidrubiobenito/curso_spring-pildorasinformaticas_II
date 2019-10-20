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
		<form:form action="confirmarAlumno" modelAttribute="elAlumno">
			Nombre: <form:input path="nombre"/>		
				
			<br/><br/><br/>			
			
			Apellidos: <form:input path="apellidos"/>	
					
			<br/><br/><br/>
			
			Asignaturas optativas: <br/>
			<form:select path="optativas" multiple="true">
				<form:option value="Dise�o" label="Dise�o"></form:option>
				<form:option value="Karate" label="Karate"></form:option>
				<form:option value="Comercio" label="Comercio"></form:option>
				<form:option value="Danza" label="Danza"></form:option>
			</form:select>
			
			<br/><br/><br/>
			
			Barcelona: <form:radiobutton path="ciudadEstudios" value="Barcelona"/>
			Madrid: <form:radiobutton path="ciudadEstudios" value="Madrid"/>
			Valencia: <form:radiobutton path="ciudadEstudios" value="Madrid"/>
			
			<br/><br/><br/>
						
			Ingl�s <form:checkbox path="idiomasAlumno" value="Ingl�s"/>
			Franc�s <form:checkbox path="idiomasAlumno" value="Franc�s"/>
			Aleman <form:checkbox path="idiomasAlumno" value="Alem�n"/>
			Chino <form:checkbox path="idiomasAlumno" value="Chino"/>
			
			<br/><br/><br/>		
			
			<input type="submit" value="Enviar"/>			
		</form:form>
	</body>
</html>