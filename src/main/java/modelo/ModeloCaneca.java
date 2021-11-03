/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.swing.JFormattedTextField;
import javax.swing.JTextField;

/**
 *
 * @author marco
 */
public class ModeloCaneca {

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the AddQuantidade
     */
    public int getAddQuantidade() {
        return AddQuantidade;
    }

    /**
     * @param AddQuantidade the AddQuantidade to set
     */
    public void setAddQuantidade(int AddQuantidade) {
        this.AddQuantidade = AddQuantidade;
    }

    /**103041319
     * @return the modelos
     */
    public String getModelos() {
        return modelos;
    }

    /**
     * @param modelos the modelos to set
     */
    public void setModelos(String modelos) {
        this.modelos = modelos;
    }
    private int codigo;
    private int AddQuantidade;
    private String modelos;
}