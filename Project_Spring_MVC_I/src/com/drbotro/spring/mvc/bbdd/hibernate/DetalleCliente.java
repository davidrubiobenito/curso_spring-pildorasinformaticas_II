package com.drbotro.spring.mvc.bbdd.hibernate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "DETALLE_CLIENTE")
public class DetalleCliente{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DETALLE_ID")
    private int id;

    @Column(name = "WEB")
    private String web;

    @Column(name = "TLFO")
    private String telefono;

    @Column(name = "COMENTARIOS")
    private String comentarios;

    @OneToOne(mappedBy = "detalleCliente", cascade = CascadeType.ALL)
    private Cliente cliente;

    public DetalleCliente(){
    }

    public DetalleCliente(String web, String telefono, String comentarios){
        this.web = web;
        this.telefono = telefono;
        this.comentarios = comentarios;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getWeb(){
        return web;
    }

    public void setWeb(String web){
        this.web = web;
    }

    public String getTelefono(){
        return telefono;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    public String getComentarios(){
        return comentarios;
    }

    public void setComentarios(String comentarios){
        this.comentarios = comentarios;
    }

    public Cliente getCliente(){
        return cliente;
    }

    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }

    @Override
    public String toString(){
        return "[id=" + id + ", web=" + web + ", telefono=" + telefono + ", comentarios=" + comentarios + "]";
    }

}
