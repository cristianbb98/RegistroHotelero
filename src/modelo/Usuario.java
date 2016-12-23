
package modelo;


public class Usuario extends Persona{
    private String usuario, clave, alimentacion;
    private int codigoUsuario;
    

    public Usuario() {
    }

    public Usuario(String usuario, String clave, String alimentacion, String nombre, String apellido, String nacionalidad, String ci, String fechadenacimiento, String numeroTelefonico) {
        super(nombre, apellido, nacionalidad, ci, fechadenacimiento, numeroTelefonico);
        this.usuario = usuario;
        this.clave = clave;
        this.alimentacion = alimentacion;
       
            }

    public int getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(int codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

   

    public String getUsuario() {
        return usuario;
    }

    public String getClaves() {
        return clave;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

   
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setClaves(String claves) {
        this.clave = claves;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    
}
