
package InterfazGrafica.panelCliente.Paneles;

import Banco.GestorPrincipal.Banco;
import Banco.ClasesBase.*;

public class Pnl_ConsultarCuenta extends javax.swing.JPanel {

    private Banco banco;
    private Usuario usuarioActual;

    public Pnl_ConsultarCuenta(Banco banco, Usuario usuarioActual) {
        initComponents();
        this.banco = banco;
        this.usuarioActual = usuarioActual;
        contratoCuenta.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        entradaNumCuenta = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        buscar = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        avisoCuenta = new javax.swing.JLabel();
        contratoCuenta = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        saldoCuenta = new javax.swing.JLabel();
        numCuenta = new javax.swing.JLabel();
        tipoCuenta = new javax.swing.JLabel();
        fechaApertura = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Palatino Linotype", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Consultar Cuenta");

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Ingresar Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 36), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Numº Cuenta: ");
        jPanel6.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 170, 43));

        entradaNumCuenta.setBackground(new java.awt.Color(255, 255, 255));
        entradaNumCuenta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        entradaNumCuenta.setForeground(new java.awt.Color(0, 0, 0));
        entradaNumCuenta.addActionListener(this::entradaNumCuentaActionPerformed);
        jPanel6.add(entradaNumCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 230, -1));

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        jPanel6.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 230, 10));

        buscar.setBackground(new java.awt.Color(204, 0, 0));
        buscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buscar.setForeground(new java.awt.Color(255, 255, 255));
        buscar.setText("BUSCAR");
        buscar.addActionListener(this::buscarActionPerformed);
        jPanel6.add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, 140, 40));

        limpiar.setBackground(new java.awt.Color(204, 0, 0));
        limpiar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        limpiar.setForeground(new java.awt.Color(255, 255, 255));
        limpiar.setText("LIMPIAR");
        limpiar.addActionListener(this::limpiarActionPerformed);
        jPanel6.add(limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 50, 90, 40));

        avisoCuenta.setBackground(new java.awt.Color(51, 51, 51));
        avisoCuenta.setForeground(new java.awt.Color(0, 0, 0));
        avisoCuenta.setText(".");
        jPanel6.add(avisoCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 230, -1));

        contratoCuenta.setBackground(new java.awt.Color(255, 255, 255));
        contratoCuenta.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 0), 3, true), "Contrato de Apertura de Cuenta", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 36), new java.awt.Color(0, 0, 0))); // NOI18N
        contratoCuenta.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                contratoCuentaComponentHidden(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("Numero de Cuenta:");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("Tipo de Cuenta:");

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setText("Saldo:");

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 0));
        jLabel28.setText("Fecha de Apertura:");

        saldoCuenta.setBackground(new java.awt.Color(0, 153, 153));
        saldoCuenta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        saldoCuenta.setForeground(new java.awt.Color(0, 0, 0));
        saldoCuenta.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        saldoCuenta.setText(".");
        saldoCuenta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        numCuenta.setBackground(new java.awt.Color(0, 153, 153));
        numCuenta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        numCuenta.setForeground(new java.awt.Color(0, 0, 0));
        numCuenta.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        numCuenta.setText(".");
        numCuenta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        tipoCuenta.setBackground(new java.awt.Color(0, 153, 153));
        tipoCuenta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tipoCuenta.setForeground(new java.awt.Color(0, 0, 0));
        tipoCuenta.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        tipoCuenta.setText(".");
        tipoCuenta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        fechaApertura.setBackground(new java.awt.Color(0, 153, 153));
        fechaApertura.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        fechaApertura.setForeground(new java.awt.Color(0, 0, 0));
        fechaApertura.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        fechaApertura.setText(".");
        fechaApertura.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout contratoCuentaLayout = new javax.swing.GroupLayout(contratoCuenta);
        contratoCuenta.setLayout(contratoCuentaLayout);
        contratoCuentaLayout.setHorizontalGroup(
            contratoCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contratoCuentaLayout.createSequentialGroup()
                .addContainerGap(110, Short.MAX_VALUE)
                .addGroup(contratoCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contratoCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel25))
                    .addComponent(jLabel24)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(contratoCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contratoCuentaLayout.createSequentialGroup()
                        .addGroup(contratoCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numCuenta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tipoCuenta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(saldoCuenta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2))
                    .addComponent(fechaApertura, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(109, 109, 109))
        );
        contratoCuentaLayout.setVerticalGroup(
            contratoCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contratoCuentaLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(contratoCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(contratoCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipoCuenta))
                .addGap(25, 25, 25)
                .addGroup(contratoCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saldoCuenta))
                .addGap(18, 18, 18)
                .addGroup(contratoCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fechaApertura))
                .addGap(64, 64, 64))
        );

        jPanel6.add(contratoCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 720, 340));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 871, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void entradaNumCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaNumCuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaNumCuentaActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        numCuenta.setText("");
        tipoCuenta.setText("");
        saldoCuenta.setText("");
        fechaApertura.setText("");
        entradaNumCuenta.setText("");
        avisoCuenta.setText("");
        contratoCuenta.setVisible(false);
    }//GEN-LAST:event_limpiarActionPerformed

    private void contratoCuentaComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_contratoCuentaComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_contratoCuentaComponentHidden

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        try {
            String numeroCuenta = entradaNumCuenta.getText();
            Cuenta cuenta = banco.getgCuentas().mostrarCuenta(usuarioActual, numeroCuenta);
            numCuenta.setText(String.valueOf(cuenta.getNumeroCuenta()));
            tipoCuenta.setText(cuenta.getTipoCuenta());
            saldoCuenta.setText(String.valueOf(cuenta.getSaldo()));
            fechaApertura.setText(String.valueOf(cuenta.getFechaApertura()));
            contratoCuenta.setVisible(true);

        } catch (Exception e) {
            avisoCuenta.setText(e.getMessage());
        }
    }//GEN-LAST:event_buscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel avisoCuenta;
    private javax.swing.JButton buscar;
    private javax.swing.JPanel contratoCuenta;
    private javax.swing.JTextField entradaNumCuenta;
    private javax.swing.JLabel fechaApertura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JButton limpiar;
    private javax.swing.JLabel numCuenta;
    private javax.swing.JLabel saldoCuenta;
    private javax.swing.JLabel tipoCuenta;
    // End of variables declaration//GEN-END:variables
}
