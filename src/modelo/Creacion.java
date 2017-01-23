package modelo;

import controlador.LeerEscribirArchivos;
import java.util.*;

public class Creacion {

    public static void main(String[] args) {
        List habitaciones = new ArrayList<>();

        habitaciones.add(new Habitacion("Primero", "100", 0));
        habitaciones.add(new Habitacion("Primero", "101", 0));
        habitaciones.add(new Habitacion("Primero", "102", 0));
        habitaciones.add(new Habitacion("Primero", "103", 0));
        habitaciones.add(new Habitacion("Primero", "104", 0));
        habitaciones.add(new Habitacion("Primero", "105", 0));
        habitaciones.add(new Habitacion("Segundo", "200", 0));
        habitaciones.add(new Habitacion("Segundo", "201", 0));
        habitaciones.add(new Habitacion("Segundo", "202", 0));
        habitaciones.add(new Habitacion("Segundo", "203", 0));
        habitaciones.add(new Habitacion("Segundo", "204", 0));
        habitaciones.add(new Habitacion("Segundo", "205", 0));
        habitaciones.add(new Habitacion("Tercero", "300", 0));
        habitaciones.add(new Habitacion("Tercero", "301", 0));
        habitaciones.add(new Habitacion("Tercero", "302", 0));
        habitaciones.add(new Habitacion("Tercero", "303", 0));
        habitaciones.add(new Habitacion("Tercero", "304", 0));
        habitaciones.add(new Habitacion("Tercero", "305", 0));
        habitaciones.add(new Habitacion("Cuarto", "400", 0));
        habitaciones.add(new Habitacion("Cuarto", "401", 0));
        habitaciones.add(new Habitacion("Cuarto", "402", 0));
        habitaciones.add(new Habitacion("Cuarto", "403", 0));
        habitaciones.add(new Habitacion("Cuarto", "404", 0));
        habitaciones.add(new Habitacion("Cuarto", "405", 0));
        habitaciones.add(new Habitacion("Quinto", "500", 0));
        habitaciones.add(new Habitacion("Quinto", "501", 0));
        habitaciones.add(new Habitacion("Quinto", "502", 0));
        habitaciones.add(new Habitacion("Quinto", "503", 0));
        habitaciones.add(new Habitacion("Quinto", "504", 0));
        habitaciones.add(new Habitacion("Quinto", "505", 0));

        LeerEscribirArchivos leer = new LeerEscribirArchivos();
        leer.escribirArchivos(habitaciones, "habitaciones");

//
//        Habitacion num10 = new Habitacion("Primero", "100", 0);
//        Habitacion num11 = new Habitacion("Primero", "101", 0);
//        Habitacion num12 = new Habitacion("Primero", "102", 0);
//        Habitacion num13 = new Habitacion("Primero", "103", 0);
//        Habitacion num14 = new Habitacion("Primero", "104", 0);
//        Habitacion num15 = new Habitacion("Primero", "105", 0);
//        Habitacion num20 = new Habitacion("Primero", "200", 0);
//        Habitacion num21 = new Habitacion("Primero", "201", 0);
//        Habitacion num22 = new Habitacion("Primero", "202", 0);
//        Habitacion num23 = new Habitacion("Primero", "203", 0);
//        Habitacion num24 = new Habitacion("Primero", "204", 0);
//        Habitacion num25 = new Habitacion("Primero", "205", 0);
//        Habitacion num30 = new Habitacion("Primero", "300", 0);
//        Habitacion num31 = new Habitacion("Primero", "301", 0);
//        Habitacion num32 = new Habitacion("Primero", "302", 0);
//        Habitacion num33 = new Habitacion("Primero", "303", 0);
//        Habitacion num34 = new Habitacion("Primero", "304", 0);
//        Habitacion num35 = new Habitacion("Primero", "305", 0);
//        Habitacion num40 = new Habitacion("Primero", "400", 0);
//        Habitacion num41 = new Habitacion("Primero", "401", 0);
//        Habitacion num42 = new Habitacion("Primero", "402", 0);
//        Habitacion num43 = new Habitacion("Primero", "403", 0);
//        Habitacion num44 = new Habitacion("Primero", "404", 0);
//        Habitacion num45 = new Habitacion("Primero", "405", 0);
//        Habitacion num50 = new Habitacion("Primero", "500", 0);
//        Habitacion num51 = new Habitacion("Primero", "501", 0);
//        Habitacion num52 = new Habitacion("Primero", "502", 0);
//        Habitacion num53 = new Habitacion("Primero", "503", 0);
//        Habitacion num54 = new Habitacion("Primero", "504", 0);
//        Habitacion num55 = new Habitacion("Primero", "505", 0);
////
////        Edificio atacames = new Edificio("Atacames BV", "Malecón del Mar");
////         atacames.setHash(new Habitacion("Primero", "505", 0));
////         atacames.setHash(new Habitacion("Primero", "100", 0));
////        atacames.setHash(new Habitacion("Primero", "101", 0));
////        atacames.setHash(new Habitacion("Primero", "102", 0));
////        atacames.setHash(new Habitacion("Primero", "103", 0));
////       atacames.setHash(new Habitacion("Primero", "104", 0));
////        atacames.setHash(new Habitacion("Primero", "105", 0));
////        atacames.setHash(new Habitacion("Primero", "200", 0));
////        atacames.setHash(new Habitacion("Primero", "201", 0));
////        atacames.setHash(new Habitacion("Primero", "202", 0));
////        atacames.setHash(new Habitacion("Primero", "203", 0));
////        atacames.setHash(new Habitacion("Primero", "204", 0));
////        atacames.setHash(new Habitacion("Primero", "205", 0));
////        atacames.setHash(new Habitacion("Primero", "300", 0));
////        atacames.setHash(new Habitacion("Primero", "301", 0));
////        atacames.setHash(new Habitacion("Primero", "302", 0));
////        atacames.setHash(new Habitacion("Primero", "303", 0));
////        atacames.setHash(new Habitacion("Primero", "304", 0));
////        atacames.setHash(new Habitacion("Primero", "305", 0));
////       atacames.setHash(new Habitacion("Primero", "400", 0));
////       atacames.setHash(new Habitacion("Primero", "401", 0);
////        atacames.setHash(new Habitacion("Primero", "402", 0);
////        atacames.setHash(new Habitacion("Primero", "403", 0);
////        atacames.setHash(new Habitacion("Primero", "404", 0);
////        atacames.setHash(new Habitacion("Primero", "405", 0);
////        atacames.setHash(new Habitacion("Primero", "500", 0);
////        atacames.setHash(new Habitacion("Primero", "501", 0);
////        atacames.setHash(new Habitacion("Primero", "502", 0);
////        atacames.setHash(new Habitacion("Primero", "503", 0);
////        atacames.setHash(new Habitacion("Primero", "504", 0));
////        atacames.setHash(new Habitacion("Primero", "505", 0));
////
    }

}
