package com.drbotro.spring.mvc.bbdd.hibernate;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ObtenerClienteBBDD{

    private static Log log = LogFactory.getLog(ObtenerClienteBBDD.class);

    public static void main(String[] args){

        SessionFactory miFactory = new Configuration().configure("/resources/hibernate.cfg.xml")
                .addAnnotatedClass(Cliente.class).addAnnotatedClass(DetalleCliente.class).buildSessionFactory();

        Session miSession = miFactory.openSession();

        try{
            miSession.beginTransaction();
            DetalleCliente detalleCliente = miSession.get(DetalleCliente.class, 1);

            if(detalleCliente != null && detalleCliente.getCliente() != null){
                log.info("Cliente: " + detalleCliente.getCliente());
                miSession.delete(detalleCliente);
                miSession.getTransaction().commit();
            }
            log.info("Terminado");
        }catch(Exception e){
            log.error("No conecta", e);
        }finally{
            miSession.close();
            miFactory.close();
        }

    }

}
