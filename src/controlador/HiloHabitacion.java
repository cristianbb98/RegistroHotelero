package controlador;

import java.util.List;
import javax.swing.JRadioButton;

public class HiloHabitacion extends Thread {

    private String edificio;
    private List<JRadioButton> lista;

    public HiloHabitacion() {
    }

    public HiloHabitacion(String edificio, List<JRadioButton> lista) {
        this.edificio = edificio;
        this.lista = lista;
    }

    @Override
    public void run() {

    }
}
