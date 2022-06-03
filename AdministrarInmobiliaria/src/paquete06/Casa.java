/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete06;

import java.io.Serializable;
import paquete02.Propietario;
import paquete03.Barrio;
import paquete04.Ciudad;
import paquete05.Constructora;

/**
 *
 * @author reroes
 */
public class Casa implements Serializable{
 private Propietario prop;
    private double precioMetroCuadrado;
    private double metrosCuadrados;
    private double costoFinal;
    private Barrio ba;
    private Ciudad ci;
    private int numeroCuartos;
    private Constructora cons;

<<<<<<< HEAD
=======
    private Propietario prop;
    private double precioMetroCuadrado;
    private double metrosCuadrados;
    private double costoFinal;
    private Barrio ba;
    private Ciudad ci;
    private int numeroCuartos;
    private Constructora cons;

>>>>>>> refs/remotes/origin/main
    public Casa() {

    }

    public Casa(Propietario p, double pM, double mC, Barrio b, Ciudad c, int nC, Constructora co) {
        prop = p;
        precioMetroCuadrado = pM;
        metrosCuadrados = mC;
        ba = b;
        ci = c;
        numeroCuartos = nC;
        cons = co;
    }

    public void establecerPropietario(Propietario c) {
        prop = c;
    }

    public Propietario obtenerPropietario() {
        return prop;
    }

    public void establecerPrecioMetroCuadrado(double c) {
        precioMetroCuadrado = c;
    }

    public double obtenerPrecioMetroCuadrado() {
        return precioMetroCuadrado;
    }

    public void establecerMetrosCuadrados(double c) {
        metrosCuadrados = c;
    }

    public double obtenerMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void establecerBarrio(Barrio c) {
        ba = c;
    }

    public Barrio obtenerBarrio() {
        return ba;
    }

    public void establecerCiudad(Ciudad c) {
        ci = c;
    }

    public Ciudad obtenerCiudad() {
        return ci;
    }

    public void establecerNumerodeCuartos(int c) {
        numeroCuartos = c;
    }

    public int obtenerNumerodeCuartos() {
        return numeroCuartos;
    }

    public void establecerConstructora(Constructora c) {
        cons = c;
    }

    public Constructora obtenerConstructora() {
        return cons;
    }

    public void calcularCostoFinal() {
        costoFinal = precioMetroCuadrado * metrosCuadrados;
    }

    public double obtenerCostoFinal() {
        return costoFinal;
    }

    @Override
    public String toString() {
        String c = "Información Casa";
        c = String.format("%s\n "
                + "%s\n  "
                + "Precio Metro Cuadrado: %.2f\n "
                + "Numero de Metros Cuadrados: %.2f\n"
                + "Costo Final: %.2f\n "
                + "%s\n"
                + " %s\n "
                + "Numero de Cuartos: %d\n "
                + "%s\n", c,
                obtenerPropietario(),
                obtenerPrecioMetroCuadrado(),
                obtenerMetrosCuadrados(),
                obtenerCostoFinal(),
                obtenerBarrio(),
                obtenerCiudad(),
                obtenerNumerodeCuartos(),
                obtenerConstructora());
        return c;

    }
   }
