package modelo;

import controlador.LeerEscribirArchivos;
import java.util.HashMap;
import java.util.List;

public class Edificio {

    public String nombre, direccion;
    public final double PRECIO = 20.00;
    private HashMap<Habitacion, Cliente> datos = new HashMap<>();

    public Edificio() {
    }

    public Edificio(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getPrecio() {
        return PRECIO;
    }

    public HashMap<Habitacion, Cliente> getDatos() {
        return datos;
    }

    public void setDatos(Habitacion habitacion, Cliente cliente) {
        datos.put(habitacion, cliente);
        }
    
    public void setHash(Habitacion habitacion) {
        datos.put(habitacion, null);
        
        }

}
