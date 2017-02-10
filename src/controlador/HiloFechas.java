package controlador;

import com.toedter.calendar.JDateChooser;

public class HiloFechas extends Thread {

    private JDateChooser dateSalida;
    private JDateChooser dateLlegada;

    public HiloFechas(JDateChooser dateSalida, JDateChooser dateLlegada) {
        this.dateSalida = dateSalida;
        this.dateLlegada = dateLlegada;
    }

    @Override
    public void run() {
        dateSalida.setMinSelectableDate(dateLlegada.getDate());

    }
}
