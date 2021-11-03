/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controles;

import Tela.CadastroCaneca;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.StyleConstants;
import modelo.ModeloCaneca;

/**
 *
 * @author marco
 */
public class Produtos {
    
    public void create(ModeloCaneca p) {
   Connection con = conexãoMySQL.getConection();
        PreparedStatement stmt = null;
        
        
        try {
            stmt = con.prepareStatement("INSERT INTO produto(codigo,AddQuantidade,modelos)VALUES(?,?,?)");
            stmt.setInt(1,p.getCodigo());
            stmt.setInt(2,p.getAddQuantidade());
            stmt.setString(3,p.getModelos());
            
            stmt.execute();
            
            
                  JOptionPane.showMessageDialog( null,"Salvo com Sucesso");
                    
                    } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Erro ao Salvar:" +ex);
        }finally {
        conexãoMySQL.closeConnection(con, stmt);
        
        }
    
    
    
    } 

    public void getCodigo(int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void getAddQuantidade(int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void getModelos(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
     


}
