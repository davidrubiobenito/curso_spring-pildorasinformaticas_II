package com.drbotro.spring.mvc.bbdd;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ConsultaBBDDUsuario{

    private static Log log = LogFactory.getLog(ConsultaBBDDUsuario.class);

    public static void main(String[] args){

        SessionFactory miFactory = new Configuration().configure("/resources/hibernate.cfg.xml")
                .addAnnotatedClass(Usuario.class).buildSessionFactory();

        Session miSession = miFactory.openSession();

        try{

            // comenzar la session
            miSession.beginTransaction();

            // consultaClientes
            List<Usuario> losClientes = miSession.createQuery("from Usuario").getResultList();
            // mostrar los clientes
            for(Usuario cliente : losClientes){
                log.info(cliente);
            }

            // consula filtrada
            List<Usuario> consultaFiltrada = miSession.createQuery("from Usuario c where c.apellido='Code'")
                    .getResultList();
            log.info("------------------------------------------------");
            // mostrar los clientes
            for(Usuario cliente : consultaFiltrada){
                log.info(cliente);
            }

            List<Usuario> consultaFiltrada2 = miSession
                    .createQuery("from Usuario c where c.apellido='Delgado' and c.direccion='Gran vía'")
                    .getResultList();
            log.info("------------------------------------------------");
            // mostrar los clientes
            for(Usuario cliente : consultaFiltrada2){
                log.info(cliente);
            }

            // commit
            miSession.getTransaction().commit();

        }catch(Exception e){
            log.error("No conecta", e);
        }finally{
            miSession.close();
            miFactory.close();
        }

    }

}
