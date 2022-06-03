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
public class EscribirArchivoDepartamento {
      private String nombreArchivo;
    private Departamento registroDepartamento;
    private ObjectOutputStream salida;
    private ArrayList<Departamento> listaDepartamento = new ArrayList<>();
    public EscribirArchivoDepartamento(String nomArchivo){
        nombreArchivo = nomArchivo;
         establecerListaDepartamentos(); // obtener los valores (objetos)
        // que tiene el archivo.
        try // abre el archivo
        {
            salida = new ObjectOutputStream(
                    new FileOutputStream(nombreArchivo));
            // proceso para ingresar nuevamente los valores del archivo
            if (obtenerListaDepartamentos().size() > 0) {
                for (int i = 0; i < obtenerListaDepartamentos().size(); i++) {
                    establecerRegistroDepartamento(obtenerListaDepartamentos().get(i));
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

    public void establecerRegistroDepartamento(Departamento c) {
        registroDepartamento = c;
    }

    public Departamento obtenerRegistoDepartamento() {
        return registroDepartamento;
    }

    public void establecerSalida() {
        try {
            salida.writeObject(registroDepartamento);

        } catch (IOException ioe) {
            System.out.println("Error en escribir archivo");
        }
    }

    public ObjectOutputStream obtenerSalida() {
        return salida;
    }

    public void establecerListaDepartamentos() {
           LecturaArchivoDepartamento l = 
                new LecturaArchivoDepartamento(obtenerNombreArchivo());
        l.establecerDepartamentos();
        listaDepartamento = l.obtenerDepartamentos();

    }

    public ArrayList<Departamento> obtenerListaDepartamentos() {
        return listaDepartamento;
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
