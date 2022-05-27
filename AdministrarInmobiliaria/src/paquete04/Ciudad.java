/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

/**
 *
 * @author reroes
 */
public class Ciudad {
    private String nombreCiudad;
    private String nombreProvincia;
    
    public Ciudad(){
        
    }
    public Ciudad(String nc, String np){
        nombreCiudad=nc;
        nombreProvincia=np;
    }
    public void establecerNombreCiudad(String c){
        nombreCiudad=c;
    }
    public String obtenerNombreCiudad(){
        return nombreCiudad;
    }
    public void establecerNombreProvincia(String c){
        nombreProvincia=c;
    }
    public String obtenerNombreProvincia(){
        return nombreProvincia;
    }
    
    @Override
    public String toString(){
        String c="Ciudad";
        c=String.format("%s\n Nombre Ciudad: %s\n Nombre Provincia: %s\n", c, 
                obtenerNombreCiudad(), obtenerNombreProvincia());
        return c;
    }
    
}
