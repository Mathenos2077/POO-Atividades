package model;

import java.sql.*;
import com.j256.ormlite.jdbc.JdbcConnectionSource;

/**
 *  Database Class
 * 
 * @author Matheus TP
 */
public class Database{
   private String databaseName = null;
   private JdbcConnectionSource connection = null;
   public Database(String databaseName) {
       this.databaseName = databaseName;
   }
   /**
    * Abre a conexão com o banco de dados
    * 
    * @return
    */
   public JdbcConnectionSource getConnection(){
    try{
       if ( databaseName == null ) {
            throw new SQLException("O nome do banco de dados não pode ser nulo!");
        }
        if ( connection == null ) {
            try {
                connection = new JdbcConnectionSource("jdbc:sqlite:"+databaseName);             
              } catch ( Exception e ) {
                  System.err.println( e.getClass().getName() + ": " + e.getMessage() );
                  System.exit(0);
              }
        }
    } catch (SQLException e){
        System.out.println("Falha ao abrir o banco de dados!");
        }
    return connection;
    }
   /**
    *  Encerra a conexão do banco de dados
    */
   public void close() {
       if ( connection != null ) {
           try {
               connection.close();
               this.connection = null;
           } catch (java.lang.Exception e) {
               System.err.println(e);
           }
       }
   }
}
