package modelo;

public class Habitacion extends Edificio {

    private String piso, codigo;
    private int estadia;
    private double precioTipo;

    public Habitacion() {

    }

    public Habitacion(String piso, String codigo, double precioTipo) {
        this.piso = piso;
        this.codigo = codigo;

        this.precioTipo = precioTipo;
    }

    public Habitacion(String piso, String codigo, double precioTipo, String nombre, String direccion, double precio) {
        super(nombre, direccion, precio);
        this.piso = piso;
        this.codigo = codigo;

        this.precioTipo = precioTipo;
    }

    public int getEstadia() {
        return estadia;
    }

    public void setEstadia(int estadia) {
        this.estadia = estadia;
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

       public double getPrecioTipo() {
        return precioTipo;
    }

    public void setPrecioTipo(double precioTipo) {
        this.precioTipo = precioTipo;
    }

}
