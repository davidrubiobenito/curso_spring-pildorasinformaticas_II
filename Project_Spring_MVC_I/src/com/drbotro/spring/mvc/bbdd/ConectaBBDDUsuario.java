package com.drbotro.spring.mvc.bbdd;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ConectaBBDDUsuario{

    private static Log log = LogFactory.getLog(ConectaBBDDUsuario.class);

    public static void main(String[] args){

        SessionFactory miFactory = new Configuration().configure("/resources/hibernate.cfg.xml")
                .addAnnotatedClass(Usuario.class).buildSessionFactory();

        Session miSession = miFactory.openSession();

        try{
            Usuario cliente1 = new Usuario("David", "Delgado", "Gran vía");

            miSession.beginTransaction();
            miSession.save(cliente1);
            miSession.getTransaction().commit();

            log.info("Registro insertado correctamente");

            // lectura de registro
            miSession.beginTransaction();
            log.info("Lectura con registro con id: " + cliente1.getId());
            Usuario clienteInsertado = miSession.get(Usuario.class, cliente1.getId());
            log.info("Registro : " + clienteInsertado);
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
