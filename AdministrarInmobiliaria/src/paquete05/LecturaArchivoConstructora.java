/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete05;

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
public class LecturaArchivoConstructora {
        private ObjectInputStream entrada;
    private ArrayList<Constructora> constructoras;
    private String nombreArchivo;
    private String identificador;
    private Constructora constructoraBuscado;
    
    public LecturaArchivoConstructora(String n){
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
     public void establecerNombreArchivo(String n) {
        nombreArchivo = n;
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    public void establecerIdentificador(String n) {
        identificador = n;
    }

    public String obtenerIdentificador() {
        return identificador;
    }

    public void establecerConstructoras() {
        // 
        constructoras = new ArrayList<>();
        File f = new File(obtenerNombreArchivo());
        if (f.exists()) {

            while (true) {
                try {
                    Constructora registro = (Constructora) entrada.readObject();
                    constructoras.add(registro);
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

    public ArrayList<Constructora> obtenerConstructoras() {
        return constructoras;
    }

    public void establecerConstructoraBuscado() {
        // 
     
        File f = new File(obtenerNombreArchivo());
        if (f.exists()) {

            while (true) {
                try {
                    Constructora registro = (Constructora) entrada.readObject();
                    
                    String id=String.valueOf(registro.obtenerID());
                    if (id.equals(identificador)) {
                        constructoraBuscado = registro;
                     
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

    public Constructora obtenerConstructoraBuscado() {
        return constructoraBuscado;
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
        String cadena = "Lista de Constructora\n";
        for (int i = 0; i < obtenerConstructoras().size(); i++) {
            Constructora c = obtenerConstructoras().get(i);
            cadena = String.format("%s(%d) %d-%s\n", cadena,
                    i + 1,
                    c.obtenerID(),
                    c.obtenerNombreConstructora());

        }

        return cadena;
    }

}
