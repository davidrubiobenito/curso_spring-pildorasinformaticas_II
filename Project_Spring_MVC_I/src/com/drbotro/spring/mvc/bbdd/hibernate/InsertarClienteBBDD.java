package com.drbotro.spring.mvc.bbdd.hibernate;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class InsertarClienteBBDD{

    private static Log log = LogFactory.getLog(InsertarClienteBBDD.class);

    public static void main(String[] args){

        SessionFactory miFactory = new Configuration().configure("/resources/hibernate.cfg.xml")
                .addAnnotatedClass(Cliente.class).addAnnotatedClass(DetalleCliente.class).buildSessionFactory();

        Session miSession = miFactory.openSession();

        try{
            DetalleCliente detalleCliente1 = new DetalleCliente("davidrubiobenito.github.io", "636061885",
                    "dale un like");
            Cliente cliente1 = new Cliente("David", "Delgado", "Gran vía", detalleCliente1);

            miSession.beginTransaction();
            miSession.save(cliente1);
            miSession.getTransaction().commit();

            log.info("Registro insertado correctamente");

            // lectura de registro
            miSession.beginTransaction();
            log.info("Lectura con registro con id: " + cliente1.getId());
            Cliente clienteInsertado = miSession.get(Cliente.class, cliente1.getId());
            DetalleCliente detalleClienteInsertado = miSession.get(DetalleCliente.class, detalleCliente1.getId());
            log.info("Registro : " + clienteInsertado + " " + detalleClienteInsertado);
            miSession.getTransaction().commit();
            log.info("Terminado");

        }catch(Exception e){
            log.error("No conecta", e);
        }finally{
            miSession.close();
            miFactory.close();
        }

    }

}
