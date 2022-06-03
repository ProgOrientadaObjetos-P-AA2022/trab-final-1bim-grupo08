/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author gilbertsolanosotomayor
 */
public class EscribirArchivoPropietario {

    private String nombreArchivo;
    private Propietario registroPropietario;
    private ObjectOutputStream salida;
    private ArrayList<Propietario> listaPropietario = new ArrayList<>();

    public EscribirArchivoPropietario(String nomArchivo) {
        nombreArchivo = nomArchivo;

        establecerListaPropietarios(); // obtener los valores (objetos)
        // que tiene el archivo.
        try // abre el archivo
        {
            salida = new ObjectOutputStream(
                    new FileOutputStream(nombreArchivo));
            // proceso para ingresar nuevamente los valores del archivo
            if (obtenerListaPropietarios().size() > 0) {
                for (int i = 0; i < obtenerListaPropietarios().size(); i++) {
                    establecerRegistroPropietario(obtenerListaPropietarios().get(i));
                    establecerSalida();
                }
            }
        } // fin de try
        catch (IOException ioException) {
            System.err.println("Error al abrir el archivo.");
        } // fin de catch
    }

    public void establecerNombreArchivo(String c) {
        nombreArchivo = c;
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    public void establecerRegistroPropietario(Propietario p) {
        registroPropietario = p;
    }

    public Propietario obtenerRegistroPropietario() {
        return registroPropietario;
    }

    public void establecerSalida() {
        try {
            salida.writeObject(registroPropietario);

        } catch (IOException ioe) {
            System.out.println("Error en escribir archivo");
        }
    }

    public ObjectOutputStream obtenerSalida() {
        return salida;
    }

    public void establecerListaPropietarios() {
           LecturaArchivoPropietario l = 
                new LecturaArchivoPropietario(obtenerNombreArchivo());
        l.establecerPropietarios();
        listaPropietario = l.obtenerPropietarios();

    }

    public ArrayList<Propietario> obtenerListaPropietarios() {
        return listaPropietario;
    }

    public void cerrarArchivo() {
        try // cierra el archivo
        {
            if (salida != null) {
                salida.close();
            }
        } // fin de try
        catch (IOException ioException) {
            System.err.println("Error al cerrar el archivo.");

        } // fin de catch
    }
//    private Formatter salidaArchivo;
//    
//    public void establecerNombreArchivo(String c) {
//        nombreArchivo = c;
//    }
//
//    public String obtenerNombreArchivo() {
//        return nombreArchivo;
//    }
//
//    public void establecerDatafinal(Propietario c) {
//        dataFinal = c;
//    }
//
//    public Propietario obtenerDataFinal() {
//        return dataFinal;
//    }
//
//    public void agregarRegistro() {
//        try {
//            String rutaFinal = String.format("datos/%s.dat", obtenerNombreArchivo());
//            salidaArchivo = new Formatter(rutaFinal);
//            salidaArchivo.format("%s", obtenerDataFinal());
//            salidaArchivo.close();
//        } catch (Exception e) {
//            System.err.println("Error Crear Archivo");
//            System.err.println(e);
//            System.exit(1);
//        }
//    }
}
