/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import java.util.ArrayList;
/**
 *
 * @author gilbertsolanosotomayor
 */
public class LecturaArchivoPropietario {
     private ObjectInputStream entrada;
    private ArrayList<Propietario> propietarios;
    private String nombreArchivo;
    private String identificador;
    private Propietario propietarioBuscado;
    public LecturaArchivoPropietario(String n){
          nombreArchivo = n;
         File f = new File(obtenerNombreArchivo());
        if (f.exists()) {
            try // abre el archivo
            {
                entrada = new ObjectInputStream(
                        new FileInputStream(n));
            } // fin de try
            catch (IOException ioException) {
                System.err.println("Error al abrir el archivo." + ioException);
            } // fin de catch
        }
    }
    public void establecerNombreArchivo(String n){
        nombreArchivo=n;
    }
    public String obtenerNombreArchivo(){
        return nombreArchivo;
    }
      public void establecerIdentificador(String n) {
        identificador = n;
    }
       public String obtenerIdentificador() {
        return identificador;
    }
      public void establecerPropietarios() {
        // 
        propietarios = new ArrayList<>();
        File f = new File(obtenerNombreArchivo());
        if (f.exists()) {

            while (true) {
                try {
                    Propietario registro = (Propietario) entrada.readObject();
                    propietarios.add(registro);
                } catch (EOFException endOfFileException) {
                    return; // se llegó al fin del archivo
                    // se puede usar el break;
                    // System.err.println("Fin de archivo: " + endOfFileException);

                } catch (IOException ex) {
                    System.err.println("Error al leer el archivo: " + ex);
                } catch (ClassNotFoundException ex) {
                    System.err.println("No se pudo crear el objeto: " + ex);
                } catch (Exception ex) {
                    System.err.println("No hay datos en el archivo: " + ex);

                }
            }
        }
    }
    public ArrayList<Propietario> obtenerPropietarios(){
        return propietarios;
    }
    public void establecerPropietarioBuscado() {
        // 
        
        File f = new File(obtenerNombreArchivo());
        if (f.exists()) {

            while (true) {
                try {
                    Propietario registro = (Propietario) entrada.readObject();
                    
                    if(registro.obtenerIdentificacion().equals(identificador)){
                        propietarioBuscado = registro;
                        break;
                    }
                    
                } catch (EOFException endOfFileException) {
                    return; // se llegó al fin del archivo
                    // se puede usar el break;
                    // System.err.println("Fin de archivo: " + endOfFileException);

                } catch (IOException ex) {
                    System.err.println("Error al leer el archivo: " + ex);
                } catch (ClassNotFoundException ex) {
                    System.err.println("No se pudo crear el objeto: " + ex);
                } catch (Exception ex) {
                    System.err.println("No hay datos en el archivo: " + ex);

                }
            }
        }
    }
    public Propietario obtenerPropietarioBuscado(){
        return propietarioBuscado;
    }
     public void cerrarArchivo() {
        try // cierra el archivo y sale
        {
            if (entrada != null) {
                entrada.close();
            }
            System.exit(0);
        } // fin de try
        catch (IOException ioException) {
            System.err.println("Error al cerrar el archivo.");
            System.exit(1);
        } // fin de catch
    } // fin del método cerrarArchivo
         @Override
    public String toString() {
        String cadena = "Lista de Propietarios\n";
        for (int i = 0; i < obtenerPropietarios().size(); i++) {
            Propietario p = obtenerPropietarios().get(i);
            cadena = String.format("%s(%d) %s-%s-%s\n", cadena,
                    i + 1,
                    p.obtenerIdentificacion(),
                    p.obtenerNombre(),
                    p.obtenerApellido());
        }

        return cadena;
    }
}
