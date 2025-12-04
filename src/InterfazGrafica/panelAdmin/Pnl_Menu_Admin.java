
package InterfazGrafica.panelAdmin;

import Banco.ClasesBase.*;
import Banco.GestorPrincipal.Banco;
import InterfazGrafica.panelAdmin.PanelesMetodos.*;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;


public class Pnl_Menu_Admin extends javax.swing.JPanel {
    
    private Banco banco;
    private Usuario usuarioActual;
    
    private Pnl_Admin_Consultar_Cliente buscarCliente;
    private Pnl_Admin_Eliminar_Cliente eliminarCliente;
    private Pnl_Admin_Registrar_Cliente registrarCliente;
    private Pnl_Admin_Buscar_Empleado buscarEmpleado;
    private Pnl_Admin_Eliminar_Empleado eliminarEmpleado;
    private Pnl_Admin_Registrar_Empleado registrarEmpleado;
    private Pnl_Admin_Abrir_Cuenta abrirCuenta;
    private CardLayout vista;
    
    public Pnl_Menu_Admin(Banco banco, Usuario usuarioActual) {
        initComponents();
        this.banco = banco;
        this.usuarioActual = usuarioActual;
        vista = new CardLayout();
        vista = (CardLayout) Pnl_Vista_Principal.getLayout();
        inicializarPaneles();
        setVisible(true);
        
        nombreAdmin.setText(usuarioActual.getNombres());
    }
    
