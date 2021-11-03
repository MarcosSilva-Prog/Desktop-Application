/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controles;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;





public class conexãoMySQL {

    private static  final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3307/jnecas";
    private static final String USER = "marcos";
    private static final String PASS = "098614";
    
    
    
    public static Connection getConection() {
              
        
        try {
            Class.forName( DRIVER);
            
            
            return DriverManager.getConnection(URL, USER,PASS);
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro na Conecxão: ",ex);
        }
       }
    
    public static void closeConnection(Connection con){
        try {
if(con!=null)
    con.close();
    
        
} catch (SQLException ex) {
    Logger.getLogger(conexãoMySQL.class.getName()).log(Level.SEVERE, null, ex);
}
    
            
            }
     public static void closeConnection(Connection con,PreparedStatement stmt){
         closeConnection(con);
         
        try {
if(stmt!=null)
    stmt.close();
    
        
} catch (SQLException ex) {
    Logger.getLogger(conexãoMySQL.class.getName()).log(Level.SEVERE, null, ex);
}
    
            
            }
     
      public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs){
         
          closeConnection(con, stmt);
         
        try {
if(rs !=null)
    rs.close();
    
        
} catch (SQLException ex) {
    Logger.getLogger(conexãoMySQL.class.getName()).log(Level.SEVERE, null, ex);
}
    
            
            }

    public void create(Produtos dao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
