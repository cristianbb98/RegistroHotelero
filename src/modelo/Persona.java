
package modelo;

import java.util.Date;


public class Persona {
   private String nombre, apellido , nacionalidad, ci,  numeroTelefonico;
   private Date fechadenacimiento;

    public Persona(String nombre, String apellido,String nacionalidad, String ci, Date fechadenacimiento, String numeroTelefonico) {
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

    public Date getFechadenacimiento() {
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

    public void setFechadenacimiento(Date fechadenacimiento) {
        this.fechadenacimiento = fechadenacimiento;
    }
    
}
