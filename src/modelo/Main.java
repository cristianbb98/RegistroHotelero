/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import controlador.Conexion;
import controlador.TablaCliente;

/**
 *
 * @author Toshiba
 */
public class Main {

   
    public static void main(String[] args) {
        modelo.Cliente cliente = null; 
                
                Conexion conexion = new Conexion();
                conexion.obtener();
                new TablaCliente(conexion).agregarValores(new Cliente("cristianbb98", "12345", "Cristian", "Betancourt", "Ecuador", "1718057688", "09/03/1998","6039897"));
    }
    
}
