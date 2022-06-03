/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import java.util.ArrayList;
import java.util.Scanner;
import paquete02.EscribirArchivoPropietario;
import paquete02.LecturaArchivoPropietario;
import paquete02.Propietario;
import paquete03.Barrio;
import paquete03.EscribirArchivoBarrio;
import paquete03.LecturaArchivoBarrio;
import paquete04.Ciudad;
import paquete04.EscribirArchivoCiudad;
import paquete04.LecturaArchivoCiudad;
import paquete05.Constructora;
import paquete05.EscribirArchivoConstructora;
import paquete05.LecturaArchivoConstructora;
import paquete06.Casa;
import paquete06.Departamento;
import paquete06.EscribirArchivoCasa;
import paquete06.LecturaArchivoCasa;
import paquete06.EscribirArchivoDepartamento;
import paquete06.LecturaArchivoDepartamento;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    

    public static void main(String[] args) {
//
//    LecturaArchivoConstructora l=new LecturaArchivoConstructora(nomCons);
//
//        Constructora c = new Constructora();
//        l.establecerIdentificador("1");
//        
//        l.establecerNombreArchivo(nomCons);
//        l.establecerConstructoraBuscado();
//        System.out.println(l.obtenerConstructoraBuscado());
        menu();
//        System.out.printf("%s", cas1);
//        Departamento d1 = new Departamento(p1, 30, 5, 60, b1, c1, "Edificio Santa Ana", "Centro", co1);
//        d1.calcularCostoFinalD();
//        System.out.printf("%s", d1);

//        EscribirArchivoPropietario cpr = new EscribirArchivoPropietario();
//        ControladorBarrio cbr = new ControladorBarrio();
//        ControladorCiudad ciu = new ControladorCiudad();
//        ControladorConstructora ccons = new ControladorConstructora();
//        ControladorCasa cca = new ControladorCasa();
//        ControladorDepartamento cdep = new ControladorDepartamento();
//         
//        cpr.establecerNombreArchivo("Propietarios");
//        cpr.establecerDatafinal(p1);
//        cpr.agregarRegistro();
//        
//        cbr.establecerNombreArchivo("Barrios");
//        cbr.establecerDatafinal(b1);
//        cbr.agregarRegistro();
//        
//        ciu.establecerNombreArchivo("Ciudades");
//        ciu.establecerDatafinal(c1);
//        ciu.agregarRegistro();
//        
//        ccons.establecerNombreArchivo("Constructoras");
//        ccons.establecerDatafinal(co1);
//        ccons.agregarRegistro();
//        
//        cca.establecerNombreArchivo("Casas");
//        cca.establecerDatafinal(cas1);
//        cca.agregarRegistro();
//        
//        cdep.establecerNombreArchivo("Departamentos");
//        cdep.establecerDatafinal(d1);
//        cdep.agregarRegistro();
//            Scanner entrada= new Scanner(System.in);
//            Propietario p1= new Propietario();
//Propietario
//        EscribirArchivoPropietario eap = new EscribirArchivoPropietario(nomA);
//        eap.establecerRegistroPropietario(p1);
//        eap.establecerSalida();
        //todos lo demas acepto departamento y casa 
        //javiear palacios ir el dia de manania av universitaria frente al hospital
        //cedula
        // establecer en el archivo el atributo del registro
    }

    public static void menu() {
         Scanner entrada = new Scanner(System.in);
     String cedula = "";
     String nomA = "datos/propietarios.data";
     String nomB = "datos/barrios.data";
     String nomC = "datos/ciudades.data";
     String nomCons = "datos/constructora.data";
     String nomCasa = "datos/casas.data";
     String nomDepar= "datos/departamentos.data";
     Propietario propietario_buscar;
     LecturaArchivoPropietario lectura = null;
     LecturaArchivoBarrio lecturabarrio = null;
     LecturaArchivoCiudad lecturaciudad = null;
     LecturaArchivoConstructora lecturaconstructora = null;
     EscribirArchivoCasa escrituracasa = null;
     LecturaArchivoCasa lecturacasa = null;
     EscribirArchivoDepartamento escrituradepartamento=null;
     LecturaArchivoDepartamento lecturadepartamento=null;
     ArrayList<Casa> arrayCasa = new ArrayList<>();
     ArrayList<Departamento> arrayDepartamento= new ArrayList<>();
        int opc = 0;
        System.out.println("Menu");
        do {
            System.out.println("1.Ingreso de Propietario");
            System.out.println("2. Ingreso de Barrio");
            System.out.println("3. Ingreso de Ciudad");
            System.out.println("4. Ingreso de Constructora");
            System.out.println("5. Ingreso de Casa");
            System.out.println("6. Ingreso de Departamento");
            opc = Integer.parseInt(entrada.nextLine());
            switch (opc) {
                case 1:
                    System.out.println("Ingrese los datos del propietario");
                    System.out.println("Ingrese el numero de cedula del Propietario");
                    cedula = entrada.nextLine();

                    lectura = new LecturaArchivoPropietario(nomA);
                    lectura.establecerIdentificador(cedula);
                    lectura.establecerPropietarioBuscado();
                    propietario_buscar = lectura.obtenerPropietarioBuscado();
                    if (propietario_buscar != null) {
                        System.out.println("Propietario ya existe");
                    } else {
                        System.out.println("Ingrese nombre del Propietario");
                        String nombre = entrada.nextLine();
                        System.out.println("Ingrese apellido del Propietario");
                        String apellido = entrada.nextLine();

                        Propietario p1 = new Propietario(nombre, apellido, cedula);
                        EscribirArchivoPropietario eap = new EscribirArchivoPropietario(nomA);

                        eap.establecerRegistroPropietario(p1);
                        eap.establecerSalida();

                        eap.cerrarArchivo();
                        p1 = new Propietario();
                    }

                    break;
                case 2:
                    System.out.println("Ingrese los datos del Barrio");
                    System.out.println("Ingrese el nombre del Barrio");
                    String nombreB = entrada.nextLine();
                    System.out.println("Ingrese la referencia del Barrio");
                    String referencia = entrada.nextLine();
                    Barrio b1 = new Barrio(nombreB, referencia);
                    EscribirArchivoBarrio eb = new EscribirArchivoBarrio(nomB);
                    eb.establecerRegistroBarrio(b1);
                    eb.establecerSalida();
//                    LecturaArchivoBarrio lb = new LecturaArchivoBarrio(nomB);
//                    lb.establecerBarrios();
//                    System.out.println(lb);
                    eb.cerrarArchivo();
                    b1 = new Barrio();
                    break;
                case 3:
                    System.out.println("Ingrese los datos de la Ciudad");
                    System.out.println("Ingrese el nombre de la ciudad");
                    String ciudad = entrada.nextLine();
                    System.out.println("Ingrese la provincia que pertenece la Ciudad");
                    String provincia = entrada.nextLine();
                    Ciudad c1 = new Ciudad(ciudad, provincia);
                    EscribirArchivoCiudad ec = new EscribirArchivoCiudad(nomC);
                    ec.establecerRegistroCiudad(c1);
                    ec.establecerSalida();
                    ec.cerrarArchivo();
//                    LecturaArchivoCiudad lc = new LecturaArchivoCiudad(nomC);
//                    lc.establecerCiudades();
//                    System.out.println(lc);
                    c1 = new Ciudad();
                    break;
                case 4:
                    System.out.println("Ingrese los datos de la Constructora");
                    System.out.println("Ingrese el id de la constructora");
                    int id = Integer.parseInt(entrada.nextLine());
                    System.out.println("Ingrese el nombre de la constructora");
                    String nombreCons = entrada.nextLine();
                    Constructora co1 = new Constructora(id, nombreCons);
                    System.out.println("nuevo" + co1);
                    EscribirArchivoConstructora econs = new EscribirArchivoConstructora(nomCons);
                    econs.establecerRegistroConstructora(co1);
                    econs.establecerSalida();
                    econs.cerrarArchivo();
                    LecturaArchivoConstructora lcons = new LecturaArchivoConstructora(nomCons);
                    lcons.establecerConstructoras();
                    System.out.println(lcons);
                    break;
                case 5:

                    System.out.println("Ingrese los datos de la casa");
                    System.out.println("Ingrese cedula del propietario");
                    cedula = entrada.nextLine();

                    lectura = new LecturaArchivoPropietario(nomA);
                    lectura.establecerIdentificador(cedula);
                    lectura.establecerPropietarioBuscado();
                    //
                    propietario_buscar = lectura.obtenerPropietarioBuscado();
                    if (propietario_buscar != null) {
                        System.out.println("Propietario encontrado");
                    } else {
                        System.out.println("Ingrese nombre del Propietario");
                        String nombre = entrada.nextLine();
                        System.out.println("Ingrese apellido del Propietario");
                        String apellido = entrada.nextLine();

                        Propietario p1 = new Propietario(nombre, apellido, cedula);
                        EscribirArchivoPropietario eap = new EscribirArchivoPropietario(nomA);

                        eap.establecerRegistroPropietario(p1);
                        eap.establecerSalida();

                        eap.cerrarArchivo();
                        propietario_buscar = p1;

                    }
                    //
                    System.out.println("Ingrese el precio de metros cuadrados");
                    double premc = Double.parseDouble(entrada.nextLine());
                    System.out.println("Ingrese los metros cuadrados");
                    double metrosc = Double.parseDouble(entrada.nextLine());
                    System.out.println("Ingrese el numero de cuartos");
                    int numC = Integer.parseInt(entrada.nextLine());
                    System.out.println("Ingrese el nombre del Barrio");
                    String nombreBarrio = entrada.nextLine();
                    System.out.println("Ingrese el nombre de la Ciudad");
                    String nombreCiudad_ = entrada.nextLine();
                    Barrio ba1 = new Barrio();
                    Ciudad ciu1 = new Ciudad();
                    lecturabarrio = new LecturaArchivoBarrio(nomB);
                    lecturabarrio.establecerIdentificador(nombreBarrio);
                    lecturabarrio.establecerBarrioBuscado();
                    ba1 = lecturabarrio.obtenerBarrioBuscado();
                    if (ba1 == null) {
                        System.out.println("No esta el barrio registrado");
                    }
                    lecturaciudad = new LecturaArchivoCiudad(nomC);
                    lecturaciudad.establecerIdentificador(nombreCiudad_);
                    lecturaciudad.establecerCiudadBuscado();
                    ciu1 = lecturaciudad.obtenerCiudadBuscado();
                    if (ciu1 == null) {
                        System.out.println("No existe la ciudad registrada");
                    }
                    //
                    System.out.println("Ingrese el id de la constructora");
                    String idC = entrada.nextLine();
                    lecturaconstructora = new LecturaArchivoConstructora(nomCons);
                    lecturaconstructora.establecerIdentificador(idC);
                    lecturaconstructora.establecerConstructoraBuscado();
                    Constructora constu = lecturaconstructora.obtenerConstructoraBuscado();

                    if (constu == null) {
                        System.out.println("No existe la constructora registrada");
                    }
                    Casa cas1 = new Casa(propietario_buscar, premc, metrosc, ba1, ciu1, numC, constu);
                    cas1.calcularCostoFinal();

                    System.out.println(cas1);
                    escrituracasa = new EscribirArchivoCasa(nomCasa);
                    escrituracasa.establecerRegistroCasa(cas1);
                    escrituracasa.establecerSalida();
                    escrituracasa.cerrarArchivo();

                    lecturacasa= new LecturaArchivoCasa(nomCasa);
                    arrayCasa= lecturacasa.obtenerCasas();
                    if(arrayCasa!=null){
                        for (int i = 0; i < arrayCasa.size(); i++) {
                            System.out.println(arrayCasa.get(i));
                        }
                    }
                   
                    break;
                case 6:
                    System.out.println("Ingrese los datos del departamento");
                    System.out.println("Ingrese cedula del propietario");
                    cedula = entrada.nextLine();

                    lectura = new LecturaArchivoPropietario(nomA);
                    lectura.establecerIdentificador(cedula);
                    lectura.establecerPropietarioBuscado();
                    propietario_buscar = lectura.obtenerPropietarioBuscado();
                    if (propietario_buscar != null) {
                        System.out.println("Propietario encontrado");
                    } else {
                        System.out.println("Ingrese nombre del Propietario");
                        String nombre = entrada.nextLine();
                        System.out.println("Ingrese apellido del Propietario");
                        String apellido = entrada.nextLine();

                        Propietario p1 = new Propietario(nombre, apellido, cedula);
                        EscribirArchivoPropietario eap = new EscribirArchivoPropietario(nomA);

                        eap.establecerRegistroPropietario(p1);
                        eap.establecerSalida();

                        eap.cerrarArchivo();
                        propietario_buscar = p1;

                    }
                    System.out.println("Ingrese el precio de metros cuadrados");
                    double premcu = Double.parseDouble(entrada.nextLine());
                    System.out.println("Ingrese los metros cuadrados");
                    double metroscu = Double.parseDouble(entrada.nextLine());
                    System.out.println("Ingrese el valor Alicuota Mensual");
                    double alicuota = Integer.parseInt(entrada.nextLine());
                    System.out.println("Ingrese el nombre del Barrio");
                    String nombreBarrioD = entrada.nextLine();
                    System.out.println("Ingrese el nombre de la Ciudad");
                    String nombreCiudad_D = entrada.nextLine();
                    Barrio bar1 = new Barrio();
                    Ciudad ciud1 = new Ciudad();
                    lecturabarrio = new LecturaArchivoBarrio(nomB);
                    lecturabarrio.establecerIdentificador(nombreBarrioD);
                    lecturabarrio.establecerBarrioBuscado();
                    bar1 = lecturabarrio.obtenerBarrioBuscado();
                    if (bar1 == null) {
                        System.out.println("No esta el barrio registrado");
                    }
                    lecturaciudad = new LecturaArchivoCiudad(nomC);
                    lecturaciudad.establecerIdentificador(nombreCiudad_D);
                    lecturaciudad.establecerCiudadBuscado();
                    ciud1 = lecturaciudad.obtenerCiudadBuscado();
                    if (ciud1 == null) {
                        System.out.println("No existe la ciudad registrada");
                    }
                    System.out.println("Ingrese el nombre del Edificio");
                    String nombreEdificio=entrada.nextLine();
                    System.out.println("Ingrese ubicacion del Edificio");
                    String ubicacionEdificio=entrada.nextLine();
                      System.out.println("Ingrese el id de la constructora");
                    String idCons = entrada.nextLine();
                    lecturaconstructora = new LecturaArchivoConstructora(nomCons);
                    lecturaconstructora.establecerIdentificador(idCons);
                    lecturaconstructora.establecerConstructoraBuscado();
                    Constructora constur = lecturaconstructora.obtenerConstructoraBuscado();

                    if (constur == null) {
                        System.out.println("No existe la constructora registrada");
                    }
                    Departamento depar1= new Departamento(propietario_buscar, premcu, metroscu, alicuota, bar1, ciud1, nombreEdificio, ubicacionEdificio, constur);
                        depar1.calcularCostoFinalD();

                    System.out.println(depar1);
                    escrituradepartamento = new EscribirArchivoDepartamento(nomDepar);
                    escrituradepartamento.establecerRegistroDepartamento(depar1);
                    escrituradepartamento.establecerSalida();
                    escrituradepartamento.cerrarArchivo();
                    
                    
                      lecturadepartamento= new LecturaArchivoDepartamento(nomDepar);
                    arrayDepartamento= lecturadepartamento.obtenerDepartamentos();
                    if(arrayDepartamento!=null){
                        for (int i = 0; i < arrayDepartamento.size(); i++) {
                            System.out.println(arrayDepartamento.get(i));
                        }
                    }
                   
                    break;

                    

            }
        } while (opc != 0);

    }

}
