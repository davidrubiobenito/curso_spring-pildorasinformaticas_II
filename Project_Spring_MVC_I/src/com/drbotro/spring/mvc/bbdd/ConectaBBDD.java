package com.drbotro.spring.mvc.bbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ConectaBBDD{

    private static Log log = LogFactory.getLog(ConectaBBDD.class);

    public static void main(String[] args){

        //final String JDBC_URL = "jdbc:mysql://192.168.1.35/sb-multimodule-management";
        final String JDBC_URL = "jdbc:mysql://localhost:33060/pildorashibernate?useSSL=false";
        final String USER = "root";
        final String PASS = "1234";

        Connection miConexion = null;
        Statement miStatement = null;
        ResultSet resultSet = null;

        try{
            miConexion = ConectaBBDD.getConnection(JDBC_URL, USER, PASS);
            miStatement = ConectaBBDD.createStatement(miConexion);
            resultSet = ConectaBBDD.executeQuery(miStatement);

            ConectaBBDD.showResultQuery(resultSet);

        }catch(Exception e){
            log.error("No conecta", e);
        }finally{
            ConectaBBDD.closeQuietly(miConexion);
            ConectaBBDD.closeQuietly(miStatement);
            ConectaBBDD.closeQuietly(resultSet);
        }

    }

    public static Connection getConnection(final String jdbcUrl, final String User, final String Password){
        try{
            return DriverManager.getConnection(jdbcUrl, User, Password);
        }catch(Exception e){
            log.error("An error occurred connection.", e);
        }
        return null;

    }

    public static Statement createStatement(final Connection miConexion){
        try{
            return miConexion.createStatement();
        }catch(Exception e){
            log.error("An error occurred statement.", e);
        }
        return null;
    }

    public static ResultSet executeQuery(final Statement miStatement){
        try{
            return miStatement.executeQuery("SELECT * FROM usuario");
        }catch(Exception e){
            log.error("An error occurred result set.", e);
        }
        return null;
    }

    public static void showResultQuery(final ResultSet miResultSet){
        try{
            while(miResultSet.next()){
                log.info(miResultSet.getString("id") + " " + miResultSet.getString("nombre"));
            }
        }catch(Exception e){
            log.error("An error occurred show result query.", e);
        }
    }

    public static void closeQuietly(Connection connection){
        try{
            if(connection != null){
                connection.close();
            }
        }catch(Exception e){
            log.error("An error occurred closing connection.", e);
        }
    }

    public static void closeQuietly(Statement statement){
        try{
            if(statement != null){
                statement.close();
            }
        }catch(Exception e){
            log.error("An error occurred closing statement.", e);
        }
    }

    public static void closeQuietly(ResultSet resultSet){
        try{
            if(resultSet != null){
                resultSet.close();
            }
        }catch(Exception e){
            log.error("An error occurred closing result set.", e);
        }
    }

}
