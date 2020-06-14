package com.drbotro.spring.mvc.bbdd.hibernate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CLIENTE")
public class Cliente{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CLIENTE_ID")
    private int id;

    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "APELLIDO")
    private String apellido;

    @Column(name = "DIRECCION")
    private String direccion;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "DETALLE_ID")
    private DetalleCliente detalleCliente;

    public Cliente(){
    }

    public Cliente(String nombre, String apellido, String direccion, DetalleCliente detalleCliente){
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.detalleCliente = detalleCliente;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public String getDireccion(){
        return direccion;
    }

    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

    public DetalleCliente getDetalleCliente(){
        return detalleCliente;
    }

    public void setDetalleCliente(DetalleCliente detalleCliente){
        this.detalleCliente = detalleCliente;
    }

    @Override
    public String toString(){
        return "Cliente [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion
                + " DetalleCliente= " + detalleCliente + " ]";
    }

}
