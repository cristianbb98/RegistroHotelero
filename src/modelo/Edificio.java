
package modelo;


public class Edificio {
   private String nombre, direccion;
           private double precio;

    public Edificio() {
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

    public Edificio(String nombre, String direccion, double precio) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.precio = precio;
    }

}
