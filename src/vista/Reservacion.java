/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JOptionPane;
import modelo.Cliente;
import controlador.*;

/**
 *
 * @author Toshiba
 */
public class Reservacion extends javax.swing.JFrame {
    
    private Conexion cnx = new Conexion();
    public Guardar guardar;
    private int contador = 0;
    private FrameEdificio hotel = new FrameEdificio();
    private FrameHabitacion habitacion;
    private FrameEstadia estadia = new FrameEstadia();
    private FrameAlimentacion alimentacion = new FrameAlimentacion();
    private FrameRevisar revisar = new FrameRevisar();
    
    public Reservacion(Cliente cliente, Guardar guardar) {
        
        initComponents();
        this.guardar = guardar;
        guardar.setVisible(true);
        lblNombre.setText(cliente.getNombre() + " " + cliente.getApellido());
        lblUsuario.setText(cliente.getUsuario());
        panelNombre.setToolTipText("Click para cerrar sesion");
        setTitle("RESERVACION");
        
    }
    
    public Reservacion() {
        initComponents();
        
        guardar = new Guardar();
        guardar.setVisible(true);
        setTitle("RESERVACION");
        setLocationRelativeTo(null);
        panelNombre.setToolTipText("Click para cerrar sesion");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelGeneral = new javax.swing.JPanel();
        panelNombre = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        menuHotel = new javax.swing.JMenu();
        opcionHotel = new javax.swing.JMenuItem();
        opcHabitaciones = new javax.swing.JMenuItem();
        opcEstadia = new javax.swing.JMenuItem();
        opcAlimentacion = new javax.swing.JMenuItem();
        opcGuardar = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelGeneral.setPreferredSize(new java.awt.Dimension(634, 440));
        panelGeneral.setLayout(new java.awt.CardLayout());
        getContentPane().add(panelGeneral, java.awt.BorderLayout.CENTER);

        panelNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelNombreMouseClicked(evt);
            }
        });

        lblNombre.setText("CRISTIAN BETANCOURT");
        panelNombre.add(lblNombre);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("-");
        panelNombre.add(jLabel1);

        lblUsuario.setText("COD. USUARIO");
        panelNombre.add(lblUsuario);

        getContentPane().add(panelNombre, java.awt.BorderLayout.PAGE_START);

        jMenu3.setText("Reservar");

        menuHotel.setText("Nuevo");

        opcionHotel.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        opcionHotel.setText("Hoteles");
        opcionHotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionHotelActionPerformed(evt);
            }
        });
        menuHotel.add(opcionHotel);

        opcHabitaciones.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        opcHabitaciones.setText("Habitaciones");
        opcHabitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcHabitacionesActionPerformed(evt);
            }
        });
        menuHotel.add(opcHabitaciones);

        opcEstadia.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        opcEstadia.setText("Estadia ");
        opcEstadia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcEstadiaActionPerformed(evt);
            }
        });
        menuHotel.add(opcEstadia);

        opcAlimentacion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        opcAlimentacion.setText("Alimentacion");
        opcAlimentacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcAlimentacionActionPerformed(evt);
            }
        });
        menuHotel.add(opcAlimentacion);

        opcGuardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        opcGuardar.setText("Guardar");
        opcGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcGuardarActionPerformed(evt);
            }
        });
        menuHotel.add(opcGuardar);

        jMenu3.add(menuHotel);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Revisar");
        jMenu3.add(jMenuItem2);

        jMenuBar2.add(jMenu3);

        setJMenuBar(jMenuBar2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opcGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcGuardarActionPerformed
        if (contador > 5) {
            cambioFrame(5);
        } else {
            JOptionPane.showMessageDialog(null, "SELECCIONE UN HOTEL PARA EL HOSPEDAJE");
        }
    }//GEN-LAST:event_opcGuardarActionPerformed

    private void opcionHotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionHotelActionPerformed
        cambioFrame(1);
    }//GEN-LAST:event_opcionHotelActionPerformed

    private void opcHabitacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcHabitacionesActionPerformed
        if (contador != 0) {
            cambioFrame(2);
        } else {
            JOptionPane.showMessageDialog(null, "SELECCIONE UN HOTEL PARA EL HOSPEDAJE");
        }
    }//GEN-LAST:event_opcHabitacionesActionPerformed

    private void opcAlimentacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcAlimentacionActionPerformed
        if (contador > 1) {
            cambioFrame(4);
        } else {
            JOptionPane.showMessageDialog(null, "SELECCIONE UN HOTEL PARA EL HOSPEDAJE");
        }
    }//GEN-LAST:event_opcAlimentacionActionPerformed

    private void opcEstadiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcEstadiaActionPerformed
        if (contador > 1) {
            cambioFrame(3);
        } else {
            JOptionPane.showMessageDialog(null, "SELECCIONE UN HOTEL PARA EL HOSPEDAJE");
        }
    }//GEN-LAST:event_opcEstadiaActionPerformed

    private void panelNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelNombreMouseClicked
        if (JOptionPane.showConfirmDialog(null, "Desea cerrar cesion") == 0) {
            new Bienvenida().setVisible(true);
            guardar.dispose();
            dispose();
            
        }
    }//GEN-LAST:event_panelNombreMouseClicked
    
    private void cambioFrame(int i) {
        panelGeneral.removeAll();
        switch (i) {
            case 1:
                panelGeneral.add(hotel);
                contador++;
                
                break;
            
            case 2:
                try {
                    cnx.obtener();
                    int codigo = Integer.parseInt(new Tabla(cnx).buscarString("codigo", "edificio", "nombre", Guardar.lblHotel.getText()).toString());
                    panelGeneral.add(new FrameHabitacion(codigo));
                    contador++;
                    
                } catch (Exception e) {
                    jMenu3.setSelected(false);
                    JOptionPane.showMessageDialog(null, "Seleccione un hotel");
                }
                break;
            
            case 3:
                panelGeneral.add(estadia);
                contador++;
                break;
            
            case 4:
                panelGeneral.add(alimentacion);
                contador++;
                break;
            
            case 5:
                panelGeneral.add(revisar);
                contador++;
                break;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Reservacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reservacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reservacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reservacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reservacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JMenu menuHotel;
    private javax.swing.JMenuItem opcAlimentacion;
    private javax.swing.JMenuItem opcEstadia;
    private javax.swing.JMenuItem opcGuardar;
    private javax.swing.JMenuItem opcHabitaciones;
    private javax.swing.JMenuItem opcionHotel;
    private javax.swing.JPanel panelGeneral;
    private javax.swing.JPanel panelNombre;
    // End of variables declaration//GEN-END:variables

}
