/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.HashMap;
import java.util.List;
import modelo.*;

public class Gestionamiento {

    Edificio edificio = new Edificio();
    private HashMap<Habitacion, Cliente> datos = new HashMap<>();

    public void registrarCompra(Habitacion habitacion, Cliente cliente, int posicion) {
        LeerEscribirArchivos leer = new LeerEscribirArchivos();
        List edificios = (List) leer.leerArchivos("edificios.archivos");

        switch (posicion) {
            case 1:
                edificio = (Edificio) edificios.get(posicion);
                datos = edificio.getDatos();
                datos.put(habitacion, cliente);
                break;

            case 2:
                edificio = (Edificio) edificios.get(posicion);
                datos = edificio.getDatos();
                datos.put(habitacion, cliente);
                break;

            case 3:
                edificio = (Edificio) edificios.get(posicion);
                datos = edificio.getDatos();
                datos.put(habitacion, cliente);
                break;

            case 4:
                edificio = (Edificio) edificios.get(posicion);
                datos = edificio.getDatos();
                datos.put(habitacion, cliente);
                break;

        }

    }
   
    
    
    
    }


