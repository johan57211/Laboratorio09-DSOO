package InterfazGrafica.panelAdmin.PanelesMetodos;

import Banco.ClasesBase.*;
import Banco.GestorPrincipal.Banco;

public class Pnl_Admin_Abrir_Cuenta extends javax.swing.JPanel {

    private Banco banco;
    private Usuario usuarioActual;
    
    public Pnl_Admin_Abrir_Cuenta(Banco banco, Usuario usuarioActual) {
        initComponents();
        this.banco = banco;
        this.usuarioActual = usuarioActual;
        aperturaCuentaBoleta.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        numCuentaField = new javax.swing.JTextField();
        limpiarBtn = new javax.swing.JButton();
        aperturaCuentaBoleta = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        numeroCuenta = new javax.swing.JTextField();
        saldo = new javax.swing.JTextField();
        tipoCuenta = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        fechaApertura = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        titularDNI = new javax.swing.JTextField();
        btnAbrir = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        avisoError = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        claveField = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        tipoCuentaField = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(204, 0, 0));

        jLabel1.setFont(new java.awt.Font("Palatino Linotype", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Abrir Cuenta");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "Ingrese Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Condensed", 1, 24), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Ingrese DNI del Cliente: ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 190, 30));

        numCuentaField.setBackground(new java.awt.Color(255, 255, 255));
        numCuentaField.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        numCuentaField.addActionListener(this::numCuentaFieldActionPerformed);
        jPanel1.add(numCuentaField, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 170, 30));

        limpiarBtn.setBackground(new java.awt.Color(204, 0, 0));
        limpiarBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        limpiarBtn.setForeground(new java.awt.Color(255, 255, 255));
        limpiarBtn.setText("Limpiar");
        limpiarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        limpiarBtn.setDefaultCapable(false);
        limpiarBtn.addActionListener(this::limpiarBtnActionPerformed);
        jPanel1.add(limpiarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 110, 120, 40));

