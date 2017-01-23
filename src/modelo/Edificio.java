package modelo;

import java.util.HashMap;

public class Edificio {

    public String nombre, direccion;
    public double precio;
    private HashMap<Habitacion, Cliente> datos = new HashMap<>();

    public Edificio() {
    }

    public Edificio(String nombre, String direccion, double precio) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.precio = precio;
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
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public HashMap<Habitacion, Cliente> getDatos() {
        return datos;
    }

    public void setDatos(HashMap<Habitacion, Cliente> datos) {

        this.datos = datos;
    }

}
