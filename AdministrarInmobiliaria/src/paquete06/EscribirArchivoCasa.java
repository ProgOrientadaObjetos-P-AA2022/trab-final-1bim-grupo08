/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete06;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
/**
 *
 * @author gilbertsolanosotomayor
 */
public class EscribirArchivoCasa {
    private String nombreArchivo;
    private Casa registroCasa;
    private ObjectOutputStream salida;
    private ArrayList<Casa> listaCasa = new ArrayList<>();
    public EscribirArchivoCasa(String nomArchivo){
         nombreArchivo = nomArchivo;
         establecerListaCasas(); // obtener los valores (objetos)
        // que tiene el archivo.
        try // abre el archivo
        {
            salida = new ObjectOutputStream(
                    new FileOutputStream(nombreArchivo));
            // proceso para ingresar nuevamente los valores del archivo
            if (obtenerListaCasas().size() > 0) {
                for (int i = 0; i < obtenerListaCasas().size(); i++) {
                    establecerRegistroCasa(obtenerListaCasas().get(i));
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

    public void establecerRegistroCasa(Casa c) {
        registroCasa = c;
    }

    public Casa obtenerRegistroCasa() {
        return registroCasa;
    }

    public void establecerSalida() {
        try {
            salida.writeObject(registroCasa);

        } catch (IOException ioe) {
            System.out.println("Error en escribir archivo");
        }
    }

    public ObjectOutputStream obtenerSalida() {
        return salida;
    }

    public void establecerListaCasas() {
           LecturaArchivoCasa l = 
                new LecturaArchivoCasa(obtenerNombreArchivo());
        l.establecerCasas();
        listaCasa = l.obtenerCasas();

    }

    public ArrayList<Casa> obtenerListaCasas() {
        return listaCasa;
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
