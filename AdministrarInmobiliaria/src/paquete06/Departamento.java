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
public class Departamento implements Serializable{
    private Propietario pr;
    private double precioMetroCuadrado;
    private double numeroMetrosCuadrados;
    private double valorAlicuotaMensual;
    private double costoFinal;
    private Barrio ba;
    private Ciudad ci;
    private String nombreEdificio;
    private String ubicacionEdificio;
    private Constructora cons;

<<<<<<< HEAD
    public Departamento() {

    }

    public Departamento(Propietario p, double pmc, double mc,
            double vam, Barrio b, Ciudad c, String ne, String ue, Constructora co) {
        pr=p;
        precioMetroCuadrado=pmc;
        numeroMetrosCuadrados=mc;
        valorAlicuotaMensual=vam;
        ba=b;
        ci=c;
        nombreEdificio=ne;
        ubicacionEdificio=ue;
        cons=co;
    }
    public void establecerPropietario(Propietario c){
        pr=c;
    }
    public Propietario obtenerPropietario(){
        return pr;
    }
    public void establecerPrecioMetroCuadrado(double c){
        precioMetroCuadrado=c;
    }
    public double obtenerPrecioMetroCuadrado(){
        return precioMetroCuadrado;
    }
   public void establecerNumeroMetrosCuadrados(double c){
       numeroMetrosCuadrados=c;
   }  
   public double obtenerNumeroMetrosCuadrados(){
       return numeroMetrosCuadrados;
   }
   public void establecerValorAlicuotaMensual(double c){
       valorAlicuotaMensual=c;
   }
   public double obtenerValorAlicuotaMensual(){
       return valorAlicuotaMensual;
   }
   public void establecerBarrio(Barrio c){
       ba=c;
   }
   public Barrio obtenerBarrio(){
       return ba;
   }
   public void establecerCiudad(Ciudad c){
       ci=c;
   }
   public Ciudad obtenerCiudad(){
       return ci;
   }
   public void establecerNombreEdificio(String c){
       nombreEdificio=c;
   }
   public String obtenerNombreEdificio(){
      return nombreEdificio;
   }
   public void establecerUbicacionEdificio(String c){
       ubicacionEdificio=c;
       
   }
   public String obtenerUbicacionEdificio(){
       return ubicacionEdificio;
   }
   public void establecerConstructora(Constructora c){
       cons=c;
   }
   public Constructora obtenerConstructora(){
       return cons;
   }
   public void calcularCostoFinalD(){
       costoFinal=(numeroMetrosCuadrados*precioMetroCuadrado)+(valorAlicuotaMensual*12);
   }
   public double obtenerCostoFinal(){
       return costoFinal;
   }
   
   public String toString(){
       String d="Informacion Departamento:";
       d = String.format("%s\n "
               + "%s\n "
               + "Precio Metro Cuadrado:  %.2f\n"
               + "Numero de Metros Cuadrados:   %.2f\n"
               + "Valor Alicuota Mensual   %.2f\n"
               + "Costo final:   %.2f\n"
               + "%s\n"
               + "%s\n"
               + "Nombre Edificio: %s\n "
               + "Ubicacion Edificio: %s\n"
               + "%s\n", d, 
               obtenerPropietario(),
               obtenerPrecioMetroCuadrado(),
               obtenerNumeroMetrosCuadrados(),
               obtenerValorAlicuotaMensual(),
               obtenerCostoFinal(),
               obtenerBarrio(),
               obtenerCiudad(),
               obtenerNombreEdificio(),
               obtenerUbicacionEdificio(),
               obtenerConstructora());
       return d;
   }
=======
 private Propietario pr;
    private double precioMetroCuadrado;
    private double numeroMetrosCuadrados;
    private double valorAlicuotaMensual;
    private double costoFinal;
    private Barrio ba;
    private Ciudad ci;
    private String nombreEdificio;
    private String ubicacionEdificio;
    private Constructora cons;
>>>>>>> refs/remotes/origin/main

    public Departamento() {

    }

    public Departamento(Propietario p, double pmc, double mc,
            double vam, Barrio b, Ciudad c, String ne, String ue, Constructora co) {
        pr=p;
        precioMetroCuadrado=pmc;
        numeroMetrosCuadrados=mc;
        valorAlicuotaMensual=vam;
        ba=b;
        ci=c;
        nombreEdificio=ne;
        ubicacionEdificio=ue;
        cons=co;
    }
    public void establecerPropietario(Propietario c){
        pr=c;
    }
    public Propietario obtenerPropietario(){
        return pr;
    }
    public void establecerPrecioMetroCuadrado(double c){
        precioMetroCuadrado=c;
    }
    public double obtenerPrecioMetroCuadrado(){
        return precioMetroCuadrado;
    }
   public void establecerNumeroMetrosCuadrados(double c){
       numeroMetrosCuadrados=c;
   }  
   public double obtenerNumeroMetrosCuadrados(){
       return numeroMetrosCuadrados;
   }
   public void establecerValorAlicuotaMensual(double c){
       valorAlicuotaMensual=c;
   }
   public double obtenerValorAlicuotaMensual(){
       return valorAlicuotaMensual;
   }
   public void establecerBarrio(Barrio c){
       ba=c;
   }
   public Barrio obtenerBarrio(){
       return ba;
   }
   public void establecerCiudad(Ciudad c){
       ci=c;
   }
   public Ciudad obtenerCiudad(){
       return ci;
   }
   public void establecerNombreEdificio(String c){
       nombreEdificio=c;
   }
   public String obtenerNombreEdificio(){
      return nombreEdificio;
   }
   public void establecerUbicacionEdificio(String c){
       ubicacionEdificio=c;
       
   }
   public String obtenerUbicacionEdificio(){
       return ubicacionEdificio;
   }
   public void establecerConstructora(Constructora c){
       cons=c;
   }
   public Constructora obtenerConstructora(){
       return cons;
   }
   public void calcularCostoFinalD(){
       costoFinal=(numeroMetrosCuadrados*precioMetroCuadrado)+(valorAlicuotaMensual*12);
   }
   public double obtenerCostoFinal(){
       return costoFinal;
   }
   
   public String toString(){
       String d="Informacion Departamento:";
       d = String.format("%s\n "
               + "%s\n "
               + "Precio Metro Cuadrado:  %.2f\n"
               + "Numero de Metros Cuadrados:   %.2f\n"
               + "Valor Alicuota Mensual   %.2f\n"
               + "Costo final:   %.2f\n"
               + "%s\n"
               + "%s\n"
               + "Nombre Edificio: %s\n "
               + "Ubicacion Edificio: %s\n"
               + "%s\n", d, 
               obtenerPropietario(),
               obtenerPrecioMetroCuadrado(),
               obtenerNumeroMetrosCuadrados(),
               obtenerValorAlicuotaMensual(),
               obtenerCostoFinal(),
               obtenerBarrio(),
               obtenerCiudad(),
               obtenerNombreEdificio(),
               obtenerUbicacionEdificio(),
               obtenerConstructora());
       return d;
   }

}
