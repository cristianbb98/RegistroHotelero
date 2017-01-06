package controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Cliente;

public class TablaCliente {

    private Conexion cnx;

    public TablaCliente() {
    }

    public TablaCliente(Conexion cnx) {
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

        int valor;
        try {
            //preparar coneccion
            PreparedStatement ps = cnx.getCnx().prepareStatement("INSERT INTO tablacliente VALUES (?,?)"); 
            ps.setString(1,"Cristian");
            ps.setString(2, "Betancourt");
//            PreparedStatement ps = cnx.getCnx().prepareStatement("INSERT INTO tablacliente" + " VALUES (" + cliente.getNombre() + "," + cliente.getApellido() + "," + cliente.getNacionalidad() + "," + cliente.getCi() + "," + cliente.getFechadenacimiento() + "," + cliente.getNumeroTelefonico() + "," + cliente.getUsuario() + "," + cliente.getClave() + "," + 1 +")");
            System.out.println(cliente.getNombre());
//            "INSERT INTO Customers " + "VALUES (1001, 'Simpson', 'Mr.', 'Springfield', 2001)");
            valor = ps.executeUpdate();
        } catch (SQLException ex) {
            valor = -1;
        }
        cnx.cerrar();
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
            Logger.getLogger(TablaCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        cnx.cerrar();
    }
}
