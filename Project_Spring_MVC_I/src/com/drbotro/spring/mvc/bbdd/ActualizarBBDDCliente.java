package com.drbotro.spring.mvc.bbdd;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ActualizarBBDDCliente{

    private static Log log = LogFactory.getLog(ActualizarBBDDCliente.class);

    public static void main(String[] args){

        SessionFactory miFactory = new Configuration().configure("/resources/hibernate.cfg.xml")
                .addAnnotatedClass(Clientes.class).buildSessionFactory();

        Session miSession = miFactory.openSession();

        try{

            int clienteId = 1;

            // comenzar la session
            miSession.beginTransaction();

            // creamos cliente
            Clientes miClienteMod = miSession.get(Clientes.class, clienteId);
            miClienteMod.setNombre("Pedro");

            log.info("Registro actualizado correctamente");

            miSession.createQuery("UPDATE Clientes SET apellidos='jaja' WHERE apellidos LIKE 'pr%'").executeUpdate();

            miSession.createQuery("DELETE Clientes WHERE apellidos LIKE 'jaja%'").executeUpdate();

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
