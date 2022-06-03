/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete05;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
/**
 *
 * @author gilbertsolanosotomayor
 */
public class EscribirArchivoConstructora {
    private String nombreArchivo;
    private Constructora registroConstructora;
    private ObjectOutputStream salida;
    private ArrayList<Constructora> listaConstructora = new ArrayList<>();
    
    public EscribirArchivoConstructora(String nomArchivo){
         nombreArchivo = nomArchivo;
        establecerListaConstructoras();
        try // abre el archivo
        {
            salida = new ObjectOutputStream(
                    new FileOutputStream(nombreArchivo));
            // proceso para ingresar nuevamente los valores del archivo
            if (obtenerListaConstructoras().size() > 0) {
                for (int i = 0; i < obtenerListaConstructoras().size(); i++) {
                    establecerRegistroConstructora(obtenerListaConstructoras().get(i));
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

    public void establecerRegistroConstructora(Constructora c) {
        registroConstructora = c;
    }

    public Constructora obtenerRegistroConstructora() {
        return registroConstructora;
    }

    public void establecerSalida() {
        try {
            salida.writeObject(registroConstructora);

        } catch (IOException ioe) {
            System.out.println("Error en escribir archivo");
        }
    }

    public ObjectOutputStream obtenerSalida() {
        return salida;
    }

    public void establecerListaConstructoras() {
        LecturaArchivoConstructora l
                = new LecturaArchivoConstructora(obtenerNombreArchivo());
        l.establecerConstructoras();
        listaConstructora = l.obtenerConstructoras();

    }

    public ArrayList<Constructora> obtenerListaConstructoras() {
        return listaConstructora;
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
