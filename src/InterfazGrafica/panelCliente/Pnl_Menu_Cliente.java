package InterfazGrafica.panelCliente;

import Banco.GestorPrincipal.Banco;
import Banco.ClasesBase.Usuario;

import InterfazGrafica.panelCliente.Paneles.*;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.*;

public class Pnl_Menu_Cliente extends javax.swing.JPanel {

    private Banco banco;
    private Usuario usuarioActual;
    
    private Pnl_ConsultarCuenta consultarCuenta; 
    private Pnl_Transferir transferencia; 
    
    private CardLayout vista;
    
    public Pnl_Menu_Cliente(Banco banco, Usuario usuarioActual) {
        initComponents();
        this.banco = banco;
        this.usuarioActual = usuarioActual;
        this.vista = new CardLayout();
        vista = (CardLayout) Pnl_vista_principal.getLayout();
        inicializarPaneles();
        setVisible(true);
    }
    
    private void inicializarPaneles() {
        // Inicializar los subpaneles con el banco y usuario
        
        consultarCuenta = new Pnl_ConsultarCuenta(banco, usuarioActual);
        transferencia = new Pnl_Transferir();
      
        
        // TODO: Si estos paneles necesitan banco/usuario, pásalos en el constructor
        // Ejemplo: deposito = new EmpleadoDeposito(banco, usuario);
    }
    
    
    
    /*
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1150, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        
        consultarCuentaBtn = new javax.swing.JButton();
        transferenciaBtn = new javax.swing.JButton();
        
        cerrarSesionBtn = new javax.swing.JButton();
        nombreClienteLabel = new javax.swing.JLabel();
        Pnl_vista_principal = new javax.swing.JPanel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0), 3));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/clienteIcono.png"))); // NOI18N
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 110, 110));

        nombreClienteLabel.setFont(new java.awt.Font("Roboto", 1, 14));
        nombreClienteLabel.setForeground(new java.awt.Color(0, 0, 0));
        nombreClienteLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreClienteLabel.setText("Cliente");
        jPanel3.add(nombreClienteLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 190, 20));

        consultarCuentaBtn.setBackground(new java.awt.Color(204, 0, 0));
        consultarCuentaBtn.setFont(new java.awt.Font("Roboto Condensed", 0, 12));
        consultarCuentaBtn.setForeground(new java.awt.Color(255, 255, 255));
        consultarCuentaBtn.setText("Consultar ");
        consultarCuentaBtn.setBorderPainted(false);
        consultarCuentaBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        consultarCuentaBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                consultarCuentaBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                consultarCuentaBtnMouseExited(evt);
            }
        });
        consultarCuentaBtn.addActionListener(this::consultarCuentaBtnActionPerformed);
        jPanel3.add(consultarCuentaBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 190, 50));

        transferenciaBtn.setBackground(new java.awt.Color(204, 0, 0));
        transferenciaBtn.setFont(new java.awt.Font("Roboto Condensed", 0, 12));
        transferenciaBtn.setForeground(new java.awt.Color(255, 255, 255));
        transferenciaBtn.setText("Registrar Transferencia");
        transferenciaBtn.setBorderPainted(false);
        transferenciaBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        transferenciaBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                transferenciaBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                transferenciaBtnMouseExited(evt);
            }
        });
        transferenciaBtn.addActionListener(this::transferenciaBtnActionPerformed);
        jPanel3.add(transferenciaBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 190, 50));

        

        cerrarSesionBtn.setBackground(new java.awt.Color(153, 153, 153));
        cerrarSesionBtn.setFont(new java.awt.Font("Roboto Condensed", 1, 12));
        cerrarSesionBtn.setForeground(new java.awt.Color(255, 255, 255));
        cerrarSesionBtn.setText("Cerrar Sesión");
        cerrarSesionBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrarSesionBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cerrarSesionBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cerrarSesionBtnMouseExited(evt);
            }
        });
        cerrarSesionBtn.addActionListener(this::cerrarSesionBtnActionPerformed);
        jPanel3.add(cerrarSesionBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 190, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 700));

        Pnl_vista_principal.setBackground(new java.awt.Color(204, 0, 0));
        Pnl_vista_principal.setLayout(new java.awt.CardLayout());
        jPanel1.add(Pnl_vista_principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 900, 700));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>
    
    private void transferenciaBtnActionPerformed(java.awt.event.ActionEvent evt) {                                         
        Pnl_vista_principal.add(transferencia, "transferencia");
        vista.show(Pnl_vista_principal, "transferencia");
        SwingUtilities.updateComponentTreeUI(this);
        this.repaint();
    }                                        

    private void consultarCuentaBtnMouseEntered(java.awt.event.MouseEvent evt) {                                      
        consultarCuentaBtn.setBackground(new Color(255,255,255));
        consultarCuentaBtn.setForeground(new Color(0,0,0));
    }                                     

    private void consultarCuentaBtnMouseExited(java.awt.event.MouseEvent evt) {                                     
        consultarCuentaBtn.setBackground(new Color(204,0,0));
        consultarCuentaBtn.setForeground(new Color(255,255,255));
    }                                    

    private void transferenciaBtnMouseEntered(java.awt.event.MouseEvent evt) {                                      
        transferenciaBtn.setBackground(new Color(255,255,255));
        transferenciaBtn.setForeground(new Color(0,0,0));
    }                                     

    private void transferenciaBtnMouseExited(java.awt.event.MouseEvent evt) {                                     
        transferenciaBtn.setBackground(new Color(204,0,0));
        transferenciaBtn.setForeground(new Color(255,255,255));
    }                                    

                                            

    private void consultarCuentaBtnActionPerformed(java.awt.event.ActionEvent evt) {                                            
        Pnl_vista_principal.add(consultarCuenta, "consultar");
        vista.show(Pnl_vista_principal, "consultar");
        SwingUtilities.updateComponentTreeUI(this);
        this.repaint();
    }                                           

                                      
    private void cerrarSesionBtnMouseEntered(java.awt.event.MouseEvent evt) {
        cerrarSesionBtn.setBackground(new Color(255, 0, 0));
    }
    
    private void cerrarSesionBtnMouseExited(java.awt.event.MouseEvent evt) {
        cerrarSesionBtn.setBackground(new Color(153, 153, 153));
    }
    
    private void cerrarSesionBtnActionPerformed(java.awt.event.ActionEvent evt) {
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
    }

    
    private javax.swing.JPanel Pnl_vista_principal;
    private javax.swing.JButton cerrarSesionBtn;
    
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton consultarCuentaBtn;
    private javax.swing.JButton transferenciaBtn;
    private javax.swing.JLabel nombreClienteLabel;



    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
