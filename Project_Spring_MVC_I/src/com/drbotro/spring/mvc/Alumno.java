package com.drbotro.spring.mvc;

public class Alumno{

    private String nombre;
    private String apellidos;

    private Alumno(Builder builder){
        this.nombre = builder.nombre;
        this.apellidos = builder.apellidos;
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

    public static Builder builder(){
        return new Builder();
    }

    public static final class Builder{
        private String nombre;
        private String apellidos;

        private Builder(){
        }

        public Builder withNombre(String nombre){
            this.nombre = nombre;
            return this;
        }

        public Builder withApellidos(String apellidos){
            this.apellidos = apellidos;
            return this;
        }

        public Alumno build(){
            return new Alumno(this);
        }
    }

}
