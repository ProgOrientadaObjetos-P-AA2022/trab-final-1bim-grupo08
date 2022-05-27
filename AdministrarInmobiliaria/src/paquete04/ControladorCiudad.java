/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

import java.util.Formatter;

/**
 *
 * @author gilbertsolanosotomayor
 */
public class ControladorCiudad {
      private String nombreArchivo;
    private Ciudad dataFinal;
    private Formatter salidaArchivo;
    
    public void establecerNombreArchivo(String c){
        nombreArchivo=c;
    }
    public String obtenerNombreArchivo(){
        return nombreArchivo;
    }
    public void establecerDatafinal(Ciudad c){
        dataFinal=c;
    }
    public Ciudad obtenerDataFinal(){
        return dataFinal;
    }
    public void agregarRegistro(){
        try {
             String rutaFinal= String.format("datos/%s.dat",obtenerNombreArchivo());
             salidaArchivo= new Formatter(rutaFinal);
             salidaArchivo.format("%s", obtenerDataFinal());
             salidaArchivo.close();
        } catch (Exception e) {
            System.err.println("Error Crear Archivo");
            System.err.println(e);
            System.exit(1);
        }
    }
}
