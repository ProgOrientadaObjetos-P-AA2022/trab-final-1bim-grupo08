/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

/**
 *
 * @author reroes
 */
public class Barrio {
    private String nombreBarrio;
    private String referencia;
    
    public Barrio(){
        
    }
    public Barrio(String m, String r){
        nombreBarrio=m;
        referencia=r;
        
    }
    public void establecerNombreBarrio(String c){
        nombreBarrio=c;
    }
    public String obtenerNombreBarrio(){
        return nombreBarrio;
    }
    public void establecerReferencia(String c){
        referencia=c;
    }
    public String obtenerReferencia(){
        return referencia;
    }
    
    @Override
    public String toString(){
        String b="Barrio";
        b=String.format("%s\n Nombre:%s\n Referencia: %s\n", 
                b,obtenerNombreBarrio(), obtenerReferencia());
        return b;
    }
}
