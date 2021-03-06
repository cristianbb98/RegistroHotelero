package vista;

import com.jtattoo.plaf.acryl.AcrylLookAndFeel;
import javax.swing.*;

public class Bienvenida extends javax.swing.JFrame {

    
    public Bienvenida() {
        initComponents();
        setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        aluminiumLookAndFeel1 = new com.jtattoo.plaf.aluminium.AluminiumLookAndFeel();
        acrylBorders1 = new com.jtattoo.plaf.acryl.AcrylBorders();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnavanzar = new javax.swing.JButton();
        rbtingresar = new javax.swing.JRadioButton();
        rbtregistro = new javax.swing.JRadioButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        jLabel1.setText("BIENVENIDOS AL SISTEMA DE REGISTRO HOTELERO");

        btnavanzar.setText("Avanzar");
        btnavanzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnavanzarActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtingresar);
        rbtingresar.setSelected(true);
        rbtingresar.setText("Ingresar");

        buttonGroup1.add(rbtregistro);
        rbtregistro.setText("Registrarme");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel1)
                .addGap(79, 81, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtregistro)
                    .addComponent(rbtingresar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnavanzar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(rbtingresar)
                        .addGap(7, 7, 7)
                        .addComponent(rbtregistro)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnavanzar)
                        .addGap(44, 44, 44))))
        );

        getContentPane().add(jPanel1, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnavanzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnavanzarActionPerformed
        if (rbtregistro.isSelected()) {
            Registros registro = new Registros();
            registro.setVisible(true);
            dispose();
        } else {
            Ingreso ingreso = new Ingreso();
            ingreso.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btnavanzarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new AcrylLookAndFeel());
        } catch (Exception ex) {
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bienvenida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.jtattoo.plaf.acryl.AcrylBorders acrylBorders1;
    private com.jtattoo.plaf.aluminium.AluminiumLookAndFeel aluminiumLookAndFeel1;
    private javax.swing.JButton btnavanzar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton rbtingresar;
    private javax.swing.JRadioButton rbtregistro;
    // End of variables declaration//GEN-END:variables
}
