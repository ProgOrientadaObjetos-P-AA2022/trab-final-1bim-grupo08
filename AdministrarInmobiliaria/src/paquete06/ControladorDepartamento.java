/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete06;

import java.util.Formatter;

/**
 *
 * @author gilbertsolanosotomayor
 */
public class ControladorDepartamento {
      private String nombreArchivo;
    private Departamento dataFinal;
    private Formatter salidaArchivo;
    
    public void establecerNombreArchivo(String c){
        nombreArchivo=c;
    }
    public String obtenerNombreArchivo(){
        return nombreArchivo;
    }
    public void establecerDatafinal(Departamento c){
        dataFinal=c;
    }
    public Departamento obtenerDataFinal(){
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
