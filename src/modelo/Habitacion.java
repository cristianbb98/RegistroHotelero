package modelo;

import java.io.Serializable;

public class Habitacion implements Serializable{

    private String piso, codigo;
    private int estadia;
    public final double PRECIO=30.00;

    public Habitacion() {

    }

    public Habitacion(String piso, String codigo, int estadia) {
        this.piso = piso;
        this.codigo = codigo;
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

    public int getEstadia() {
        return estadia;
    }

    public void setEstadia(int estadia) {
        this.estadia = estadia;
    }

    public double getPrecioTipo() {
        return PRECIO;
    }

    }
