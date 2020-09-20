package com.drbotro.spring.mvc.bbdd.hibernate;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EliminarDetalleClienteBBDD{

    private static Log log = LogFactory.getLog(EliminarDetalleClienteBBDD.class);

    public static void main(String[] args){

        SessionFactory miFactory = new Configuration().configure("/resources/hibernate.cfg.xml")
                .addAnnotatedClass(Cliente.class).addAnnotatedClass(DetalleCliente.class).buildSessionFactory();

        Session miSession = miFactory.openSession();

        try{
            miSession.beginTransaction();
            DetalleCliente detalleDelClienteEliminar = miSession.get(DetalleCliente.class, 2);

            if(detalleDelClienteEliminar != null){

                detalleDelClienteEliminar.getCliente().setDetalleCliente(null);

                miSession.delete(detalleDelClienteEliminar);
                miSession.getTransaction().commit();
                log.info("Registro eliminado correctamente");
            }
        }catch(Exception e){
            log.error("No conecta", e);
        }finally{
            miSession.close();
            miFactory.close();
        }

    }

}
