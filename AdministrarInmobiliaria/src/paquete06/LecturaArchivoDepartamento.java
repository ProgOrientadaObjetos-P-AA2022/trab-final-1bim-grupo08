/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete06;

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
public class LecturaArchivoDepartamento {

    private ObjectInputStream entrada;
    private ArrayList<Departamento> departamentos;
    private String nombreArchivo;
    private String identificador;
    private Casa departamentoBuscado;

    public LecturaArchivoDepartamento(String n) {
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

    public void establecerDepartamentos() {
        // 
        departamentos = new ArrayList<>();
        File f = new File(obtenerNombreArchivo());
        if (f.exists()) {

            while (true) {
                try {
                    Departamento registro = (Departamento) entrada.readObject();
                    departamentos.add(registro);
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

    public ArrayList<Departamento> obtenerDepartamentos() {
        return departamentos;
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
        String cadena = "Lista de Departamentos\n";
        for (int i = 0; i < obtenerDepartamentos().size(); i++) {
            Departamento d = obtenerDepartamentos().get(i);
            cadena = String.format("%s(%d) %s -%.2f-%.2f-%.2f-%.2f-%s-%s-%s-%s-%s\n", cadena,
                    i + 1,
                    d.obtenerPropietario(),
                    d.obtenerPrecioMetroCuadrado(),
                    d.obtenerNumeroMetrosCuadrados(),
                    d.obtenerValorAlicuotaMensual(),
                    d.obtenerCostoFinal(),
                    d.obtenerBarrio(),
                    d.obtenerCiudad(),
                    d.obtenerNombreEdificio(),
                    d.obtenerUbicacionEdificio(),
                    d.obtenerConstructora()
            );
        }

        return cadena;
    }
}
