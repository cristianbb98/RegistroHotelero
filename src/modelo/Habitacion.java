
package modelo;


public class Habitacion extends Edificio {
    private String piso, codigo;
    private boolean servicios;
   private double precioTipo;
   
    

    public Habitacion(){
    
    }

    public Habitacion(String piso, String codigo, boolean servicios, double precioTipo) {
        this.piso = piso;
        this.codigo = codigo;
        this.servicios = servicios;
        this.precioTipo = precioTipo;
    }

    public Habitacion(String piso, String codigo, boolean servicios, double precioTipo, String nombre, String direccion, double precio) {
        super(nombre, direccion, precio);
        this.piso = piso;
        this.codigo = codigo;
        this.servicios = servicios;
        this.precioTipo = precioTipo;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public boolean isServicios() {
        return servicios;
    }

    public void setServicios(boolean servicios) {
        this.servicios = servicios;
    }

    public double getPrecioTipo() {
        return precioTipo;
    }

    public void setPrecioTipo(double precioTipo) {
        this.precioTipo = precioTipo;
    }

    
}
