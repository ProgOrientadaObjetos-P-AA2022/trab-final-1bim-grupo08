/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author gilbertsolanosotomayor
 */
public class EscribirArchivoBarrio {

    private String nombreArchivo;
    private Barrio registroBarrio;
    private ObjectOutputStream salida;
    private ArrayList<Barrio> listaBarrio = new ArrayList<>();

    public EscribirArchivoBarrio(String nomArchivo) {
        nombreArchivo = nomArchivo;
        establecerListaBarrios();
        try // abre el archivo
        {
            salida = new ObjectOutputStream(
                    new FileOutputStream(nombreArchivo));
            // proceso para ingresar nuevamente los valores del archivo
            if (obtenerListaBarrios().size() > 0) {
                for (int i = 0; i < obtenerListaBarrios().size(); i++) {
                    establecerRegistroBarrio(obtenerListaBarrios().get(i));
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

    public void establecerRegistroBarrio(Barrio b) {
        registroBarrio = b;
    }

    public Barrio obtenerRegistroBarrio() {
        return registroBarrio;
    }

    public void establecerSalida() {
        try {
            salida.writeObject(registroBarrio);

        } catch (IOException ioe) {
            System.out.println("Error en escribir archivo");
        }
    }

    public ObjectOutputStream obtenerSalida() {
        return salida;
    }

    public void establecerListaBarrios() {
        LecturaArchivoBarrio l
                = new LecturaArchivoBarrio(obtenerNombreArchivo());
        l.establecerBarrios();
        listaBarrio = l.obtenerBarrios();

    }

    public ArrayList<Barrio> obtenerListaBarrios() {
        return listaBarrio;
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
}