    private void inicializarPaneles() {
        buscarCliente = new Pnl_Admin_Consultar_Cliente(banco, usuarioActual);
        eliminarCliente = new Pnl_Admin_Eliminar_Cliente(banco, usuarioActual);
        registrarCliente = new Pnl_Admin_Registrar_Cliente(banco, usuarioActual);
        eliminarEmpleado = new Pnl_Admin_Eliminar_Empleado(banco, usuarioActual);
        registrarEmpleado = new Pnl_Admin_Registrar_Empleado(banco, usuarioActual);
        buscarEmpleado = new Pnl_Admin_Buscar_Empleado(banco, usuarioActual);
        abrirCuenta = new Pnl_Admin_Abrir_Cuenta(banco, usuarioActual);
        // Abrir cuenta
        // Ver Cuenta
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnBuscarCliente = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();
        iconoCliente = new javax.swing.JLabel();
        btnBuscarEmpleado = new javax.swing.JButton();
        btnRegistrarCliente = new javax.swing.JButton();
        btnEliminarCliente = new javax.swing.JButton();
        btnRegistrarEmpleado = new javax.swing.JButton();
        btnEliminarEmpleado = new javax.swing.JButton();
        btnBuscarCuenta = new javax.swing.JButton();
        btnAbrirCuenta = new javax.swing.JButton();
        nombreAdmin = new javax.swing.JLabel();
        btnDeposito = new javax.swing.JButton();
        btnRetirar = new javax.swing.JButton();
        Pnl_Vista_Principal = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btnBuscarCliente.setBackground(new java.awt.Color(204, 0, 0));
        btnBuscarCliente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBuscarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarCliente.setText("Buscar Cliente");
        btnBuscarCliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBuscarCliente.setBorderPainted(false);
        btnBuscarCliente.addActionListener(this::btnBuscarClienteActionPerformed);

        btnCerrarSesion.setBackground(new java.awt.Color(204, 0, 0));
        btnCerrarSesion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrarSesion.setText("Cerrar Sesion");
        btnCerrarSesion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCerrarSesion.setBorderPainted(false);
        btnCerrarSesion.addActionListener(this::btnCerrarSesionActionPerformed);

        iconoCliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        iconoCliente.setForeground(new java.awt.Color(0, 0, 0));
        iconoCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconoCliente.setText("Icono Cliente");

        btnBuscarEmpleado.setBackground(new java.awt.Color(204, 0, 0));
        btnBuscarEmpleado.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBuscarEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarEmpleado.setText("Buscar Empleado");
        btnBuscarEmpleado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBuscarEmpleado.setBorderPainted(false);
        btnBuscarEmpleado.addActionListener(this::btnBuscarEmpleadoActionPerformed);

        btnRegistrarCliente.setBackground(new java.awt.Color(204, 0, 0));
        btnRegistrarCliente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRegistrarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarCliente.setText("Registrar Cliente");
        btnRegistrarCliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegistrarCliente.setBorderPainted(false);
        btnRegistrarCliente.addActionListener(this::btnRegistrarClienteActionPerformed);

        btnEliminarCliente.setBackground(new java.awt.Color(204, 0, 0));
        btnEliminarCliente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEliminarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarCliente.setText("Eliminar Cliente");
        btnEliminarCliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEliminarCliente.setBorderPainted(false);
        btnEliminarCliente.addActionListener(this::btnEliminarClienteActionPerformed);

        btnRegistrarEmpleado.setBackground(new java.awt.Color(204, 0, 0));
        btnRegistrarEmpleado.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRegistrarEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarEmpleado.setText("Registrar Empleado");
        btnRegistrarEmpleado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegistrarEmpleado.setBorderPainted(false);
        btnRegistrarEmpleado.addActionListener(this::btnRegistrarEmpleadoActionPerformed);

        btnEliminarEmpleado.setBackground(new java.awt.Color(204, 0, 0));
        btnEliminarEmpleado.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEliminarEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarEmpleado.setText("Eliminar Empleado");
        btnEliminarEmpleado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEliminarEmpleado.setBorderPainted(false);
        btnEliminarEmpleado.addActionListener(this::btnEliminarEmpleadoActionPerformed);

        btnBuscarCuenta.setBackground(new java.awt.Color(204, 0, 0));
        btnBuscarCuenta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBuscarCuenta.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarCuenta.setText("Buscar Cuenta");
        btnBuscarCuenta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBuscarCuenta.setBorderPainted(false);
        btnBuscarCuenta.addActionListener(this::btnBuscarCuentaActionPerformed);

        btnAbrirCuenta.setBackground(new java.awt.Color(204, 0, 0));
        btnAbrirCuenta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAbrirCuenta.setForeground(new java.awt.Color(255, 255, 255));
        btnAbrirCuenta.setText("Abrir Cuenta");
        btnAbrirCuenta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAbrirCuenta.setBorderPainted(false);
        btnAbrirCuenta.addActionListener(this::btnAbrirCuentaActionPerformed);

        nombreAdmin.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        nombreAdmin.setForeground(new java.awt.Color(0, 0, 0));
        nombreAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnDeposito.setBackground(new java.awt.Color(204, 0, 0));
        btnDeposito.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDeposito.setForeground(new java.awt.Color(255, 255, 255));
        btnDeposito.setText("Depositar");
        btnDeposito.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDeposito.setBorderPainted(false);
        btnDeposito.addActionListener(this::btnDepositoActionPerformed);

        btnRetirar.setBackground(new java.awt.Color(204, 0, 0));
        btnRetirar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRetirar.setForeground(new java.awt.Color(255, 255, 255));
        btnRetirar.setText("Retirar");
        btnRetirar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRetirar.setBorderPainted(false);
        btnRetirar.addActionListener(this::btnRetirarActionPerformed);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnBuscarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBuscarEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                            .addComponent(btnRegistrarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                            .addComponent(btnEliminarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                            .addComponent(btnRegistrarEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                            .addComponent(btnEliminarEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                            .addComponent(btnBuscarCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                            .addComponent(btnAbrirCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                            .addComponent(btnDeposito, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                            .addComponent(btnRetirar, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                            .addComponent(btnCerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(nombreAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(iconoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombreAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscarCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrarCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminarCliente)
                .addGap(30, 30, 30)
                .addComponent(btnBuscarEmpleado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrarEmpleado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminarEmpleado)
                .addGap(30, 30, 30)
                .addComponent(btnBuscarCuenta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAbrirCuenta)
                .addGap(24, 24, 24)
                .addComponent(btnDeposito)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRetirar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Pnl_Vista_Principal.setBackground(new java.awt.Color(204, 0, 0));
        Pnl_Vista_Principal.setForeground(new java.awt.Color(204, 0, 0));
        Pnl_Vista_Principal.setLayout(new java.awt.CardLayout());
        add(Pnl_Vista_Principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 0, 930, 700));
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        // TODO add your handling code here:
        Pnl_Vista_Principal.add(buscarCliente, "buscarCliente");
        vista.show(Pnl_Vista_Principal, "buscarCliente");
        SwingUtilities.updateComponentTreeUI(this);
        this.repaint();
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    
    
    
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

    
    
    private void btnBuscarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarEmpleadoActionPerformed
        // TODO add your handling code here:
        Pnl_Vista_Principal.add(buscarEmpleado, "buscarEmpleado");
        vista.show(Pnl_Vista_Principal, "buscarEmpleado");
        SwingUtilities.updateComponentTreeUI(this);
        this.repaint();
        
    }//GEN-LAST:event_btnBuscarEmpleadoActionPerformed

    private void btnRegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarClienteActionPerformed
        // TODO add your handling code here:Pnl_Vista_Principal.add(buscarCliente, "buscarCliente");
        Pnl_Vista_Principal.add(registrarCliente, "registrarCliente");
        vista.show(Pnl_Vista_Principal, "registrarCliente");
        SwingUtilities.updateComponentTreeUI(this);
        this.repaint();
    }//GEN-LAST:event_btnRegistrarClienteActionPerformed

    
    
    private void btnEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarClienteActionPerformed
        // TODO add your handling code here:
        Pnl_Vista_Principal.add(eliminarCliente, "eliminarCliente");
        vista.show(Pnl_Vista_Principal, "eliminarCliente");
        SwingUtilities.updateComponentTreeUI(this);
        this.repaint();
    }//GEN-LAST:event_btnEliminarClienteActionPerformed

    private void btnRegistrarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarEmpleadoActionPerformed
        // TODO add your handling code here:
        Pnl_Vista_Principal.add(registrarEmpleado, "registrarEmpleado");
        vista.show(Pnl_Vista_Principal, "registrarEmpleado");
        SwingUtilities.updateComponentTreeUI(this);
        this.repaint();
    }//GEN-LAST:event_btnRegistrarEmpleadoActionPerformed

    private void btnEliminarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarEmpleadoActionPerformed
        // TODO add your handling code here:
        Pnl_Vista_Principal.add(eliminarEmpleado, "eliminarEmpleado");
        vista.show(Pnl_Vista_Principal, "eliminarEmpleado");
        SwingUtilities.updateComponentTreeUI(this);
        this.repaint();
    }//GEN-LAST:event_btnEliminarEmpleadoActionPerformed

    private void btnBuscarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarCuentaActionPerformed

    private void btnAbrirCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirCuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAbrirCuentaActionPerformed

    private void btnDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDepositoActionPerformed

    private void btnRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRetirarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Pnl_Vista_Principal;
    private javax.swing.JButton btnAbrirCuenta;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnBuscarCuenta;
    private javax.swing.JButton btnBuscarEmpleado;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnDeposito;
    private javax.swing.JButton btnEliminarCliente;
    private javax.swing.JButton btnEliminarEmpleado;
    private javax.swing.JButton btnRegistrarCliente;
    private javax.swing.JButton btnRegistrarEmpleado;
    private javax.swing.JButton btnRetirar;
    private javax.swing.JLabel iconoCliente;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel nombreAdmin;
    // End of variables declaration//GEN-END:variables


                                        

    private void movCuentaBtnActionPerformed(java.awt.event.ActionEvent evt) {                                             
        CardLayout vista = (CardLayout) Pnl_vista_principal.getLayout();
        // Pnl_vista_principal.add(movimientos, "movimientos");
        vista.show(Pnl_vista_principal, "movimientos");
        SwingUtilities.updateComponentTreeUI(this);
        this.repaint();
    }                                            

    private void rgDepBtnMouseEntered(java.awt.event.MouseEvent evt) {                                      
        rgDepBtn.setBackground(new Color(255,255,255));
        rgDepBtn.setForeground(new Color(0,0,0));
    }                                     

    private void rgDepBtnMouseExited(java.awt.event.MouseEvent evt) {                                     
        rgDepBtn.setBackground(new Color(204,0,0));
        rgDepBtn.setForeground(new Color(255,255,255));
    }                                    

    private void rgDepBtnActionPerformed(java.awt.event.ActionEvent evt) {                                         
        CardLayout vista = (CardLayout) Pnl_vista_principal.getLayout();
        // Pnl_vista_principal.add(deposito, "deposito");
        vista.show(Pnl_vista_principal, "deposito");
        SwingUtilities.updateComponentTreeUI(this);
        this.repaint();
    }                                        

    private void rgRetBtnActionPerformed(java.awt.event.ActionEvent evt) {                                         
        CardLayout vista = (CardLayout) Pnl_vista_principal.getLayout();
        // Pnl_vista_principal.add(retiro, "retiro");
        vista.show(Pnl_vista_principal, "retiro");
        SwingUtilities.updateComponentTreeUI(this);
        this.repaint();
    }                                        

    private void rgClienteBtnActionPerformed(java.awt.event.ActionEvent evt) {                                             
        CardLayout vista = (CardLayout) Pnl_vista_principal.getLayout();
        // Pnl_vista_principal.add(registrar, "registrar");
        vista.show(Pnl_vista_principal, "registrar");
        SwingUtilities.updateComponentTreeUI(this);
        this.repaint();
    }                                            


    // Variables declaration - do not modify                     
    private javax.swing.JPanel Pnl_vista_principal;

    private javax.swing.JButton movCuentaBtn;
    private javax.swing.JButton rgClienteBtn;
    private javax.swing.JButton rgDepBtn;
    private javax.swing.JButton rgRetBtn;
        
   }
    // End of variables declaration