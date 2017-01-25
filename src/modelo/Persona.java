
package modelo;


public class Persona {
    String nombre, apellido , nacionalidad, ci, fechadenacimiento, numeroTelefonico;

    public Persona(String nombre, String apellido,String nacionalidad, String ci, String fechadenacimiento, String numeroTelefonico) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad=nacionalidad;
        this.ci = ci;
        this.fechadenacimiento = fechadenacimiento;
        this.numeroTelefonico=numeroTelefonico;
              
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNumeroTelefonico(String numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }

    public String getNumeroTelefonico() {
        return numeroTelefonico;
    }

    public String getApellido() {
        return apellido;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public String getCi() {
        return ci;
    }

    public String getFechadenacimiento() {
        return fechadenacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public void setFechadenacimiento(String fechadenacimiento) {
        this.fechadenacimiento = fechadenacimiento;
    }
    
}