        aperturaCuentaBoleta.setBackground(new java.awt.Color(255, 255, 255));
        aperturaCuentaBoleta.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0), 3), "Apertura de Cuenta", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Roboto Condensed", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        aperturaCuentaBoleta.setForeground(new java.awt.Color(0, 0, 0));
        aperturaCuentaBoleta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Numero de Cuenta:");
        aperturaCuentaBoleta.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 49, -1, 30));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Saldo: ");
        aperturaCuentaBoleta.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 99, -1, 30));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Tipo de Cuenta:");
        aperturaCuentaBoleta.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 149, -1, 30));

        numeroCuenta.setBackground(new java.awt.Color(255, 255, 255));
        numeroCuenta.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        numeroCuenta.setForeground(new java.awt.Color(0, 0, 0));
        numeroCuenta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        numeroCuenta.addActionListener(this::numeroCuentaActionPerformed);
        aperturaCuentaBoleta.add(numeroCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 170, 30));

        saldo.setBackground(new java.awt.Color(255, 255, 255));
        saldo.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        saldo.setForeground(new java.awt.Color(0, 0, 0));
        saldo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        saldo.addActionListener(this::saldoActionPerformed);
        aperturaCuentaBoleta.add(saldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 170, 30));

        tipoCuenta.setBackground(new java.awt.Color(255, 255, 255));
        tipoCuenta.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        tipoCuenta.setForeground(new java.awt.Color(0, 0, 0));
        tipoCuenta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        tipoCuenta.addActionListener(this::tipoCuentaActionPerformed);
        aperturaCuentaBoleta.add(tipoCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 170, 30));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Fecha de Apertura:");
        aperturaCuentaBoleta.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, 30));

        fechaApertura.setBackground(new java.awt.Color(255, 255, 255));
        fechaApertura.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        fechaApertura.setForeground(new java.awt.Color(0, 0, 0));
        fechaApertura.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        fechaApertura.addActionListener(this::fechaAperturaActionPerformed);
        aperturaCuentaBoleta.add(fechaApertura, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 170, 30));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Titular DNI:");
        aperturaCuentaBoleta.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, 30));

        titularDNI.setBackground(new java.awt.Color(255, 255, 255));
        titularDNI.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        titularDNI.setForeground(new java.awt.Color(0, 0, 0));
        titularDNI.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        titularDNI.addActionListener(this::titularDNIActionPerformed);
        aperturaCuentaBoleta.add(titularDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 170, 30));

        jPanel1.add(aperturaCuentaBoleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 440, 330));

        btnAbrir.setBackground(new java.awt.Color(204, 0, 0));
        btnAbrir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAbrir.setForeground(new java.awt.Color(255, 255, 255));
        btnAbrir.setText("Abrir Cuenta");
        btnAbrir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAbrir.setDefaultCapable(false);
        btnAbrir.addActionListener(this::btnAbrirActionPerformed);
        jPanel1.add(btnAbrir, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 60, 120, 40));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 170, 20));

        avisoError.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        avisoError.setForeground(new java.awt.Color(153, 0, 0));
        avisoError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(avisoError, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 440, 40));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Clave:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 60, 30));

        claveField.setBackground(new java.awt.Color(255, 255, 255));
        claveField.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        claveField.addActionListener(this::claveFieldActionPerformed);
        jPanel1.add(claveField, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, 170, 30));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, 170, 20));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Ingrese Tipo de Cuenta: ");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 190, 30));

        tipoCuentaField.setBackground(new java.awt.Color(255, 255, 255));
        tipoCuentaField.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        tipoCuentaField.addActionListener(this::tipoCuentaFieldActionPerformed);
        jPanel1.add(tipoCuentaField, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 170, 30));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 170, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 920, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(14, 14, 14)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void numCuentaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numCuentaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numCuentaFieldActionPerformed

    private void limpiarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarBtnActionPerformed
        // TODO add your handling code here:
        limpiarFields();
        limpiarContrato();
        
        avisoError.setText("");

        aperturaCuentaBoleta.setVisible(false);
    }//GEN-LAST:event_limpiarBtnActionPerformed
    
    private void limpiarFields() {
        numCuentaField.setText("");
        tipoCuentaField.setText("");
        claveField.setText("");
    }
    
    private void limpiarContrato() {
        numeroCuenta.setText("");
        saldo.setText("");
        tipoCuenta.setText("");
        titularDNI.setText("");
        fechaApertura.setText("");
        avisoError.setText("");
    }
    
    private void numeroCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroCuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroCuentaActionPerformed

    private void saldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saldoActionPerformed

    private void tipoCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoCuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoCuentaActionPerformed

    private void fechaAperturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaAperturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaAperturaActionPerformed

    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed
        // TODO add your handling code here:

        String dni = numCuentaField.getText();
        String tipo = tipoCuentaField.getText();
        String claveEntrada = claveField.getText();

        try {
            Cuenta nuevaCuenta = banco.getgCuentas().abrirCuenta(dni, claveEntrada, tipo);
                    
            //Colocando en Contrato
            numeroCuenta.setText(String.valueOf(nuevaCuenta.getNumeroCuenta()));
            tipoCuenta.setText(nuevaCuenta.getTipoCuenta());
            saldo.setText(String.valueOf(nuevaCuenta.getSaldo()));
            fechaApertura.setText(String.valueOf(nuevaCuenta.getFechaApertura()));
            titularDNI.setText(dni);

            aperturaCuentaBoleta.setVisible(true);
            limpiarFields();
            avisoError.setText("");

        } catch (Exception e) {
            avisoError.setText(e.getMessage());
        }
    }//GEN-LAST:event_btnAbrirActionPerformed

    private void claveFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_claveFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_claveFieldActionPerformed

    private void tipoCuentaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoCuentaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoCuentaFieldActionPerformed

    private void titularDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titularDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titularDNIActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel aperturaCuentaBoleta;
    private javax.swing.JLabel avisoError;
    private javax.swing.JButton btnAbrir;
    private javax.swing.JTextField claveField;
    private javax.swing.JTextField fechaApertura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton limpiarBtn;
    private javax.swing.JTextField numCuentaField;
    private javax.swing.JTextField numeroCuenta;
    private javax.swing.JTextField saldo;
    private javax.swing.JTextField tipoCuenta;
    private javax.swing.JTextField tipoCuentaField;
    private javax.swing.JTextField titularDNI;
    // End of variables declaration//GEN-END:variables
}
