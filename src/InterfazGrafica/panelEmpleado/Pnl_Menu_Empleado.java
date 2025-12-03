package InterfazGrafica.panelEmpleado;

import Banco.GestorPrincipal.Banco;
import Banco.ClasesBase.Usuario;
import InterfazGrafica.panelEmpleado.PanelesMetodos.*;
import java.awt.CardLayout;
import javax.swing.*;

public class Pnl_Menu_Empleado extends javax.swing.JPanel {

    private Banco banco;
    private Usuario usuario;

    private EmpleadoDeposito deposito;
    private EmpleadoRetiro retiro;
    private EmpleadoRegistrarCliente registrar;
    private EmpleadoConsultarInformacion consultar;
    private EmpleadoMovimientosDeCuenta movimientos;

    private CardLayout vista;

    public Pnl_Menu_Empleado(Banco banco, Usuario usuario) {
        this.banco = banco;
        this.usuario = usuario;
        initComponents();
        inicializarPaneles();
        vista = (CardLayout) Pnl_Vista_Principal.getLayout();
        setVisible(true);
    }

    private void inicializarPaneles() {
        // Inicializar los subpaneles con el banco y usuario
        deposito = new EmpleadoDeposito();
        retiro = new EmpleadoRetiro();
        registrar = new EmpleadoRegistrarCliente();
        consultar = new EmpleadoConsultarInformacion();
        movimientos = new EmpleadoMovimientosDeCuenta();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnRetiro = new javax.swing.JButton();
        btnDeposito = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();
        iconoCliente = new javax.swing.JLabel();
        nombreCliente = new javax.swing.JLabel();
        btnRegistrarCliente = new javax.swing.JButton();
        btnBuscarCliente = new javax.swing.JButton();
        Pnl_Vista_Principal = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btnRetiro.setBackground(new java.awt.Color(204, 0, 0));
        btnRetiro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRetiro.setForeground(new java.awt.Color(255, 255, 255));
        btnRetiro.setText("Registrar Retiro");
        btnRetiro.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRetiro.setBorderPainted(false);
        btnRetiro.addActionListener(this::btnRetiroActionPerformed);

        btnDeposito.setBackground(new java.awt.Color(204, 0, 0));
        btnDeposito.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDeposito.setForeground(new java.awt.Color(255, 255, 255));
        btnDeposito.setText("Registrar Deposito");
        btnDeposito.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDeposito.setBorderPainted(false);
        btnDeposito.addActionListener(this::btnDepositoActionPerformed);

        btnCerrarSesion.setBackground(new java.awt.Color(204, 0, 0));
        btnCerrarSesion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrarSesion.setText("Cerrar Sesion");
        btnCerrarSesion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCerrarSesion.setBorderPainted(false);
        btnCerrarSesion.addActionListener(this::btnCerrarSesionActionPerformed);

        iconoCliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        iconoCliente.setForeground(new java.awt.Color(0, 0, 0));
        iconoCliente.setText("Icono Cliente");

        nombreCliente.setText("nombre Cliente");

        btnRegistrarCliente.setBackground(new java.awt.Color(204, 0, 0));
        btnRegistrarCliente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRegistrarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarCliente.setText("Registrar Cliente");
        btnRegistrarCliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegistrarCliente.setBorderPainted(false);
        btnRegistrarCliente.addActionListener(this::btnRegistrarClienteActionPerformed);

        btnBuscarCliente.setBackground(new java.awt.Color(204, 0, 0));
        btnBuscarCliente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBuscarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarCliente.setText("Buscar Cliente");
        btnBuscarCliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBuscarCliente.setBorderPainted(false);
        btnBuscarCliente.addActionListener(this::btnBuscarClienteActionPerformed);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRetiro, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegistrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(iconoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nombreCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(iconoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombreCliente)
                .addGap(18, 18, 18)
                .addComponent(btnDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRetiro, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRegistrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Pnl_Vista_Principal.setBackground(new java.awt.Color(204, 0, 0));
        Pnl_Vista_Principal.setLayout(new java.awt.CardLayout());
        add(Pnl_Vista_Principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 920, 700));
    }// </editor-fold>//GEN-END:initComponents


    private void btnRetiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetiroActionPerformed
        // TODO add your handling code here:
        Pnl_Vista_Principal.add(retiro, "retiro");
        vista.show(Pnl_Vista_Principal, "retiro");
        SwingUtilities.updateComponentTreeUI(this);
        this.repaint();
    }//GEN-LAST:event_btnRetiroActionPerformed

    private void btnDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositoActionPerformed
        // TODO add your handling code here:
        Pnl_Vista_Principal.add(deposito, "deposito");
        vista.show(Pnl_Vista_Principal, "deposito");
        SwingUtilities.updateComponentTreeUI(this);
        this.repaint();
    }//GEN-LAST:event_btnDepositoActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        // TODO add your handling code here:
        int respuesta = JOptionPane.showConfirmDialog(
                this,
                "¿Está seguro que desea cerrar sesión?",
                "Confirmar Cierre de Sesión",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
        );

        if (respuesta == JOptionPane.YES_OPTION) {
            // Obtener el MainFrame y volver al login
            java.awt.Window ventana = SwingUtilities.getWindowAncestor(this);
            if (ventana instanceof InterfazGrafica.mainFrame.MainFrame) {
                ((InterfazGrafica.mainFrame.MainFrame) ventana).volverALogin();
            }
        }
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnRegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarClienteActionPerformed
        // TODO add your handling code here:
        Pnl_Vista_Principal.add(registrar, "registrar");
        vista.show(Pnl_Vista_Principal, "registrar");
        SwingUtilities.updateComponentTreeUI(this);
        this.repaint();
    }//GEN-LAST:event_btnRegistrarClienteActionPerformed

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        // TODO add your handling code here:
        Pnl_Vista_Principal.add(consultar, "consultar");
        vista.show(Pnl_Vista_Principal, "consultar");
        SwingUtilities.updateComponentTreeUI(this);
        this.repaint();
    }//GEN-LAST:event_btnBuscarClienteActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Pnl_Vista_Principal;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnDeposito;
    private javax.swing.JButton btnRegistrarCliente;
    private javax.swing.JButton btnRetiro;
    private javax.swing.JLabel iconoCliente;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel nombreCliente;
    // End of variables declaration//GEN-END:variables
}
