/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
/**
 *
 * @author gilbertsolanosotomayor
 */
public class EscribirArchivoCiudad {
     private String nombreArchivo;
    private Ciudad registroCiudad;
    private ObjectOutputStream salida;
    private ArrayList<Ciudad> listaCiudad = new ArrayList<>();
    
    public EscribirArchivoCiudad(String nomArchivo){
         nombreArchivo= nomArchivo;
       establecerListaCiudades();
            try // abre el archivo
        {
            salida = new ObjectOutputStream(
                    new FileOutputStream(nombreArchivo));
            // proceso para ingresar nuevamente los valores del archivo
            if (obtenerListaCiudades().size() > 0) {
                for (int i = 0; i < obtenerListaCiudades().size(); i++) {
                    establecerRegistroCiudad(obtenerListaCiudades().get(i));
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

    public void establecerRegistroCiudad(Ciudad c) {
        registroCiudad = c;
    }

    public Ciudad obtenerRegistroCiudad() {
        return registroCiudad;
    }

    public void establecerSalida() {
        try {
            salida.writeObject(registroCiudad);

        } catch (IOException ioe) {
            System.out.println("Error en escribir archivo");
        }
    }

    public ObjectOutputStream obtenerSalida() {
        return salida;
    }

    public void establecerListaCiudades() {
           LecturaArchivoCiudad l = 
                new LecturaArchivoCiudad(obtenerNombreArchivo());
        l.establecerCiudades();
        listaCiudad = l.obtenerCiudades();

    }

    public ArrayList<Ciudad> obtenerListaCiudades() {
        return listaCiudad;
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
