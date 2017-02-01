package controlador;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {

    private final String BASE = "com.mysql.jdbc.Driver";
    private Connection cnx;

    public Conexion() {
    }

    public Conexion(Connection cnx) {
        this.cnx = cnx;
    }

    public Connection getCnx() {
        return cnx;
    }

    public void setCnx(Connection cnx) {
        this.cnx = cnx;
    }

    public Connection obtener() {
        if (cnx == null) {
            try {
                Class.forName(BASE);
                cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "Colapsolida-98");
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return cnx;
    }

    public void cerrar() {
        if (cnx != null) {
            try {
                cnx.close();
            } catch (SQLException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}
