
package InterfazGrafica.panelEmpleado.PanelesMetodos;

import Banco.ClasesBase.*;
import Banco.GestorPrincipal.Banco;

public class EmpleadoConsultarInformacion extends javax.swing.JPanel {
    private Banco banco;
    private Usuario usuarioActual;
    
    public EmpleadoConsultarInformacion(Banco banco, Usuario usuarioActual) {
        initComponents();
        this.banco = banco;
        this.usuarioActual = usuarioActual;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        numCuentaEntrada = new javax.swing.JTextField();
        limpiarBtn = new javax.swing.JButton();
        datosCliente = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        nombreCliente = new javax.swing.JTextField();
        dniCliente = new javax.swing.JTextField();
        correoCliente = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        fechaRegistroCliente = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        edadCliente = new javax.swing.JTextField();
        buscarBtn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        avisoErrorClienteNoEncontrado = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        avisoError1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 0, 0));

        jLabel1.setFont(new java.awt.Font("Palatino Linotype", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Consultar Cliente");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Busque Al Cliente por DNI", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Condensed", 1, 36), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Ingrese DNI del Cliente: ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 220, 30));

        numCuentaEntrada.setBackground(new java.awt.Color(255, 255, 255));
        numCuentaEntrada.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        numCuentaEntrada.setForeground(new java.awt.Color(0, 0, 0));
        numCuentaEntrada.addActionListener(this::numCuentaEntradaActionPerformed);
        jPanel1.add(numCuentaEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 170, 30));

        limpiarBtn.setBackground(new java.awt.Color(204, 0, 0));
        limpiarBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        limpiarBtn.setForeground(new java.awt.Color(255, 255, 255));
        limpiarBtn.setText("Limpiar");
        limpiarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        limpiarBtn.setDefaultCapable(false);
        limpiarBtn.addActionListener(this::limpiarBtnActionPerformed);
        jPanel1.add(limpiarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 60, 120, 40));

        datosCliente.setBackground(new java.awt.Color(255, 255, 255));
        datosCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0), 3), "Cliente Encontrado", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Roboto Condensed", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        datosCliente.setForeground(new java.awt.Color(0, 0, 0));
        datosCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Nombre:");
        datosCliente.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, 30));

        jLabel10.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("DNI: ");
        datosCliente.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, 30));

        jLabel12.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Correo: ");
        datosCliente.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, -1, 30));

        nombreCliente.setBackground(new java.awt.Color(255, 255, 255));
        nombreCliente.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        nombreCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        nombreCliente.addActionListener(this::nombreClienteActionPerformed);
        datosCliente.add(nombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 170, 30));

        dniCliente.setBackground(new java.awt.Color(255, 255, 255));
        dniCliente.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        dniCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        dniCliente.addActionListener(this::dniClienteActionPerformed);
        datosCliente.add(dniCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 170, 30));

        correoCliente.setBackground(new java.awt.Color(255, 255, 255));
        correoCliente.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        correoCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        correoCliente.addActionListener(this::correoClienteActionPerformed);
        datosCliente.add(correoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 170, 30));

        jLabel11.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Fecha de Registro:");
        datosCliente.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, -1, 30));

        fechaRegistroCliente.setBackground(new java.awt.Color(255, 255, 255));
        fechaRegistroCliente.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        fechaRegistroCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        fechaRegistroCliente.addActionListener(this::fechaRegistroClienteActionPerformed);
        datosCliente.add(fechaRegistroCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 170, 30));

        jLabel13.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Edad:");
        datosCliente.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, -1, 30));

        edadCliente.setBackground(new java.awt.Color(255, 255, 255));
        edadCliente.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        edadCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        edadCliente.addActionListener(this::edadClienteActionPerformed);
        datosCliente.add(edadCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 170, 30));

        jPanel1.add(datosCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 520, 370));

        buscarBtn.setBackground(new java.awt.Color(204, 0, 0));
        buscarBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buscarBtn.setForeground(new java.awt.Color(255, 255, 255));
        buscarBtn.setText("Buscar");
        buscarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscarBtn.setDefaultCapable(false);
        buscarBtn.addActionListener(this::buscarBtnActionPerformed);
        jPanel1.add(buscarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 120, 40));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 170, 20));

        avisoErrorClienteNoEncontrado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        avisoErrorClienteNoEncontrado.setForeground(new java.awt.Color(153, 0, 0));
        avisoErrorClienteNoEncontrado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(avisoErrorClienteNoEncontrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 510, 40));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 170, 20));

        avisoError1.setForeground(new java.awt.Color(153, 0, 0));
        jPanel1.add(avisoError1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 170, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 879, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void limpiarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_limpiarBtnActionPerformed

    private void numCuentaEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numCuentaEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numCuentaEntradaActionPerformed

    private void nombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreClienteActionPerformed

    private void dniClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dniClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dniClienteActionPerformed

    private void correoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correoClienteActionPerformed

    private void fechaRegistroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaRegistroClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaRegistroClienteActionPerformed

    private void buscarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarBtnActionPerformed

    private void edadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edadClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edadClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel avisoError1;
    private javax.swing.JLabel avisoErrorClienteNoEncontrado;
    private javax.swing.JButton buscarBtn;
    private javax.swing.JTextField correoCliente;
    private javax.swing.JPanel datosCliente;
    private javax.swing.JTextField dniCliente;
    private javax.swing.JTextField edadCliente;
    private javax.swing.JTextField fechaRegistroCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton limpiarBtn;
    private javax.swing.JTextField nombreCliente;
    private javax.swing.JTextField numCuentaEntrada;
    // End of variables declaration//GEN-END:variables
}
