
package InterfazGrafica.panelEmpleado.PanelesMetodos;

import Banco.ClasesBase.*;
import Banco.GestorPrincipal.Banco;

public class EmpleadoDeposito extends javax.swing.JPanel {
    private Banco banco;
    private Usuario usuarioActual;
    
    public EmpleadoDeposito(Banco banco, Usuario usuarioActual) {
        initComponents();
        this.banco = banco;
        this.usuarioActual = usuarioActual;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        dniField = new javax.swing.JTextField();
        numCuentaField = new javax.swing.JTextField();
        montoField = new javax.swing.JTextField();
        depositarBtn = new javax.swing.JButton();
        limpiarBtn = new javax.swing.JButton();
        boleta = new javax.swing.JPanel();
        numTransField = new javax.swing.JTextField();
        numField = new javax.swing.JTextField();
        depositadoField = new javax.swing.JTextField();
        salAnteriorField = new javax.swing.JTextField();
        salActualField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        avisoErrorDni = new javax.swing.JLabel();
        avisoErrorGrande = new javax.swing.JLabel();
        avisoErrorNumCuenta = new javax.swing.JLabel();
        avisoErrorMonto1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 0, 0));

        jLabel1.setFont(new java.awt.Font("Palatino Linotype", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Deposito Bancario");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Inserte Datos Del Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Condensed", 0, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("DATOS DE LA TRANSACCION");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("DNI: ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, 30));

        jLabel6.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("DATOS DEL CLIENTE");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("NUMERO DE LA CUENTA: ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 30));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("MONTO A DEPOSITAR: ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, -1, 30));

        dniField.setBackground(new java.awt.Color(255, 255, 255));
        dniField.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        dniField.setForeground(new java.awt.Color(0, 0, 0));
        dniField.addActionListener(this::dniFieldActionPerformed);
        jPanel1.add(dniField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 170, 30));

        numCuentaField.setBackground(new java.awt.Color(255, 255, 255));
        numCuentaField.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        numCuentaField.setForeground(new java.awt.Color(0, 0, 0));
        numCuentaField.addActionListener(this::numCuentaFieldActionPerformed);
        jPanel1.add(numCuentaField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 170, 30));

        montoField.setBackground(new java.awt.Color(255, 255, 255));
        montoField.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        montoField.setForeground(new java.awt.Color(0, 0, 0));
        montoField.addActionListener(this::montoFieldActionPerformed);
        jPanel1.add(montoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 70, 170, 30));

        depositarBtn.setBackground(new java.awt.Color(204, 0, 0));
        depositarBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        depositarBtn.setForeground(new java.awt.Color(255, 255, 255));
        depositarBtn.setText("Depositar");
        depositarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        depositarBtn.setDefaultCapable(false);
        jPanel1.add(depositarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, 120, 40));

        limpiarBtn.setBackground(new java.awt.Color(204, 0, 0));
        limpiarBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        limpiarBtn.setForeground(new java.awt.Color(255, 255, 255));
        limpiarBtn.setText("Limpiar");
        limpiarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        limpiarBtn.setDefaultCapable(false);
        jPanel1.add(limpiarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, 120, 40));

        boleta.setBackground(new java.awt.Color(255, 255, 255));
        boleta.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0), 3), "Deposito Exitoso", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Roboto Condensed", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        boleta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        numTransField.setBackground(new java.awt.Color(255, 255, 255));
        numTransField.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        numTransField.setForeground(new java.awt.Color(0, 0, 0));
        numTransField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        numTransField.addActionListener(this::numTransFieldActionPerformed);
        boleta.add(numTransField, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 170, -1));

        numField.setBackground(new java.awt.Color(255, 255, 255));
        numField.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        numField.setForeground(new java.awt.Color(0, 0, 0));
        numField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        numField.addActionListener(this::numFieldActionPerformed);
        boleta.add(numField, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 170, -1));

        depositadoField.setBackground(new java.awt.Color(255, 255, 255));
        depositadoField.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        depositadoField.setForeground(new java.awt.Color(0, 0, 0));
        depositadoField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        depositadoField.addActionListener(this::depositadoFieldActionPerformed);
        boleta.add(depositadoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 170, -1));

        salAnteriorField.setBackground(new java.awt.Color(255, 255, 255));
        salAnteriorField.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        salAnteriorField.setForeground(new java.awt.Color(0, 0, 0));
        salAnteriorField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        salAnteriorField.addActionListener(this::salAnteriorFieldActionPerformed);
        boleta.add(salAnteriorField, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 170, -1));

        salActualField.setBackground(new java.awt.Color(255, 255, 255));
        salActualField.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        salActualField.setForeground(new java.awt.Color(0, 0, 0));
        salActualField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        salActualField.addActionListener(this::salActualFieldActionPerformed);
        boleta.add(salActualField, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 170, -1));

        jLabel13.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Saldo Actual: ");
        boleta.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        jLabel14.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Numero de Transaccion: ");
        boleta.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, 20));

        jLabel15.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Numero de Cuenta: ");
        boleta.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, 20));

        jLabel16.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Monto Depositado: ");
        boleta.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, 20));

        jLabel17.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Saldo Anterior:");
        boleta.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, -1, 20));

        jPanel1.add(boleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 550, 320));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 100, 170, 10));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 170, 10));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 170, 10));

        avisoErrorDni.setForeground(new java.awt.Color(153, 0, 0));
        jPanel1.add(avisoErrorDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 170, 20));

        avisoErrorGrande.setForeground(new java.awt.Color(153, 0, 0));
        jPanel1.add(avisoErrorGrande, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 430, 30));

        avisoErrorNumCuenta.setForeground(new java.awt.Color(153, 0, 0));
        jPanel1.add(avisoErrorNumCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 170, 20));

        avisoErrorMonto1.setForeground(new java.awt.Color(153, 0, 0));
        jPanel1.add(avisoErrorMonto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 100, 170, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 861, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void dniFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dniFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dniFieldActionPerformed

    private void numCuentaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numCuentaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numCuentaFieldActionPerformed

    private void montoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_montoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_montoFieldActionPerformed

    private void salActualFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salActualFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salActualFieldActionPerformed

    private void numTransFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numTransFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numTransFieldActionPerformed

    private void numFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numFieldActionPerformed

    private void depositadoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositadoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_depositadoFieldActionPerformed

    private void salAnteriorFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salAnteriorFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salAnteriorFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel avisoErrorDni;
    private javax.swing.JLabel avisoErrorGrande;
    private javax.swing.JLabel avisoErrorMonto1;
    private javax.swing.JLabel avisoErrorNumCuenta;
    private javax.swing.JPanel boleta;
    private javax.swing.JTextField depositadoField;
    private javax.swing.JButton depositarBtn;
    private javax.swing.JTextField dniField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JButton limpiarBtn;
    private javax.swing.JTextField montoField;
    private javax.swing.JTextField numCuentaField;
    private javax.swing.JTextField numField;
    private javax.swing.JTextField numTransField;
    private javax.swing.JTextField salActualField;
    private javax.swing.JTextField salAnteriorField;
    // End of variables declaration//GEN-END:variables
}
