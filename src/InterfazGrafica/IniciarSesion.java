
package InterfazGrafica;

import java.awt.Color;

public class IniciarSesion extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(IniciarSesion.class.getName());

    public IniciarSesion() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        iconoBanco = new javax.swing.JLabel();
        bancoLabel = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        sesionLabel = new javax.swing.JLabel();
        cargoBox = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();
        userField = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        passLabel = new javax.swing.JLabel();
        passField = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        loginBtn = new javax.swing.JPanel();
        loginBtnTxt = new javax.swing.JLabel();
        lateralmg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.white);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(900, 300));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(java.awt.Color.white);
        jPanel2.setMinimumSize(new java.awt.Dimension(650, 500));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconoBanco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/iconoBank.png"))); // NOI18N
        iconoBanco.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel2.add(iconoBanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 70, 70));

        bancoLabel.setFont(new java.awt.Font("Roboto Condensed", 0, 24)); // NOI18N
        bancoLabel.setText("Banco Nacional Cerdita");
        jPanel2.add(bancoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        userLabel.setFont(new java.awt.Font("Roboto Condensed", 0, 18)); // NOI18N
        userLabel.setText("Usuario*");
        jPanel2.add(userLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        sesionLabel.setFont(new java.awt.Font("Segoe UI Semilight", 0, 36)); // NOI18N
        sesionLabel.setText("Iniciar Sesion");
        jPanel2.add(sesionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        cargoBox.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        cargoBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona Rol", "Administrador", "Empleado", "Cliente" }));
        cargoBox.setBorder(null);
        cargoBox.addActionListener(this::cargoBoxActionPerformed);
        jPanel2.add(cargoBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 330, -1));

        userField.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        userField.setForeground(new java.awt.Color(153, 153, 153));
        userField.setText("Ingrese su nombre de Usuario");
        userField.setBorder(null);
        userField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                userFieldMousePressed(evt);
            }
        });
        userField.addActionListener(this::userFieldActionPerformed);
        jPanel2.add(userField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 350, 30));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 330, -1));

        passLabel.setFont(new java.awt.Font("Roboto Condensed", 0, 18)); // NOI18N
        passLabel.setText("Contraseña*");
        jPanel2.add(passLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        passField.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        passField.setForeground(new java.awt.Color(153, 153, 153));
        passField.setText("********");
        passField.setBorder(null);
        passField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passFieldMousePressed(evt);
            }
        });
        passField.addActionListener(this::passFieldActionPerformed);
        jPanel2.add(passField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 330, 30));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 330, -1));

        loginBtn.setBackground(new java.awt.Color(204, 0, 0));
        loginBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginBtnTxt.setBackground(new java.awt.Color(255, 0, 0));
        loginBtnTxt.setFont(new java.awt.Font("Roboto Condensed", 0, 18)); // NOI18N
        loginBtnTxt.setForeground(new java.awt.Color(255, 255, 255));
        loginBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginBtnTxt.setText("INGRESAR");
        loginBtnTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBtnTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginBtnTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginBtnTxtMouseExited(evt);
            }
        });
        loginBtn.add(loginBtnTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 40));

        jPanel2.add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 150, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 400, 450));

        lateralmg.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lateralmg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Lateral.png"))); // NOI18N
        lateralmg.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(lateralmg, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 0, 550, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userFieldActionPerformed
        
    }//GEN-LAST:event_userFieldActionPerformed

    private void passFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passFieldActionPerformed

    private void cargoBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargoBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cargoBoxActionPerformed

    private void loginBtnTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnTxtMouseClicked
        javax.swing.JOptionPane.showMessageDialog(this, "Intento de login con los datos:\nUsuario: " + userField.getText() + "\nContraseña: " + String.valueOf(passField.getPassword()), "LOGGIN", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_loginBtnTxtMouseClicked

    private void loginBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnTxtMouseEntered
        loginBtn.setBackground(new Color(255, 55, 47));
    }//GEN-LAST:event_loginBtnTxtMouseEntered

    private void loginBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnTxtMouseExited
        loginBtn.setBackground(new Color(255,0,0));
    }//GEN-LAST:event_loginBtnTxtMouseExited

    private void userFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userFieldMousePressed
        if(userField.getText().equals("Ingrese su nombre de Usuario")) {
            userField.setText("");
            userField.setForeground(Color.black);
        }
        if(String.valueOf(passField.getPassword()).isEmpty()) {
            passField.setText("********");
            passField.setForeground(Color.gray);
        }
    }//GEN-LAST:event_userFieldMousePressed

    private void passFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passFieldMousePressed
        if(String.valueOf(passField.getPassword()).equals("********")) {
            passField.setText("");
            passField.setForeground(Color.black);
        }
        if(userField.getText().isEmpty()) {
            userField.setText("Ingrese su nombre de Usuario");
            userField.setForeground(Color.gray);
        }
    }//GEN-LAST:event_passFieldMousePressed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new IniciarSesion().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bancoLabel;
    private javax.swing.JComboBox<String> cargoBox;
    private javax.swing.JLabel iconoBanco;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lateralmg;
    private javax.swing.JPanel loginBtn;
    private javax.swing.JLabel loginBtnTxt;
    private javax.swing.JPasswordField passField;
    private javax.swing.JLabel passLabel;
    private javax.swing.JLabel sesionLabel;
    private javax.swing.JTextField userField;
    private javax.swing.JLabel userLabel;
    // End of variables declaration//GEN-END:variables
}
