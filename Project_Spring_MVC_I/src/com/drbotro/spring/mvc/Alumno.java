package com.drbotro.spring.mvc;

public class Alumno{

    private String nombre;
    private String apellidos;

    public Alumno(){
        super();
    }

    public Alumno(String nombre, String apellidos){
        super();
        this.nombre = nombre;
        this.apellidos = apellidos;
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

}
