package modelo;

import java.io.Serializable;
import java.util.Date;

public class Cliente extends Persona implements Serializable{

    private String usuario, clave, alimentacion;
    private int codigoCliente;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, String ci, String usuario, String clave) {
        super(nombre, apellido, ci);
        this.usuario = usuario;
        this.clave = clave;
      
    }

    
    public Cliente(String usuario, String clave, String nombre, String apellido, String nacionalidad, String ci, Date fechadenacimiento, String numeroTelefonico) {
        super(nombre, apellido, nacionalidad, ci, fechadenacimiento, numeroTelefonico);
        this.usuario = usuario;
        this.clave = clave;
        
    }

    public int getCodigoUsuario() {
        return codigoCliente;
    }

    public void setCodigoUsuario(int codigoUsuario) {
        this.codigoCliente = codigoUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getClave() {
        return clave;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }
 
    

    @Override
    public String toString() {
        return usuario;
    }

   
}
