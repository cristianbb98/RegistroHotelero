/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.*;
import javax.swing.JRadioButton;

public class FrameHabitacion extends javax.swing.JInternalFrame {

    public String edificio;
    public List<JRadioButton> lista = new ArrayList();

    public FrameHabitacion() {
        initComponents();
        lista.add(hb101);
        lista.add(hb102);
        lista.add(hb103);
        lista.add(hb201);
        lista.add(hb202);
        lista.add(hb203);
        lista.add(hb301);
        lista.add(hb302);
        lista.add(hb303);
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelHabitaciones = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        hb101 = new javax.swing.JRadioButton();
        hb102 = new javax.swing.JRadioButton();
        hb103 = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        hb201 = new javax.swing.JRadioButton();
        hb202 = new javax.swing.JRadioButton();
        hb203 = new javax.swing.JRadioButton();
        jPanel14 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        hb301 = new javax.swing.JRadioButton();
        hb302 = new javax.swing.JRadioButton();
        hb303 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(634, 439));

        panelHabitaciones.setPreferredSize(new java.awt.Dimension(610, 479));
        panelHabitaciones.setLayout(new java.awt.CardLayout());

        jPanel13.setMinimumSize(new java.awt.Dimension(300, 400));
        jPanel13.setPreferredSize(new java.awt.Dimension(0, 0));
        jPanel13.setLayout(new javax.swing.BoxLayout(jPanel13, javax.swing.BoxLayout.Y_AXIS));

        jPanel5.setPreferredSize(new java.awt.Dimension(300, 10));
        jPanel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 50, 5));

        jLabel14.setText("Habitacion");
        jPanel5.add(jLabel14);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("1");
        jPanel5.add(jLabel5);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("2");
        jPanel5.add(jLabel6);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("3");
        jPanel5.add(jLabel7);

        jPanel13.add(jPanel5);

        jPanel15.setPreferredSize(new java.awt.Dimension(300, 20));
        jPanel15.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 30, 5));

        jLabel3.setText("Piso #1:        ");
        jPanel15.add(jLabel3);
        jPanel15.add(hb101);

        hb102.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hb102ActionPerformed(evt);
            }
        });
        jPanel15.add(hb102);

        hb103.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hb103ActionPerformed(evt);
            }
        });
        jPanel15.add(hb103);

        jPanel13.add(jPanel15);

        jPanel4.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel4.setPreferredSize(new java.awt.Dimension(300, 20));
        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 30, 5));

        jLabel1.setText("Piso #2:        ");
        jPanel4.add(jLabel1);

        hb201.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hb201ActionPerformed(evt);
            }
        });
        jPanel4.add(hb201);

        hb202.setForeground(new java.awt.Color(153, 255, 51));
        hb202.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hb202ActionPerformed(evt);
            }
        });
        jPanel4.add(hb202);

        hb203.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hb203ActionPerformed(evt);
            }
        });
        jPanel4.add(hb203);

        jPanel13.add(jPanel4);

        jPanel14.setPreferredSize(new java.awt.Dimension(300, 20));
        jPanel14.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 30, 5));

        jLabel2.setText("Piso #3:        ");
        jPanel14.add(jLabel2);

        hb301.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hb301ActionPerformed(evt);
            }
        });
        jPanel14.add(hb301);

        hb302.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hb302ActionPerformed(evt);
            }
        });
        jPanel14.add(hb302);

        hb303.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hb303ActionPerformed(evt);
            }
        });
        jPanel14.add(hb303);

        jPanel13.add(jPanel14);

        panelHabitaciones.add(jPanel13, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelHabitaciones, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hb201ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hb201ActionPerformed

    }//GEN-LAST:event_hb201ActionPerformed

    private void hb202ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hb202ActionPerformed

    }//GEN-LAST:event_hb202ActionPerformed

    private void hb203ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hb203ActionPerformed

    }//GEN-LAST:event_hb203ActionPerformed

    private void hb301ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hb301ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hb301ActionPerformed

    private void hb302ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hb302ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hb302ActionPerformed

    private void hb303ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hb303ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hb303ActionPerformed

    private void hb103ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hb103ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hb103ActionPerformed

    private void hb102ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hb102ActionPerformed

    }//GEN-LAST:event_hb102ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton hb101;
    private javax.swing.JRadioButton hb102;
    private javax.swing.JRadioButton hb103;
    private javax.swing.JRadioButton hb201;
    private javax.swing.JRadioButton hb202;
    private javax.swing.JRadioButton hb203;
    private javax.swing.JRadioButton hb301;
    private javax.swing.JRadioButton hb302;
    private javax.swing.JRadioButton hb303;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel panelHabitaciones;
    // End of variables declaration//GEN-END:variables
}
