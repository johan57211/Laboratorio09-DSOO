
package InterfazGrafica.panelEmpleado.PanelesMetodos;

import Banco.ClasesBase.*;
import Banco.GestorPrincipal.Banco;

public class EmpleadoRegistrarCliente extends javax.swing.JPanel {
    
    private Banco banco;
    private Usuario usuarioActual;
    
    public EmpleadoRegistrarCliente(Banco banco, Usuario usuarioActual) {
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
        dniField = new javax.swing.JTextField();
        numCuentaField = new javax.swing.JTextField();
        correoField = new javax.swing.JTextField();
        depositarBtn = new javax.swing.JButton();
        limpiarBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jTextField10 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        avisoErrorCorreo1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        edadField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        telefonoField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        contraseñaField = new javax.swing.JTextField();
        contraseñaError = new javax.swing.JLabel();
        avisoErrorNombre1 = new javax.swing.JLabel();
        avisoErrorDni1 = new javax.swing.JLabel();
        avisoErrorEdad1 = new javax.swing.JLabel();
        avisoErrorTelefono1 = new javax.swing.JLabel();
        avisoErrorCorreo2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 0, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Palatino Linotype", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registrar Cliente");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, 60));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "Inserte Datos Del Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Condensed", 1, 36), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Correo:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, 30));

        jLabel3.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("DATOS DE ACCESO");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("DNI: ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, 30));

        jLabel6.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("DATOS PERSONALES");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Nombre Completo:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, 30));

        dniField.setBackground(new java.awt.Color(255, 255, 255));
        dniField.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        dniField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        dniField.addActionListener(this::dniFieldActionPerformed);
        jPanel1.add(dniField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 170, 30));

        numCuentaField.setBackground(new java.awt.Color(255, 255, 255));
        numCuentaField.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        numCuentaField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        numCuentaField.addActionListener(this::numCuentaFieldActionPerformed);
        jPanel1.add(numCuentaField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 170, 30));

        correoField.setBackground(new java.awt.Color(255, 255, 255));
        correoField.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        correoField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        correoField.addActionListener(this::correoFieldActionPerformed);
        jPanel1.add(correoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 170, 30));

        depositarBtn.setBackground(new java.awt.Color(204, 0, 0));
        depositarBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        depositarBtn.setForeground(new java.awt.Color(255, 255, 255));
        depositarBtn.setText("Limpiar");
        depositarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        depositarBtn.setDefaultCapable(false);
        jPanel1.add(depositarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 180, 140, 50));

        limpiarBtn.setBackground(new java.awt.Color(204, 0, 0));
        limpiarBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        limpiarBtn.setForeground(new java.awt.Color(255, 255, 255));
        limpiarBtn.setText("Registrar");
        limpiarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        limpiarBtn.setDefaultCapable(false);
        limpiarBtn.addActionListener(this::limpiarBtnActionPerformed);
        jPanel1.add(limpiarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, 140, 50));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0), 3), "Registro Exitoso", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Roboto Condensed", 0, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField10.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        jTextField10.addActionListener(this::jTextField10ActionPerformed);
        jPanel2.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 170, -1));

        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Bienvenido Estimado Cliente: ");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        avisoErrorCorreo1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        avisoErrorCorreo1.setForeground(new java.awt.Color(0, 0, 204));
        jPanel2.add(avisoErrorCorreo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 200, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 440, 90));

        jLabel5.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Edad: ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, 30));

        edadField.setBackground(new java.awt.Color(255, 255, 255));
        edadField.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        edadField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        edadField.addActionListener(this::edadFieldActionPerformed);
        jPanel1.add(edadField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 170, 30));

        jLabel9.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Telefono: ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, 30));

        telefonoField.setBackground(new java.awt.Color(255, 255, 255));
        telefonoField.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        telefonoField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        telefonoField.addActionListener(this::telefonoFieldActionPerformed);
        jPanel1.add(telefonoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 170, 30));

        jLabel10.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Contraseña:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, -1, -1));

        contraseñaField.setBackground(new java.awt.Color(255, 255, 255));
        contraseñaField.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        contraseñaField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        contraseñaField.addActionListener(this::contraseñaFieldActionPerformed);
        jPanel1.add(contraseñaField, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 120, 170, 30));

        contraseñaError.setForeground(new java.awt.Color(153, 0, 0));
        jPanel1.add(contraseñaError, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 150, 170, 20));

        avisoErrorNombre1.setForeground(new java.awt.Color(153, 0, 0));
        jPanel1.add(avisoErrorNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 170, 20));

        avisoErrorDni1.setForeground(new java.awt.Color(153, 0, 0));
        jPanel1.add(avisoErrorDni1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 170, 20));

        avisoErrorEdad1.setForeground(new java.awt.Color(153, 0, 0));
        jPanel1.add(avisoErrorEdad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 170, 20));

        avisoErrorTelefono1.setForeground(new java.awt.Color(153, 0, 0));
        jPanel1.add(avisoErrorTelefono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 170, 20));

        avisoErrorCorreo2.setForeground(new java.awt.Color(153, 0, 0));
        jPanel1.add(avisoErrorCorreo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 170, 20));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 880, 570));
    }// </editor-fold>//GEN-END:initComponents

    private void dniFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dniFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dniFieldActionPerformed

    private void numCuentaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numCuentaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numCuentaFieldActionPerformed

    private void correoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correoFieldActionPerformed

    private void limpiarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_limpiarBtnActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void edadFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edadFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edadFieldActionPerformed

    private void telefonoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoFieldActionPerformed

    private void contraseñaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraseñaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contraseñaFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel avisoErrorCorreo1;
    private javax.swing.JLabel avisoErrorCorreo2;
    private javax.swing.JLabel avisoErrorDni1;
    private javax.swing.JLabel avisoErrorEdad1;
    private javax.swing.JLabel avisoErrorNombre1;
    private javax.swing.JLabel avisoErrorTelefono1;
    private javax.swing.JLabel contraseñaError;
    private javax.swing.JTextField contraseñaField;
    private javax.swing.JTextField correoField;
    private javax.swing.JButton depositarBtn;
    private javax.swing.JTextField dniField;
    private javax.swing.JTextField edadField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JButton limpiarBtn;
    private javax.swing.JTextField numCuentaField;
    private javax.swing.JTextField telefonoField;
    // End of variables declaration//GEN-END:variables
}
