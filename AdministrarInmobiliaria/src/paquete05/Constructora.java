/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete05;

import java.io.Serializable;

/**
 *
 * @author reroes
 */
public class Constructora implements Serializable{
    private int idC;
    private String nombreConstructora;
    
    public Constructora(){
        
    }
    public Constructora(int i, String n){
        idC=i;
        nombreConstructora=n;
        
    }
    public void establecerID(int c){
        idC=c;
    }
    public int obtenerID(){
        return idC;
    }
    public void establecerNombreConstructora(String c){
        nombreConstructora=c;
    }
    public String obtenerNombreConstructora(){
        return nombreConstructora;
    }
    
    @Override
    public String toString(){
        String co="Constructora";
        co=String.format("%s\n "
                + "ID: %d\n "
                + "Nombre Constructora: %s\n", co, obtenerID(), 
                obtenerNombreConstructora());
        return co;
    }
}
