
package modelo;


public class Empleado extends Persona {
    private String usuario, clave; 
    private int codigoAdministrador = 00001;

    public Empleado(String usuario, String clave, String nombre, String apellido, String nacionalidad, String ci, String fechadenacimiento, String numeroTelefonico) {
        super(nombre, apellido, nacionalidad, ci, fechadenacimiento, numeroTelefonico);
        this.usuario = usuario;
        this.clave = clave;
        codigoAdministrador++;
        
    }
    public Empleado(){
          }

    public String getUsuario() {
        return usuario;
    }

    public String getClave() {
        return clave;
    }

    public int getCodigoAdministrador() {
        return codigoAdministrador;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setCodigoAdministrador(int codigoAdministrador) {
        this.codigoAdministrador = codigoAdministrador;
    }
    
    
}
