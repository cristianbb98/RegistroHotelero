/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.LeerEscribirArchivos;
import modelo.Edificio;

/**
 *
 * @author Toshiba
 */
public class FrameEdificio extends javax.swing.JInternalFrame {

    
    public FrameEdificio() {
        initComponents();
        this.setTitle("SELECCIONE UN HOTEL");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelEdificios = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        atacames = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        tonsupa = new javax.swing.JButton();
        jPanel23 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        crucita = new javax.swing.JButton();
        jPanel25 = new javax.swing.JPanel();
        salinas = new javax.swing.JButton();

        getContentPane().setLayout(new java.awt.CardLayout());

        panelEdificios.setLayout(new javax.swing.BoxLayout(panelEdificios, javax.swing.BoxLayout.Y_AXIS));

        jPanel6.setPreferredSize(new java.awt.Dimension(422, 230));
        jPanel6.setLayout(new javax.swing.BoxLayout(jPanel6, javax.swing.BoxLayout.LINE_AXIS));

        jPanel9.setPreferredSize(new java.awt.Dimension(182, 230));
        jPanel9.setLayout(new javax.swing.BoxLayout(jPanel9, javax.swing.BoxLayout.LINE_AXIS));

        atacames.setFont(new java.awt.Font("Agency FB", 3, 48)); // NOI18N
        atacames.setForeground(new java.awt.Color(255, 51, 51));
        atacames.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atacames.jpg"))); // NOI18N
        atacames.setText("ATACAMES");
        atacames.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        atacames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atacamesActionPerformed(evt);
            }
        });
        jPanel9.add(atacames);

        jPanel6.add(jPanel9);

        jPanel8.setPreferredSize(new java.awt.Dimension(182, 230));
        jPanel8.setLayout(new javax.swing.BoxLayout(jPanel8, javax.swing.BoxLayout.LINE_AXIS));

        tonsupa.setFont(new java.awt.Font("Agency FB", 3, 48)); // NOI18N
        tonsupa.setForeground(new java.awt.Color(255, 51, 51));
        tonsupa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/crucita.jpg"))); // NOI18N
        tonsupa.setText("TONSUPA");
        tonsupa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tonsupa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tonsupaActionPerformed(evt);
            }
        });
        jPanel8.add(tonsupa);

        jPanel6.add(jPanel8);

        panelEdificios.add(jPanel6);

        jPanel23.setLayout(new javax.swing.BoxLayout(jPanel23, javax.swing.BoxLayout.LINE_AXIS));

        jPanel24.setPreferredSize(new java.awt.Dimension(182, 230));
        jPanel24.setLayout(new javax.swing.BoxLayout(jPanel24, javax.swing.BoxLayout.LINE_AXIS));

        crucita.setFont(new java.awt.Font("Agency FB", 3, 48)); // NOI18N
        crucita.setForeground(new java.awt.Color(255, 51, 51));
        crucita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tonsupa.jpg"))); // NOI18N
        crucita.setText("CRUCITA");
        crucita.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        crucita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crucitaActionPerformed(evt);
            }
        });
        jPanel24.add(crucita);

        jPanel23.add(jPanel24);

        jPanel25.setPreferredSize(new java.awt.Dimension(182, 230));
        jPanel25.setLayout(new javax.swing.BoxLayout(jPanel25, javax.swing.BoxLayout.LINE_AXIS));

        salinas.setFont(new java.awt.Font("Agency FB", 3, 48)); // NOI18N
        salinas.setForeground(new java.awt.Color(255, 51, 51));
        salinas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salinas.jpg"))); // NOI18N
        salinas.setText("SALINAS");
        salinas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        salinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salinasActionPerformed(evt);
            }
        });
        jPanel25.add(salinas);

        jPanel23.add(jPanel25);

        panelEdificios.add(jPanel23);

        getContentPane().add(panelEdificios, "card3");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atacamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atacamesActionPerformed
//        controlador.LeerEscribirArchivos leer = new LeerEscribirArchivos();
//        leer.leerArchivos("edificios");

        new Reservacion().cambioFrame(2);

    }//GEN-LAST:event_atacamesActionPerformed

    private void tonsupaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tonsupaActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_tonsupaActionPerformed

    private void crucitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crucitaActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_crucitaActionPerformed

    private void salinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salinasActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_salinasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atacames;
    private javax.swing.JButton crucita;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel panelEdificios;
    private javax.swing.JButton salinas;
    private javax.swing.JButton tonsupa;
    // End of variables declaration//GEN-END:variables
}
