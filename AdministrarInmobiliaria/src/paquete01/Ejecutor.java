/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import java.util.Scanner;
import paquete02.ControladorPropietario;
import paquete03.ControladorBarrio;
import paquete04.ControladorCiudad;
import paquete05.ControladorConstructora;
import paquete06.ControladorCasa;
import paquete06.ControladorDepartamento;
import paquete02.Propietario;
import paquete03.Barrio;
import paquete04.Ciudad;
import paquete05.Constructora;
import paquete06.Casa;
import paquete06.Departamento;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        Propietario p1 = new Propietario("Gilbert", "Solano", "1105059404");
        Barrio b1 = new Barrio("Luz de America", "Mercado Central");
        Ciudad c1 = new Ciudad("Machala", "El Oro");

        Constructora co1 = new Constructora(1, "Constructora XV");
        Casa cas1 = new Casa(p1, 20, 4, b1, c1, 10, co1);
        cas1.calcularCostoFinal();
        System.out.printf("%s", cas1);
        Departamento d1 = new Departamento(p1, 30, 5, 60, b1, c1, "Edificio Santa Ana", "Centro", co1);
        d1.calcularCostoFinalD();
        System.out.printf("%s", d1);

        ControladorPropietario cpr = new ControladorPropietario();
        ControladorBarrio cbr = new ControladorBarrio();
        ControladorCiudad ciu = new ControladorCiudad();
        ControladorConstructora ccons = new ControladorConstructora();
        ControladorCasa cca = new ControladorCasa();
        ControladorDepartamento cdep = new ControladorDepartamento();
         
        cpr.establecerNombreArchivo("Propietarios");
        cpr.establecerDatafinal(p1);
        cpr.agregarRegistro();
        
        cbr.establecerNombreArchivo("Barrios");
        cbr.establecerDatafinal(b1);
        cbr.agregarRegistro();
        
        ciu.establecerNombreArchivo("Ciudades");
        ciu.establecerDatafinal(c1);
        ciu.agregarRegistro();
        
        ccons.establecerNombreArchivo("Constructoras");
        ccons.establecerDatafinal(co1);
        ccons.agregarRegistro();
        
        cca.establecerNombreArchivo("Casas");
        cca.establecerDatafinal(cas1);
        cca.agregarRegistro();
        
        cdep.establecerNombreArchivo("Departamentos");
        cdep.establecerDatafinal(d1);
        cdep.agregarRegistro();
        
        
//            Scanner entrada= new Scanner(System.in);
//            Propietario p1= new Propietario();
    }

}
