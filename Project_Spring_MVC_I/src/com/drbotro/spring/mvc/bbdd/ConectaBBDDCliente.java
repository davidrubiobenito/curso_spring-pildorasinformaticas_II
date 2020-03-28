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
            Clientes cliente1 = new Clientes("David", "Delgado", "Gran v�a");

            miSession.beginTransaction();
            miSession.save(cliente1);
            miSession.getTransaction().commit();

            log.info("Registro insertado correctamente");

            // lectura de registro
            miSession.beginTransaction();
            log.info("Lectura con registro con id: " + cliente1.getId());
            Clientes clienteInsertado = miSession.get(Clientes.class, cliente1.getId());
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
