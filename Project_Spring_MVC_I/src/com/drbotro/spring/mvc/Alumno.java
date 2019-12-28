package com.drbotro.spring.mvc;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Alumno{

    @NotNull
    @Size(min = 2, message = "Campo requerido")
    private String nombre;
    private String apellidos;
    @Min(value = 10, message = "No se permiten edades menores de 10")
    @Max(value = 100, message = "No se permiten edades menores de 100")
    private int edad;
    @NotNull
    @Email
    private String email;
    private String optativas;
    private String ciudadEstudios;
    private String idiomasAlumno;
    @Pattern(regexp = "[0-9]{5}", message = "Sólo 5 valores numéricos")
    private String codigoPostal;

    public Alumno(){
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellidos(){
        return apellidos;
    }

    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }

    public String getOptativas(){
        return optativas;
    }

    public void setOptativas(String optativas){
        this.optativas = optativas;
    }

    public String getCiudadEstudios(){
        return ciudadEstudios;
    }

    public void setCiudadEstudios(String ciudadEstudios){
        this.ciudadEstudios = ciudadEstudios;
    }

    public String getIdiomasAlumno(){
        return idiomasAlumno;
    }

    public void setIdiomasAlumno(String idiomasAlumno){
        this.idiomasAlumno = idiomasAlumno;
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getCodigoPostal(){
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal){
        this.codigoPostal = codigoPostal;
    }

}
