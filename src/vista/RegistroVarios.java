package vista;

import controlador.Conexion;
import controlador.TablaCliente;
import java.awt.Color;
import java.sql.Connection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.*;

public class RegistroVarios extends javax.swing.JPanel {

    controlador.Validacion validar = new controlador.Validacion();
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
    String confirmacion = validar.encriptaEnMD5(validar.encriptaEnMD5("12345"));
    String clave1, clave2;
    Cliente cliente;
    Empleado empleado;

    public RegistroVarios() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtnombres = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtapellidos = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtci = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtclave1 = new javax.swing.JPasswordField();
        jProgressBar1 = new javax.swing.JProgressBar();
        btnvolver = new javax.swing.JButton();
        btnregistrar = new javax.swing.JButton();
        btnlimpiar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtclave2 = new javax.swing.JPasswordField();
        cmbcontinente = new javax.swing.JComboBox<>();
        cmbpais = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        btncliente = new javax.swing.JToggleButton();
        btnadmin = new javax.swing.JToggleButton();
        nacimiento = new com.toedter.calendar.JDateChooser();
        lblconfirmacion = new javax.swing.JLabel();

        setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 24))); // NOI18N

        jLabel1.setText("Nombres:");

        txtnombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombresKeyTyped(evt);
            }
        });

        jLabel2.setText("Apellidos:");

        txtapellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtapellidosKeyTyped(evt);
            }
        });

        jLabel3.setText("Cédula o Pasaporte:");

        txtci.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtciKeyTyped(evt);
            }
        });

        jLabel4.setText("Fecha Nacimiento:");

        jLabel5.setText("Nacionalidad:");

        jLabel6.setText("Número Telefónico:");

        txttelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelefonoKeyTyped(evt);
            }
        });

        jLabel7.setText("Usuario:");

        txtusuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtusuarioKeyTyped(evt);
            }
        });

        jLabel8.setText("Contraseña:");

        txtclave1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtclave1KeyTyped(evt);
            }
        });

        jProgressBar1.setForeground(new java.awt.Color(10, 200, 100));
        jProgressBar1.setToolTipText("");

        btnvolver.setText("Volver");
        btnvolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvolverActionPerformed(evt);
            }
        });

        btnregistrar.setText("Registrarme");
        btnregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarActionPerformed(evt);
            }
        });

        btnlimpiar.setText("Limpiar");

        jLabel9.setText("Validacion contraseña:");

        txtclave2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtclave2KeyTyped(evt);
            }
        });

        cmbcontinente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Continente", "Africa", "America", "Asia", "Europa", "Oceanía" }));

        cmbpais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel13.setText("Tipo:");

        btncliente.setSelected(true);
        btncliente.setText("Cliente");
        btncliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclienteActionPerformed(evt);
            }
        });

        btnadmin.setText("Administrador");
        btnadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel13)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtnombres)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnadmin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                .addComponent(btncliente, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtci)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cmbcontinente, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbpais, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtapellidos)
                            .addComponent(nacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txttelefono)
                            .addComponent(txtusuario)
                            .addComponent(txtclave1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtclave2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblconfirmacion, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnregistrar)
                                .addGap(18, 18, 18)
                                .addComponent(btnlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnvolver, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(60, 60, 60))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbcontinente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbpais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnadmin)
                    .addComponent(jLabel13)
                    .addComponent(btncliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtclave1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtclave2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(lblconfirmacion)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnlimpiar)
                    .addComponent(btnvolver)
                    .addComponent(btnregistrar))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents

    private void btnadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadminActionPerformed
        try {
            if (confirmacion.equals(validar.encriptaEnMD5(validar.encriptaEnMD5(JOptionPane.showInputDialog("Clave de confirmación"))))) {
                btnadmin.setSelected(true);
                btncliente.setSelected(false);
            } else {
                btncliente.setSelected(true);
                btnadmin.setSelected(false);
            }
        } catch (Exception ex) {
            btncliente.setSelected(true);
            btnadmin.setSelected(false);
        }
    }//GEN-LAST:event_btnadminActionPerformed

    private void btnclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclienteActionPerformed
        btnadmin.setSelected(false);
        btncliente.setSelected(true);

    }//GEN-LAST:event_btnclienteActionPerformed

    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed
        String nombres = txtnombres.getText();
        String apellidos = txtapellidos.getText();
        String id = txtci.getText();
        String fechaNacimiento;
        fechaNacimiento = fechaNacimiento();
        String nacionalidad = "Ecuador";

        String telefono = txttelefono.getText();
        String usuario = txtusuario.getText();
        clave1 = txtclave1.getText();
        clave2 = txtclave2.getText();

        List<String> campos = new ArrayList<>();
        campos.add(nombres);
        campos.add(apellidos);
        campos.add(id);
        campos.add(telefono);
        campos.add(usuario);
        campos.add(clave1);
        campos.add(clave2);

        List<Integer> camposVacios = validar.camposVacios(campos);
        if (!camposVacios.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campos obligatorios vacios"); //mensaje

            for (Integer camposVacio : camposVacios) {  //devuelve la psocion de la lista de campos vacios leyendo la lista

                switch (camposVacio) {
                    case 0:
                        txtnombres.setBackground(Color.red);
                        break;
                    case 1:
                        txtapellidos.setBackground(Color.red);
                        break;
                    case 2:
                        txtci.setBackground(Color.red);
                        break;
                    case 3:
                        txttelefono.setBackground(Color.red);
                        break;
                    case 4:
                        txtusuario.setBackground(Color.red);
                        break;
                    case 5:
                        txtclave1.setBackground(Color.red);
                        break;
                    case 6:
                        txtclave2.setBackground(Color.red);
                        lblconfirmacion.setForeground(Color.red);
                        lblconfirmacion.setText("Contraseña incorrecta");
                        break;

                }
            }
        } else if (validar.encriptaEnMD5(validar.encriptaEnMD5(clave1)).equals(validar.encriptaEnMD5(validar.encriptaEnMD5(clave2)))) {
            lblconfirmacion.setForeground(Color.green);
            lblconfirmacion.setText("Contraseña correcta");
            if (btncliente.isSelected()) {
                cliente = new Cliente(usuario, validar.encriptaEnMD5(validar.encriptaEnMD5(clave1)), nombres, apellidos, nacionalidad, id, fechaNacimiento, telefono);
                cliente.setCodigoUsuario(1);
                cliente.setAlimentacion("null");
                Conexion conexion = new Conexion();
                conexion.obtener();
                new TablaCliente(conexion).agregarValores(cliente);
//                Reservacion reservacion = new Reservacion(cliente);
//                reservacion.setVisible(true);
//                dispose();
            } else {
                empleado = new Empleado(usuario, validar.encriptaEnMD5(validar.encriptaEnMD5(clave1)), nombres, apellidos, nacionalidad, id, fechaNacimiento, telefono);

            }

            Ingreso ingreso = new Ingreso();
            ingreso.setVisible(true);
        } else {
            lblconfirmacion.setForeground(Color.red);
            lblconfirmacion.setText("Contraseña incorrecta");
        }
    }//GEN-LAST:event_btnregistrarActionPerformed

    private void btnvolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvolverActionPerformed
        Bienvenida bienvenida = new Bienvenida();
        bienvenida.setVisible(true);

    }//GEN-LAST:event_btnvolverActionPerformed

    private void txtusuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtusuarioKeyTyped
        txtusuario.setBackground(Color.white);
        char c;
        letrasNumeros(c = evt.getKeyChar(), evt, 3);
    }//GEN-LAST:event_txtusuarioKeyTyped

    private void txttelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoKeyTyped
        txttelefono.setBackground(Color.white);
        char c;
        letrasNumeros(c = evt.getKeyChar(), evt, 2);
    }//GEN-LAST:event_txttelefonoKeyTyped

    private void txtnombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombresKeyTyped
        txtnombres.setBackground(Color.white);
        char c;
        letrasNumeros(c = evt.getKeyChar(), evt, 1);
    }//GEN-LAST:event_txtnombresKeyTyped

    private void txtclave1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtclave1KeyTyped
        txtclave1.setBackground(Color.white);
        String clave = txtclave1.getText();
        jProgressBar1.setValue(validar.validarClave(clave));
        jProgressBar1.revalidate();
    }//GEN-LAST:event_txtclave1KeyTyped

    private void txtapellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidosKeyTyped
        txtapellidos.setBackground(Color.white);
        char c;
        letrasNumeros(c = evt.getKeyChar(), evt, 1);
    }//GEN-LAST:event_txtapellidosKeyTyped

    private void txtciKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtciKeyTyped
        txtci.setBackground(Color.white);
    }//GEN-LAST:event_txtciKeyTyped

    private void txtclave2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtclave2KeyTyped
        txtclave2.setBackground(Color.white);


    }//GEN-LAST:event_txtclave2KeyTyped

    public void letrasNumeros(char c, java.awt.event.KeyEvent evt, int tipo) {
        switch (tipo) {
            case 1:
                if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c != 32)) {
                    evt.consume();
                }
                break;

            case 2:
                if ((c < '0' || c > '9') && (c < 'A' || c > 'Z')) {
                    evt.consume();
                }
                break;

            case 3:
                if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c < '0' || c > '9')) {
                    evt.consume();
                }
                break;

        }

    }

    public String fechaNacimiento() {
        String fechaNacimiento;
        try {
            fechaNacimiento = sdf.format(nacimiento.getDate());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Fecha de nacimiento incorrecta");
            Date date = new Date();
            fechaNacimiento = sdf.format(date);
            try {
                date = sdf.parse(fechaNacimiento);
                nacimiento.setDate(date);
            } catch (ParseException ex1) {

            }

        }
        return fechaNacimiento;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnadmin;
    private javax.swing.JToggleButton btncliente;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton btnregistrar;
    private javax.swing.JButton btnvolver;
    private javax.swing.JComboBox<String> cmbcontinente;
    private javax.swing.JComboBox<String> cmbpais;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel lblconfirmacion;
    private com.toedter.calendar.JDateChooser nacimiento;
    private javax.swing.JTextField txtapellidos;
    private javax.swing.JTextField txtci;
    private javax.swing.JPasswordField txtclave1;
    private javax.swing.JPasswordField txtclave2;
    private javax.swing.JTextField txtnombres;
    private javax.swing.JTextField txttelefono;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
