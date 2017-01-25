package controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.*;

public class Tabla {

    private Cliente cliente;
    private Conexion cnx;
    private Habitacion habitacion;
    private Edificio edificio;
    private Empleado empleado;

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
    public int agregarValores(Object objeto, int opc) {
        int valor = 0;
        switch (opc) {
            case 1:

                try {
                    cliente = (Cliente) objeto;
                    //preparar coneccion
                    //            PreparedStatement ps = cnx.getCnx().prepareStatement("INSERT INTO tablacliente VALUES (?,?)"); 
                    //            ps.setString(1,"Cristian");
                    //            ps.setString(2, "Betancourt");
                    PreparedStatement ps = cnx.getCnx().prepareStatement("INSERT INTO cliente" + " VALUES (" + cliente.getNombre() + ", " + cliente.getApellido() + ", " + cliente.getNacionalidad() + ", " + cliente.getCi() + ", " + cliente.getFechadenacimiento() + ", " + cliente.getNumeroTelefonico() + ", " + cliente.getUsuario() + ", " + cliente.getClave() + ", " + 1 + ")");
//                    PreparedStatement ps = cnx.getCnx().prepareStatement("INSERT INTO cliente" + " VALUES ('Cristian', 'Betancourt', 'ECUADOR´,'1718057688', '09/03/1998', '0984190613', 'usuario','clave',?, 001,?)");
                    System.out.println(cliente.getNombre());
//            "INSERT INTO Customers " + "VALUES (1001, 'Simpson', 'Mr.', 'Springfield', 2001)");
                    valor = ps.executeUpdate();
                } catch (SQLException ex) {
                    valor = -1;
                }
                cnx.cerrar();

                break;

            case 2:

                try {
                    habitacion = (Habitacion) objeto;
                    PreparedStatement ps = cnx.getCnx().prepareStatement("INSERT INTO cliente" + " VALUES (" + cliente.getNombre() + ", " + cliente.getApellido() + ", " + cliente.getNacionalidad() + ", " + cliente.getCi() + ", " + cliente.getFechadenacimiento() + ", " + cliente.getNumeroTelefonico() + ", " + cliente.getUsuario() + ", " + cliente.getClave() + ", " + 1 + ")");

                    System.out.println(cliente.getNombre());

                    valor = ps.executeUpdate();
                } catch (SQLException ex) {
                    valor = -1;
                }
                cnx.cerrar();

                break;

            case 3:

                try {
                    edificio = (Edificio) objeto;
                    PreparedStatement ps = cnx.getCnx().prepareStatement("INSERT INTO cliente" + " VALUES (" + cliente.getNombre() + ", " + cliente.getApellido() + ", " + cliente.getNacionalidad() + ", " + cliente.getCi() + ", " + cliente.getFechadenacimiento() + ", " + cliente.getNumeroTelefonico() + ", " + cliente.getUsuario() + ", " + cliente.getClave() + ", " + 1 + ")");
//                   
                    System.out.println(cliente.getNombre());
//            
                    valor = ps.executeUpdate();
                } catch (SQLException ex) {
                    valor = -1;
                }
                cnx.cerrar();

                break;

            case 4:

                try {
                    empleado = (Empleado) objeto;
                    PreparedStatement ps = cnx.getCnx().prepareStatement("INSERT INTO cliente" + " VALUES (" + cliente.getNombre() + ", " + cliente.getApellido() + ", " + cliente.getNacionalidad() + ", " + cliente.getCi() + ", " + cliente.getFechadenacimiento() + ", " + cliente.getNumeroTelefonico() + ", " + cliente.getUsuario() + ", " + cliente.getClave() + ", " + 1 + ")");
//                               
                    valor = ps.executeUpdate();
                } catch (SQLException ex) {
                    valor = -1;
                }
                cnx.cerrar();

                break;
        }
        return valor;
    }

    public void buscarTodo() {
//    public void buscarTodo(String ID) {

        try {
            PreparedStatement ps = cnx.getCnx().prepareStatement("SELECT * FROM TablaCliente;");
            ResultSet resultado = ps.executeQuery();
            while (resultado.next()) {
                //crear un new tabla para pasar parametros
//                System.out.println(resultado.getInt("codigo"));
//                System.out.println(resultado.getDouble("parametro1"));
//                System.out.println(resultado.getDouble("parametro2"));

            }
        } catch (SQLException ex) {
            Logger.getLogger(Tabla.class.getName()).log(Level.SEVERE, null, ex);
        }
        cnx.cerrar();
    }
}
