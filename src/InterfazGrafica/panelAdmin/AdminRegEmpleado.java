package InterfazGrafica.panelAdmin;

import Banco.ClasesBase.Usuario;
import Banco.GestorPrincipal.Banco;

public class AdminRegEmpleado extends javax.swing.JPanel {
    private Banco banco;
    private Usuario usuarioActual;
    public AdminRegEmpleado(Banco banco, Usuario usuarioActual) {
        initComponents();
        this.banco = banco;
        this.usuarioActual = usuarioActual;
             
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        dniField = new javax.swing.JTextField();
        numCuentaField = new javax.swing.JTextField();
        titularField = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        depositarBtn = new javax.swing.JButton();
        limpiarBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jTextField10 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        titularField1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        titularField2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 0, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Palatino Linotype", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registrar Empleado");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, 60));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Inserte Datos Del Empleado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Condensed", 0, 24))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto Condensed", 0, 24)); // NOI18N
        jLabel2.setText("Correo");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto Condensed", 1, 24)); // NOI18N
        jLabel3.setText("DATOS DE ACCESO");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Condensed", 0, 24)); // NOI18N
        jLabel4.setText("DNI: ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto Condensed", 1, 24)); // NOI18N
        jLabel6.setText("DATOS PERSONALES");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto Condensed", 0, 24)); // NOI18N
        jLabel7.setText("Nombre Completo:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel8.setFont(new java.awt.Font("Roboto Condensed", 0, 24)); // NOI18N
        jLabel8.setText("Confirmar Contraseña:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, -1, -1));

        dniField.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        dniField.addActionListener(this::dniFieldActionPerformed);
        jPanel1.add(dniField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 170, 30));

        numCuentaField.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        numCuentaField.addActionListener(this::numCuentaFieldActionPerformed);
        jPanel1.add(numCuentaField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 170, 30));

        titularField.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        titularField.addActionListener(this::titularFieldActionPerformed);
        jPanel1.add(titularField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 170, 30));

        jTextField6.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        jTextField6.addActionListener(this::jTextField6ActionPerformed);
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 120, 190, 30));

        depositarBtn.setBackground(new java.awt.Color(204, 0, 0));
        depositarBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        depositarBtn.setForeground(new java.awt.Color(255, 255, 255));
        depositarBtn.setText("Limpiar");
        depositarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        depositarBtn.setDefaultCapable(false);
        jPanel1.add(depositarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 180, 40));

        limpiarBtn.setBackground(new java.awt.Color(204, 0, 0));
        limpiarBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        limpiarBtn.setForeground(new java.awt.Color(255, 255, 255));
        limpiarBtn.setText("Registrar");
        limpiarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        limpiarBtn.setDefaultCapable(false);
        limpiarBtn.addActionListener(this::limpiarBtnActionPerformed);
        jPanel1.add(limpiarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 180, 40));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0), 3), "Registro Exitoso", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Roboto Condensed", 0, 24))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField10.setFont(new java.awt.Font("Roboto Condensed", 0, 24)); // NOI18N
        jTextField10.addActionListener(this::jTextField10ActionPerformed);
        jPanel2.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 250, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel11.setText("Bienvenido Estimado Empleado: ");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 350, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 680, 150));

        jLabel5.setFont(new java.awt.Font("Roboto Condensed", 0, 24)); // NOI18N
        jLabel5.setText("Edad: ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        titularField1.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        titularField1.addActionListener(this::titularField1ActionPerformed);
        jPanel1.add(titularField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 170, 30));

        jLabel9.setFont(new java.awt.Font("Roboto Condensed", 0, 24)); // NOI18N
        jLabel9.setText("Telefono: ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        titularField2.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        titularField2.addActionListener(this::titularField2ActionPerformed);
        jPanel1.add(titularField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 170, 30));

        jLabel10.setFont(new java.awt.Font("Roboto Condensed", 0, 24)); // NOI18N
        jLabel10.setText("Contraseña:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, -1, -1));

        jTextField7.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        jTextField7.addActionListener(this::jTextField7ActionPerformed);
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 80, 190, 30));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 880, 580));
    }// </editor-fold>//GEN-END:initComponents

    private void dniFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dniFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dniFieldActionPerformed

    private void numCuentaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numCuentaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numCuentaFieldActionPerformed

    private void titularFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titularFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titularFieldActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void limpiarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_limpiarBtnActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void titularField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titularField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titularField1ActionPerformed

    private void titularField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titularField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titularField2ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton depositarBtn;
    private javax.swing.JTextField dniField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JButton limpiarBtn;
    private javax.swing.JTextField numCuentaField;
    private javax.swing.JTextField titularField;
    private javax.swing.JTextField titularField1;
    private javax.swing.JTextField titularField2;
    // End of variables declaration//GEN-END:variables
}
