package com.drbotro.spring.mvc.bbdd;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ConsultaBBDDCliente{

    private static Log log = LogFactory.getLog(ConsultaBBDDCliente.class);

    public static void main(String[] args){

        SessionFactory miFactory = new Configuration().configure("/resources/hibernate.cfg.xml")
                .addAnnotatedClass(Clientes.class).buildSessionFactory();

        Session miSession = miFactory.openSession();

        try{

            // comenzar la session
            miSession.beginTransaction();

            // consultaClientes
            List<Clientes> losClientes = miSession.createQuery("from Clientes").getResultList();
            // mostrar los clientes
            for(Clientes cliente : losClientes){
                log.info(cliente);
            }

            // consula filtrada
            List<Clientes> consultaFiltrada = miSession.createQuery("from Clientes c where c.apellidos='Code'")
                    .getResultList();
            log.info("------------------------------------------------");
            // mostrar los clientes
            for(Clientes cliente : consultaFiltrada){
                log.info(cliente);
            }

            List<Clientes> consultaFiltrada2 = miSession
                    .createQuery("from Clientes c where c.apellidos='Delgado' and c.direccion='Gran vía'")
                    .getResultList();
            log.info("------------------------------------------------");
            // mostrar los clientes
            for(Clientes cliente : consultaFiltrada2){
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
