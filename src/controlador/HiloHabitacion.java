package controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JRadioButton;

public class HiloHabitacion extends Thread {

    private Conexion cnx = new Conexion();
    private int codigoEdificio;
    private List<JRadioButton> botones;

    public HiloHabitacion() {
    }

    public HiloHabitacion(int codigoEdificio, List<JRadioButton> lista) {
        this.codigoEdificio = codigoEdificio;
        this.botones = botones;
    }

    @Override
    public void run() {

        List<String> bloqueo = new ArrayList();
        cnx.obtener();
        try {
            PreparedStatement ps = cnx.getCnx().prepareStatement("SELECT codigo_habitacion FROM habitacion WHERE Edificio_codigo=" + codigoEdificio + " && cliente_codigoCliente IS NOT NULL");
            ResultSet resultado = ps.executeQuery();
            int row = 0;
            while (resultado.next()) {

                bloqueo.add(resultado.getString(1));

            }

        } catch (SQLException ex) {
            Logger.getLogger(HiloHabitacion.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (String comp : bloqueo) {
            for (JRadioButton rbt : botones) {
                if (comp.substring(2).equals(rbt.getName())) {
//                   
                    rbt.setSelected(true);
                    rbt.setEnabled(false);
                }
            }

        }
        stop();
    }
}
