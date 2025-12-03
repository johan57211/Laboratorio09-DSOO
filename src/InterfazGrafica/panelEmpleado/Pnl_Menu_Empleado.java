package InterfazGrafica.panelEmpleado;


import Banco.GestorPrincipal.Banco;
import Banco.ClasesBase.Usuario;
import InterfazGrafica.*;
import InterfazGrafica.panelEmpleado.PanelesMetodos.EmpleadoRegistrarCliente;
import java.awt.CardLayout;
import java.awt.Color;
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
        vista = (CardLayout) Pnl_vista_principal.getLayout();
        setVisible(true);
    }
    
    private void inicializarPaneles() {
        // Inicializar los subpaneles con el banco y usuario
        deposito = new EmpleadoDeposito();
        retiro = new EmpleadoRetiro();
        registrar = new EmpleadoRegistrarCliente();
        consultar = new EmpleadoConsultarInformacion();
        movimientos = new EmpleadoMovimientosDeCuenta();
        
        // TODO: Si estos paneles necesitan banco/usuario, pásalos en el constructor
        // Ejemplo: deposito = new EmpleadoDeposito(banco, usuario);
    }
    
    
    /*
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        movCuentaBtn = new javax.swing.JButton();
        rgDepBtn = new javax.swing.JButton();
        rgRetBtn = new javax.swing.JButton();
        rgClienteBtn = new javax.swing.JButton();
        consultaBtn = new javax.swing.JButton();
        cerrarSesionBtn = new javax.swing.JButton();
        nombreEmpleadoLabel = new javax.swing.JLabel();
        Pnl_vista_principal = new javax.swing.JPanel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0), 3));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/clienteIcono.png"))); // NOI18N
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 110, 110));

        nombreEmpleadoLabel.setFont(new java.awt.Font("Roboto", 1, 14));
        nombreEmpleadoLabel.setForeground(new java.awt.Color(0, 0, 0));
        nombreEmpleadoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreEmpleadoLabel.setText("Empleado");
        jPanel3.add(nombreEmpleadoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 190, 20));

        movCuentaBtn.setBackground(new java.awt.Color(204, 0, 0));
        movCuentaBtn.setFont(new java.awt.Font("Roboto Condensed", 0, 12));
        movCuentaBtn.setForeground(new java.awt.Color(255, 255, 255));
        movCuentaBtn.setText("Movimientos De Cuenta");
        movCuentaBtn.setBorderPainted(false);
        movCuentaBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        movCuentaBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                movCuentaBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                movCuentaBtnMouseExited(evt);
            }
        });
        movCuentaBtn.addActionListener(this::movCuentaBtnActionPerformed);
        jPanel3.add(movCuentaBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 190, 50));

        rgDepBtn.setBackground(new java.awt.Color(204, 0, 0));
        rgDepBtn.setFont(new java.awt.Font("Roboto Condensed", 0, 12));
        rgDepBtn.setForeground(new java.awt.Color(255, 255, 255));
        rgDepBtn.setText("Registrar Deposito");
        rgDepBtn.setBorderPainted(false);
        rgDepBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rgDepBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rgDepBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rgDepBtnMouseExited(evt);
            }
        });
        rgDepBtn.addActionListener(this::rgDepBtnActionPerformed);
        jPanel3.add(rgDepBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 190, 50));

        rgRetBtn.setBackground(new java.awt.Color(204, 0, 0));
        rgRetBtn.setFont(new java.awt.Font("Roboto Condensed", 0, 12));
        rgRetBtn.setForeground(new java.awt.Color(255, 255, 255));
        rgRetBtn.setText("Registrar Retiro");
        rgRetBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rgRetBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rgRetBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rgRetBtnMouseExited(evt);
            }
        });
        rgRetBtn.addActionListener(this::rgRetBtnActionPerformed);
        jPanel3.add(rgRetBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 190, 50));

        rgClienteBtn.setBackground(new java.awt.Color(204, 0, 0));
        rgClienteBtn.setFont(new java.awt.Font("Roboto Condensed", 0, 12));
        rgClienteBtn.setForeground(new java.awt.Color(255, 255, 255));
        rgClienteBtn.setText("Registrar Nuevo Cliente");
        rgClienteBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rgClienteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rgClienteBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rgClienteBtnMouseExited(evt);
            }
        });
        rgClienteBtn.addActionListener(this::rgClienteBtnActionPerformed);
        jPanel3.add(rgClienteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 190, 50));

        consultaBtn.setBackground(new java.awt.Color(204, 0, 0));
        consultaBtn.setFont(new java.awt.Font("Roboto Condensed", 0, 12));
        consultaBtn.setForeground(new java.awt.Color(255, 255, 255));
        consultaBtn.setText("Consultar Información Clientes");
        consultaBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        consultaBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                consultaBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                consultaBtnMouseExited(evt);
            }
        });
        consultaBtn.addActionListener(this::consultaBtnActionPerformed);
        jPanel3.add(consultaBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 190, 50));

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

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 700));

        Pnl_vista_principal.setBackground(new java.awt.Color(204, 0, 0));
        Pnl_vista_principal.setLayout(new java.awt.CardLayout());
        jPanel1.add(Pnl_vista_principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 900, 700));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>
    
    private void rgDepBtnActionPerformed(java.awt.event.ActionEvent evt) {                                         
        Pnl_vista_principal.add(deposito, "deposito");
        vista.show(Pnl_vista_principal, "deposito");
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

    private void rgRetBtnMouseEntered(java.awt.event.MouseEvent evt) {                                      
        rgRetBtn.setBackground(new Color(255,255,255));
        rgRetBtn.setForeground(new Color(0,0,0));
    }                                     

    private void rgRetBtnMouseExited(java.awt.event.MouseEvent evt) {                                     
        rgRetBtn.setBackground(new Color(204,0,0));
        rgRetBtn.setForeground(new Color(255,255,255));
    }                                    

    private void rgClienteBtnMouseEntered(java.awt.event.MouseEvent evt) {                                          
        rgClienteBtn.setBackground(new Color(255,255,255));
        rgClienteBtn.setForeground(new Color(0,0,0));
    }                                         

    private void rgClienteBtnMouseExited(java.awt.event.MouseEvent evt) {                                         
        rgClienteBtn.setBackground(new Color(204,0,0));
        rgClienteBtn.setForeground(new Color(255,255,255));
    }                                        

    private void consultaBtnMouseEntered(java.awt.event.MouseEvent evt) {                                         
        consultaBtn.setBackground(new Color(255,255,255));
        consultaBtn.setForeground(new Color(0,0,0));
    }                                        

    private void consultaBtnMouseExited(java.awt.event.MouseEvent evt) {                                        
        consultaBtn.setBackground(new Color(204,0,0));
        consultaBtn.setForeground(new Color(255,255,255));
    }                                       

    private void movCuentaBtnMouseEntered(java.awt.event.MouseEvent evt) {                                          
        movCuentaBtn.setBackground(new Color(255,255,255));
        movCuentaBtn.setForeground(new Color(0,0,0));
    }                                         

    private void movCuentaBtnMouseExited(java.awt.event.MouseEvent evt) {                                         
        movCuentaBtn.setBackground(new Color(204,0,0));
        movCuentaBtn.setForeground(new Color(255,255,255));
    }                                        

    private void consultaBtnActionPerformed(java.awt.event.ActionEvent evt) {                                            
        Pnl_vista_principal.add(consultar, "consultar");
        vista.show(Pnl_vista_principal, "consultar");
        SwingUtilities.updateComponentTreeUI(this);
        this.repaint();
    }                                           

    private void rgRetBtnActionPerformed(java.awt.event.ActionEvent evt) {                                         
        Pnl_vista_principal.add(retiro, "retiro");
        vista.show(Pnl_vista_principal, "retiro");
        SwingUtilities.updateComponentTreeUI(this);
        this.repaint();
    }                                        

    private void rgClienteBtnActionPerformed(java.awt.event.ActionEvent evt) {                                             
        Pnl_vista_principal.add(registrar, "registrar");
        vista.show(Pnl_vista_principal, "registrar");
        SwingUtilities.updateComponentTreeUI(this);
        this.repaint();
    }                                            

    private void movCuentaBtnActionPerformed(java.awt.event.ActionEvent evt) {                                             
        Pnl_vista_principal.add(movimientos, "movimientos");
        vista.show(Pnl_vista_principal, "movimientos");
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
    // Variables declaration - do not modify                     
    private javax.swing.JPanel Pnl_vista_principal;
    private javax.swing.JButton cerrarSesionBtn;
    private javax.swing.JButton consultaBtn;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton movCuentaBtn;
    private javax.swing.JLabel nombreEmpleadoLabel;
    private javax.swing.JButton rgClienteBtn;
    private javax.swing.JButton rgDepBtn;
    private javax.swing.JButton rgRetBtn;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
