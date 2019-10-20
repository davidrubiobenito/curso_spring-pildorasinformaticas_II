package com.drbotro.spring.mvc;

public class Alumno{

    private String nombre;
    private String apellidos;
    private String optativas;
    private String ciudadEstudios;
    private String idiomasAlumno;

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

}
