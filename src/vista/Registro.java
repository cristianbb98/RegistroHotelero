package vista;

import controlador.Conexion;
import controlador.TablaCliente;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import modelo.*;

public class Registro extends javax.swing.JFrame {

    controlador.Validacion validar = new controlador.Validacion();
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
    String confirmacion = validar.encriptaEnMD5(validar.encriptaEnMD5("12345"));
    String clave1, clave2;
    Cliente cliente;
    Empleado empleado;
    String ciudadania;

    public Registro() {
        initComponents();
        setLocationRelativeTo(null);
        nacionalidad.setModel(nacionalidad());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panelGeneral = new javax.swing.JPanel();
        panelDatos = new javax.swing.JPanel();
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
        jLabel9 = new javax.swing.JLabel();
        txtclave2 = new javax.swing.JPasswordField();
        nacionalidad = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        btncliente = new javax.swing.JToggleButton();
        btnadmin = new javax.swing.JToggleButton();
        nacimiento = new com.toedter.calendar.JDateChooser();
        lblconfirmacion = new javax.swing.JLabel();
        panelBotones = new javax.swing.JPanel();
        btnvolver = new javax.swing.JButton();
        btnlimpiar = new javax.swing.JButton();
        btnregistrar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        panelDatos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombres:");
        panelDatos.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 14, -1, -1));

        txtnombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombresKeyTyped(evt);
            }
        });
        panelDatos.add(txtnombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 11, 232, -1));

        jLabel2.setText("Apellidos:");
        panelDatos.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 45, -1, -1));

        txtapellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtapellidosKeyTyped(evt);
            }
        });
        panelDatos.add(txtapellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 42, 232, -1));

        jLabel3.setText("Cédula o Pasaporte:");
        panelDatos.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 107, -1, -1));

        txtci.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtciKeyTyped(evt);
            }
        });
        panelDatos.add(txtci, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 104, 232, -1));

        jLabel4.setText("Fecha Nacimiento:");
        panelDatos.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 141, -1, -1));

        jLabel5.setText("Nacionalidad:");
        panelDatos.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 76, -1, -1));

        jLabel6.setText("Número Telefónico:");
        panelDatos.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 169, -1, -1));

        txttelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelefonoKeyTyped(evt);
            }
        });
        panelDatos.add(txttelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 166, 232, -1));

        jLabel7.setText("Usuario:");
        panelDatos.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 234, -1, -1));

        txtusuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtusuarioKeyTyped(evt);
            }
        });
        panelDatos.add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 231, 232, -1));

        jLabel8.setText("Contraseña:");
        panelDatos.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 265, -1, -1));

        txtclave1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtclave1KeyTyped(evt);
            }
        });
        panelDatos.add(txtclave1, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 262, 232, -1));

        jProgressBar1.setForeground(new java.awt.Color(10, 200, 100));
        jProgressBar1.setToolTipText("");
        panelDatos.add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 288, 232, -1));

        jLabel9.setText("Validacion contraseña:");
        panelDatos.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 315, -1, -1));

        txtclave2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtclave2KeyTyped(evt);
            }
        });
        panelDatos.add(txtclave2, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 312, 232, -1));

        nacionalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE UN PAIS" }));
        nacionalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nacionalidadActionPerformed(evt);
            }
        });
        panelDatos.add(nacionalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 73, 232, -1));

        jLabel13.setText("Tipo:");
        panelDatos.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 201, -1, -1));

        btncliente.setSelected(true);
        btncliente.setText("Cliente");
        btncliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclienteActionPerformed(evt);
            }
        });
        panelDatos.add(btncliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 197, 99, -1));

        btnadmin.setText("Administrador");
        btnadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadminActionPerformed(evt);
            }
        });
        panelDatos.add(btnadmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 197, -1, -1));
        panelDatos.add(nacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 135, 232, -1));
        panelDatos.add(lblconfirmacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 338, 153, 11));

        panelBotones.setLayout(new java.awt.GridBagLayout());

        btnvolver.setText("Volver");
        btnvolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvolverActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 25;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 28, 0, 67);
        panelBotones.add(btnvolver, gridBagConstraints);

        btnlimpiar.setText("Limpiar");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 24;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 29, 0, 0);
        panelBotones.add(btnlimpiar, gridBagConstraints);

        btnregistrar.setText("Registrarme");
        btnregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 93, 0, 0);
        panelBotones.add(btnregistrar, gridBagConstraints);

        javax.swing.GroupLayout panelGeneralLayout = new javax.swing.GroupLayout(panelGeneral);
        panelGeneral.setLayout(panelGeneralLayout);
        panelGeneralLayout.setHorizontalGroup(
            panelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addComponent(panelDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelGeneralLayout.setVerticalGroup(
            panelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGeneralLayout.createSequentialGroup()
                .addComponent(panelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(panelGeneral, new java.awt.GridBagConstraints());

        pack();
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

    private void nacionalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nacionalidadActionPerformed
        if (nacionalidad.getSelectedIndex() == 0) {
            ciudadania = null;
        } else {
            ciudadania = nacionalidad.getSelectedItem().toString();
        }
    }//GEN-LAST:event_nacionalidadActionPerformed

    private void txtclave2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtclave2KeyTyped
        txtclave2.setBackground(Color.white);
    }//GEN-LAST:event_txtclave2KeyTyped

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        txtnombres.setText(null);
        txtapellidos.setText(null);
        txtci.setText(null);
        txtclave1.setText(null);
        txtclave2.setText(null);
        txttelefono.setText(null);
        txtusuario.setText(null);
        nacionalidad.setSelectedIndex(0);
        nacimiento.setDate(null);
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed
        String nombres = txtnombres.getText();
        String apellidos = txtapellidos.getText();
        String id = txtci.getText();
        String fechaNacimiento;
        fechaNacimiento = fechaNacimiento();

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
        } else if ((validar.encriptaEnMD5(validar.encriptaEnMD5(clave1)).equals(validar.encriptaEnMD5(validar.encriptaEnMD5(clave2)))) && fechaNacimiento != null && ciudadania != null) {
            lblconfirmacion.setForeground(Color.green);
            lblconfirmacion.setText("Contraseña correcta");
            if (btncliente.isSelected()) {
                cliente = new Cliente(usuario, validar.encriptaEnMD5(validar.encriptaEnMD5(clave1)), nombres, apellidos, ciudadania, id, fechaNacimiento, telefono);
                cliente.setCodigoUsuario(1);
                cliente.setAlimentacion("null");
                Conexion conexion = new Conexion();
                conexion.obtener();
                new TablaCliente(conexion).agregarValores(cliente);

                //                Reservacion reservacion = new Reservacion(cliente);
                //                reservacion.setVisible(true);
                //                dispose();
            } else {
                empleado = new Empleado(usuario, validar.encriptaEnMD5(validar.encriptaEnMD5(clave1)), nombres, apellidos, ciudadania, id, fechaNacimiento, telefono);

            }

            Ingreso ingreso = new Ingreso();
            ingreso.setVisible(true);
        } else if (!(validar.encriptaEnMD5(validar.encriptaEnMD5(clave1)).equals(validar.encriptaEnMD5(validar.encriptaEnMD5(clave2))))) {
            lblconfirmacion.setForeground(Color.red);
            lblconfirmacion.setText("Contraseña incorrecta");

        } else if (fechaNacimiento == null) {
            JOptionPane.showMessageDialog(null, "Fecha de nacimiento incorecta");

        } else if (ciudadania == null) {
            JOptionPane.showMessageDialog(null, "Nacionalidad incorrecta");
        }
    }//GEN-LAST:event_btnregistrarActionPerformed

    private void btnvolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvolverActionPerformed
        Bienvenida bienvenida = new Bienvenida();
        bienvenida.setVisible(true);
    }//GEN-LAST:event_btnvolverActionPerformed

    private void txtclave1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtclave1KeyTyped
        txtclave1.setBackground(Color.white);
        String clave = txtclave1.getText();
        jProgressBar1.setValue(validar.validarClave(clave));
        jProgressBar1.revalidate();
    }//GEN-LAST:event_txtclave1KeyTyped

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

    private void txtciKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtciKeyTyped
        txtci.setBackground(Color.white);
    }//GEN-LAST:event_txtciKeyTyped

    private void txtapellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidosKeyTyped
        txtapellidos.setBackground(Color.white);
        char c;
        letrasNumeros(c = evt.getKeyChar(), evt, 1);
    }//GEN-LAST:event_txtapellidosKeyTyped

    private void txtnombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombresKeyTyped
        txtnombres.setBackground(Color.white);
        char c;
        letrasNumeros(c = evt.getKeyChar(), evt, 1);
    }//GEN-LAST:event_txtnombresKeyTyped

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
            fechaNacimiento = null;
        }
        return fechaNacimiento;
    }

    public DefaultComboBoxModel nacionalidad() {
        DefaultComboBoxModel paises = new DefaultComboBoxModel();
        paises.addElement("SELECCIONE UN PAIS");
        paises.addElement("AALAND ISLANDS");
        paises.addElement("AFGHANISTAN");
        paises.addElement("ALBANIA");
        paises.addElement("ALGERIA");
        paises.addElement("AMERICAN SAMOA");
        paises.addElement("ANDORRA");
        paises.addElement("ANGOLA");
        paises.addElement("ANGUILLA");
        paises.addElement("ANTARCTICA");
        paises.addElement("ANTIGUA AND BARBUDA");
        paises.addElement("ARGENTINA");
        paises.addElement("ARMENIA");
        paises.addElement("ARUBA");
        paises.addElement("AUSTRALIA");
        paises.addElement("AUSTRIA");
        paises.addElement("AZERBAIJAN");
        paises.addElement("BAHAMAS");
        paises.addElement("BAHRAIN");
        paises.addElement("BANGLADESH");
        paises.addElement("BARBADOS");
        paises.addElement("BELARUS");
        paises.addElement("BELGIUM");
        paises.addElement("BELIZE");
        paises.addElement("BENIN");
        paises.addElement("BERMUDA");
        paises.addElement("BHUTA");
        paises.addElement("BOLIVIA");
        paises.addElement("BOSNIA AND HERZEGOWINA");
        paises.addElement("BOTSWANA");
        paises.addElement("BOUVET ISLAND");
        paises.addElement("BRAZIL");
        paises.addElement("BRITISH INDIAN OCEAN TERRITORY");
        paises.addElement("BRUNEI DARUSSALAM");
        paises.addElement("BULGARIA");
        paises.addElement("BURKINA FASO");
        paises.addElement("BURUNDI");
        paises.addElement("CAMBODIA");
        paises.addElement("CAMEROON");
        paises.addElement("CANADA");
        paises.addElement("CAPE VERDE");
        paises.addElement("CAYMAN ISLANDS");
        paises.addElement("CENTRAL AFRICAN REPUBLIC");
        paises.addElement("CHAD");
        paises.addElement("CHILE");
        paises.addElement("CHINA");
        paises.addElement("CHRISTMAS ISLAND");
        paises.addElement("COCOS ISLANDS");
        paises.addElement("COLOMBIA");
        paises.addElement("COMOROS");
        paises.addElement("CONGO");
        paises.addElement("COOK ISLANDS");
        paises.addElement("COSTA RICA");
        paises.addElement("COTE D'IVOIRE");
        paises.addElement("CROATIA");
        paises.addElement("CUBA");
        paises.addElement("CYPRUS");
        paises.addElement("CZECH REPUBLIC");
        paises.addElement("DENMARK");
        paises.addElement("DJIBOUTI");
        paises.addElement("DOMINICA");
        paises.addElement("DOMINICAN REPUBLIC");
        paises.addElement("ECUADOR");
        paises.addElement("EGYPT");
        paises.addElement("EL SALVADOR");
        paises.addElement("EQUATORIAL GUINEA");
        paises.addElement("ERITREA");
        paises.addElement("ESTONIA");
        paises.addElement("ETHIOPIA");
        paises.addElement("FALKLAND ISLANDS (MALVINAS)");
        paises.addElement("FAROE ISLANDS");
        paises.addElement("FIJI");
        paises.addElement("FINLAND");
        paises.addElement("FRANCE");
        paises.addElement("FRENCH GUIANA");
        paises.addElement("FRENCH POLYNESIA");
        paises.addElement("FRENCH SOUTHERN TERRITORIES");
        paises.addElement("GABON");
        paises.addElement("GAMBIA");
        paises.addElement("GEORGIA");
        paises.addElement("GERMANY");
        paises.addElement("GHANA");
        paises.addElement("GIBRALTAR");
        paises.addElement("GREECE");
        paises.addElement("GREENLA");
        paises.addElement("GUADELOUPE");
        paises.addElement("GUAM");
        paises.addElement("GUATEMALA");
        paises.addElement("GUINEA");
        paises.addElement("GUINEA-BISSAU");
        paises.addElement("GUYANA");
        paises.addElement("HAITI");
        paises.addElement("HEARD AND MC DONALD ISLANDS");
        paises.addElement("HONDURAS");
        paises.addElement("HONG KONG");
        paises.addElement("HUNGARY");
        paises.addElement("ICELAND");
        paises.addElement("INDIA");
        paises.addElement("INDONESIA");
        paises.addElement("IRAN");
        paises.addElement("IRAQ");
        paises.addElement("IRELAND");
        paises.addElement("ISRAEL");
        paises.addElement("ITALY");
        paises.addElement("JAMAICA");
        paises.addElement("JAPAN");
        paises.addElement("JORDAN");
        paises.addElement("KAZAKHSTAN");
        paises.addElement("KENYA");
        paises.addElement("KIRIBATI");
        paises.addElement("KOREA NH");
        paises.addElement("KOREA SH");
        paises.addElement("KUWAIT");
        paises.addElement("KYRGYZSTAN");
        paises.addElement("LAO");
        paises.addElement("LATVIA");
        paises.addElement("LEBANON");
        paises.addElement("LESOTHO");
        paises.addElement("LIBERIA");
        paises.addElement("LIBYAN ARAB JAMAHIRIA");
        paises.addElement("LIECHTENSTEIN");
        paises.addElement("LITHUANIA");
        paises.addElement("LUXEMBOURG");
        paises.addElement("MACAU");
        paises.addElement("MACEDONIA");
        paises.addElement("MADAGASCAR");
        paises.addElement("MALAWI");
        paises.addElement("MALAYSIA");
        paises.addElement("MALDIVES");
        paises.addElement("MALI");
        paises.addElement("MALTA");
        paises.addElement("MARSHALL ISLANDS");
        paises.addElement("MARTINIQUE");
        paises.addElement("MAURITANIA");
        paises.addElement("MAURITIUS");
        paises.addElement("MAYOTTE");
        paises.addElement("MEXICO");
        paises.addElement("MICRONESIA");
        paises.addElement("MOLDOVA");
        paises.addElement("MONACO");
        paises.addElement("MONGOLIA");
        paises.addElement("MONTSERRAT");
        paises.addElement("MOROCCO");
        paises.addElement("MOZAMBIQUE");
        paises.addElement("MYANMAR");
        paises.addElement("NAMIBIA");
        paises.addElement("NAURU");
        paises.addElement("NEPAL");
        paises.addElement("NETHERLANDS");
        paises.addElement("NETHERLANDS ANTILLES");
        paises.addElement("NEW CALEDONIA");
        paises.addElement("NEW ZEALAND");
        paises.addElement("NICARAGUA");
        paises.addElement("NIGER");
        paises.addElement("NIGERIA");
        paises.addElement("NIUE");
        paises.addElement("NORFOLK ISLAND");
        paises.addElement("NORTHERN MARIANA ISLANDS");
        paises.addElement("NORWAY");
        paises.addElement("OMAN");
        paises.addElement("PAKISTAN");
        paises.addElement("PALAU");
        paises.addElement("PALESTINIAN TERRITORY");
        paises.addElement("PANAMA");
        paises.addElement("PAPUA NEW GUINEA");
        paises.addElement("PARAGUAY");
        paises.addElement("PERU");
        paises.addElement("PHILIPPINES");
        paises.addElement("PITCAIRN");
        paises.addElement("POLAND");
        paises.addElement("PORTUGAL");
        paises.addElement("PUERTO RICO");
        paises.addElement("QATAR");
        paises.addElement("REUNION");
        paises.addElement("ROMANIA");
        paises.addElement("RUSSIAN FEDERATION");
        paises.addElement("RWANDA");
        paises.addElement("SAINT HELENA");
        paises.addElement("SAINT KITTS AND NEVIS");
        paises.addElement("SAINT LUCIA");
        paises.addElement("SAINT PIERRE AND MIQUELON");
        paises.addElement("SAINT VINCENT AND THE GRENADINES");
        paises.addElement("SAMOA");
        paises.addElement("SAN MARINO");
        paises.addElement("SAO TOME AND PRINCIPE");
        paises.addElement("SAUDI ARABIA");
        paises.addElement("SENEGAL");
        paises.addElement("SERBIA AND MONTENEGRO");
        paises.addElement("SEYCHELLES");
        paises.addElement("SIERRA LEONE");
        paises.addElement("SINGAPORE");
        paises.addElement("SLOVAKIA");
        paises.addElement("SLOVENIA");
        paises.addElement("SOLOMON ISLANDS");
        paises.addElement("SOMALIA");
        paises.addElement("SOUTH AFRICA");
        paises.addElement("SOUTH GEORGIA AND THE SOUTH SANDWICH ISLANW");
        paises.addElement("SPAIN");
        paises.addElement("SRI LANKA");
        paises.addElement("SUDAN");
        paises.addElement("SURINAME");
        paises.addElement("SVALBARD AND JAN MAYEN ISLANDS");
        paises.addElement("SWAZILAND");
        paises.addElement("SWEDEN");
        paises.addElement("SWITZERLAND");
        paises.addElement("SYRIAN ARAB REPUBLIC");
        paises.addElement("TAIWAN");
        paises.addElement("TAJIKISTAN");
        paises.addElement("TANZANIA");
        paises.addElement("THAILAND");
        paises.addElement("TIMOR-LESTE");
        paises.addElement("TOGO");
        paises.addElement("TOKELAU");
        paises.addElement("TONGA");
        paises.addElement("TRINIDAD AND TOBAGO");
        paises.addElement("TUNISIA");
        paises.addElement("TURKEY");
        paises.addElement("TURKMENISTAN");
        paises.addElement("TURKS AND CAICOS ISLANDS");
        paises.addElement("TUVALU");
        paises.addElement("UGANDA");
        paises.addElement("UKRAINE");
        paises.addElement("UNITED ARAB EMIRATES");
        paises.addElement("UNITED KINGDOM");
        paises.addElement("UNITED STATES");
        paises.addElement("UNITED STATES MINOR OUTLYING ISLANDS");
        paises.addElement("URUGUAY");
        paises.addElement("UZBEKISTAN");
        paises.addElement("VANUATU");
        paises.addElement("VATICAN CITY STATE");
        paises.addElement("VENEZUELA");
        paises.addElement("VIET NAM");
        paises.addElement("VIRGIN ISLANDS BR");
        paises.addElement("VIRGIN ISLANDS US");
        paises.addElement("WALLIS AND FUTUNA ISLANDS");
        paises.addElement("WESTERN SAHARA");
        paises.addElement("YEMEN");
        paises.addElement("ZAMBIA");
        paises.addElement("ZIMBABWE");
        return paises;
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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnadmin;
    private javax.swing.JToggleButton btncliente;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton btnregistrar;
    private javax.swing.JButton btnvolver;
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
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblconfirmacion;
    private com.toedter.calendar.JDateChooser nacimiento;
    private javax.swing.JComboBox<String> nacionalidad;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JPanel panelGeneral;
    private javax.swing.JTextField txtapellidos;
    private javax.swing.JTextField txtci;
    private javax.swing.JPasswordField txtclave1;
    private javax.swing.JPasswordField txtclave2;
    private javax.swing.JTextField txtnombres;
    private javax.swing.JTextField txttelefono;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
