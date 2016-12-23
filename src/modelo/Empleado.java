
package modelo;


public class Empleado extends Persona {
    private String usuario, clave, codigoAdministrador;

    public Empleado(String usuario, String clave, String nombre, String apellido, String nacionalidad, String ci, String fechadenacimiento, String numeroTelefonico) {
        super(nombre, apellido, nacionalidad, ci, fechadenacimiento, numeroTelefonico);
        this.usuario = usuario;
        this.clave = clave;
        
    }
    public Empleado(){
          }

    public String getUsuario() {
        return usuario;
    }

    public String getClave() {
        return clave;
    }

    public String getCodigoAdministrador() {
        return codigoAdministrador;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setCodigoAdministrador(String codigoAdministrador) {
        this.codigoAdministrador = codigoAdministrador;
    }
    
    
}
