//http://www.chuidiang.com/java/mysql/mysql-java-basico.php
package controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.*;
import vista.Gestion;
import vista.Guardar;
import vista.Reservacion;

public class Tabla {

    private Validacion validar;

    private Cliente cliente = new Cliente();
    private Conexion cnx = new Conexion();
    private Habitacion habitacion;
    private Edificio edificio;
    private Empleado empleado;
    private PreparedStatement ps;

    public Tabla() {
    }

    public Tabla(Conexion cnx) {
        this.cnx = cnx;
    }

    public Conexion getCnx() {
        return cnx;
    }

    public void setCnx(Conexion cnx) {
        this.cnx = cnx;
    }

    //insertar datos en la bd
    public int agregarValores(Cliente cliente) {
        int valor = 0;

        if (buscarString("ci", "persona", "ci", cliente.getCi()) == null) {

            if (buscarString("usuario", "cliente", "usuario", cliente.getUsuario()) == null) {

                try {
                    ps = cnx.getCnx().prepareStatement("INSERT INTO persona (nombre, apellido, nacionalidad, ci, fechadenacimiento, numeroTelefonico)" + " VALUES ('" + cliente.getNombre() + "','" + cliente.getApellido() + "',' " + cliente.getNacionalidad() + "','" + cliente.getCi() + "','" + cliente.getFechadenacimiento() + "','" + cliente.getNumeroTelefonico() + "')");
                    ps.executeUpdate();

                } catch (SQLException ex) {

                    valor = -1;
                }

                try {
                    ps = cnx.getCnx().prepareStatement("INSERT INTO cliente (usuario, clave, codigoCliente, persona_ci)" + " VALUES ('" + cliente.getUsuario() + "','" + cliente.getClave() + "'," + 001 + ",'" + cliente.getCi() + "')");
                    valor = ps.executeUpdate();
                } catch (SQLException ex) {
                    valor = -1;
                }

            } else {
                JOptionPane.showMessageDialog(null, "Usuario ya existente");
                valor = -1;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Numero de cédula ya registrada");
            valor = -1;
        }

        return valor;
    }

    public void buscarTodo() {
//    public void buscarTodo(String ID) {

        try {
            PreparedStatement ps = cnx.getCnx().prepareStatement("SELECT * FROM cliente;");
            ResultSet resultado = ps.executeQuery();

            while (resultado.next()) {
                //crear un new tabla para pasar parametros

//                System.out.println(resultado.getInt("codigo"));
//                System.out.println(resultado.getDouble("parametro1"));
//                System.out.println(resultado.getDouble("parametro2"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Tabla.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        cnx.cerrar();
    }

    public void logear(String usuario) {
//    public void buscarTodo(String ID) {

        String entrada = "";
        String admin = "admin";
        if (usuario.equals(admin)) {
            new Gestion().setVisible(true);
        } else {

            try {
                ps = cnx.getCnx().prepareStatement("SELECT * FROM persona WHERE ci='" + usuario + "'");
                ResultSet resultado = ps.executeQuery();

                while (resultado.next()) {
                    entrada = resultado.getString("ci");
                    System.out.println(entrada);
                    System.out.println(resultado.getString("nombre"));
                    System.out.println("entro");

                }

            } catch (SQLException ex) {
                Logger.getLogger(Tabla.class
                        .getName()).log(Level.SEVERE, null, ex);

            }
            if (entrada.equals(usuario)) {
                new Reservacion().setVisible(true);
                new Guardar().setVisible(true);
            } else {

                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectas");

            }
        }
        cnx.cerrar();

    }

    public void logear(String usuario, String clave) {
        int codigo = 0;
        String nombre = "";
        String apellido = "";
        String user = "";
        String pass = "";
        String ci = "";
        String admin = "admin";
        if (usuario.equals(admin) && clave.equals(validar.encriptaEnMD5(validar.encriptaEnMD5(admin)))) {
            new Gestion().setVisible(true);
        } else {

            String entrada = "";

            try {

                ps = cnx.getCnx().prepareStatement("SELECT * FROM cliente WHERE usuario='" + usuario + "' && clave ='" + clave + "'");
                ResultSet resultado = ps.executeQuery();

                if (resultado.next()) {
                    pass = resultado.getString("clave");
                    user = resultado.getString("usuario");
                    ci = resultado.getString("persona_ci");
                }

                nombre = buscarString("nombre", "persona", "ci", ci).toString();
                apellido = buscarString("apellido", "persona", "ci", ci).toString();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectas");
            } finally {
                if (user.equals(usuario) && pass.equals(clave)) {
                    new Reservacion(new Cliente(nombre, apellido, ci, user, pass), new Guardar()).setVisible(true);
                    

                } else {

                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectas");

                }

            }
//                

        }
        cnx.cerrar();

    }

    public Object buscarString(String dato, String tabla, String busqueda, String igual) {
//    public void buscarTodo(String ID) {
        cnx.obtener();
        Object objeto = null;
        try {
            PreparedStatement ps = cnx.getCnx().prepareStatement("SELECT " + dato + " FROM " + tabla + " WHERE " + busqueda + "='" + igual + "';");
            ResultSet resultado = ps.executeQuery();
            while (resultado.next()) {
                objeto = resultado.getObject(dato);
            }
        } catch (SQLException ex) {
//            Logger.getLogger(Tabla.class.getName()).log(Level.SEVERE, null, ex);
            objeto = null;
        }

        return objeto;
    }

    public Object buscarNumero(String dato, String tabla, String busqueda, String igual) {
//    public void buscarTodo(String ID) {
        Object objeto = null;
        try {
            PreparedStatement ps = cnx.getCnx().prepareStatement("SELECT " + dato + " FROM " + tabla + " WHERE " + busqueda + "=" + igual + ";");
            ResultSet resultado = ps.executeQuery();
            while (resultado.next()) {
                objeto = resultado.getObject(dato);
            }
        } catch (SQLException ex) {
//            Logger.getLogger(Tabla.class.getName()).log(Level.SEVERE, null, ex);
            objeto = null;
        }
        cnx.cerrar();
        return objeto;
    }

}
