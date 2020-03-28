package com.drbotro.spring.mvc.bbdd;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ConectaBBDDCliente{

    private static Log log = LogFactory.getLog(ConectaBBDDCliente.class);

    public static void main(String[] args){

        SessionFactory miFactory = new Configuration().configure("/resources/hibernate.cfg.xml")
                .addAnnotatedClass(Clientes.class).buildSessionFactory();

        Session miSession = miFactory.openSession();

        try{
            Clientes cliente1 = new Clientes("David", "Rubio", "Gran vía");

            miSession.beginTransaction();
            miSession.save(cliente1);
            miSession.getTransaction().commit();

            log.info("Registro insertado correctamente");

        }catch(Exception e){
            log.error("No conecta", e);
        }finally{
            miSession.close();
            miFactory.close();
        }

    }

}
