/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.io.Serializable;

/**
 *
 * @author reroes
 */
public class Propietario implements Serializable{

    private String nombre;
    private String apellido;
    private String identificacion;

    public Propietario() {

    }

    public Propietario(String n, String a, String i) {
        nombre = n;
        apellido = a;
        identificacion = i;
    }

    public void establecerNombre(String c) {
        nombre = c;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerApellido(String c) {
        apellido = c;

    }

    public String obtenerApellido() {
        return apellido;
    }

    public void establecerIdentificacion(String c) {
        identificacion = c;
    }

    public String obtenerIdentificacion() {
        return identificacion;
    }

    @Override
    public String toString() {
        String p = "Propietario";
        p = String.format("%s\n Nombre: %s\n Apellido: %s\n Identificacion: %s\n", p, obtenerNombre(),
                obtenerApellido(), obtenerIdentificacion());
        return p;
    }
}
