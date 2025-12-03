/*
package InterfazGrafica.panelAdmin;

public class MenAdmin extends javax.swing.JPanel {

    public MenAdmin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
*/

package InterfazGrafica.panelAdmin;
import Banco.ClasesBase.Usuario;
import Banco.GestorPrincipal.Banco;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.SwingUtilities;

public class MenAdmin extends javax.swing.JPanel {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MenAdmin.class.getName());

    public MenAdmin() {
        initComponents();
    }

    public MenAdmin(Banco banco, Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
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
        Pnl_vista_principal = new javax.swing.JPanel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0), 3));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Admin.png"))); // NOI18N
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 140, 130));

        movCuentaBtn.setBackground(new java.awt.Color(204, 0, 0));
        movCuentaBtn.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        movCuentaBtn.setForeground(new java.awt.Color(255, 255, 255));
        movCuentaBtn.setText("Cerrar Sesion");
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
        movCuentaBtn.addActionListener(evt -> movCuentaBtnActionPerformed(evt));
        jPanel3.add(movCuentaBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 190, 50));

        rgDepBtn.setBackground(new java.awt.Color(204, 0, 0));
        rgDepBtn.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        rgDepBtn.setForeground(new java.awt.Color(255, 255, 255));
        rgDepBtn.setText("Registrar Empleado");
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
        rgDepBtn.addActionListener(evt -> rgDepBtnActionPerformed(evt));
        jPanel3.add(rgDepBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 190, 50));

        rgRetBtn.setBackground(new java.awt.Color(204, 0, 0));
        rgRetBtn.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        rgRetBtn.setForeground(new java.awt.Color(255, 255, 255));
        rgRetBtn.setText("Registrar Cliente");
        rgRetBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rgRetBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rgRetBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rgRetBtnMouseExited(evt);
            }
        });
        rgRetBtn.addActionListener(evt -> rgRetBtnActionPerformed(evt));
        jPanel3.add(rgRetBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 190, 50));

        rgClienteBtn.setBackground(new java.awt.Color(204, 0, 0));
        rgClienteBtn.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        rgClienteBtn.setForeground(new java.awt.Color(255, 255, 255));
        rgClienteBtn.setText("Gestionar Cuenta");
        rgClienteBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rgClienteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rgClienteBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rgClienteBtnMouseExited(evt);
            }
        });
        rgClienteBtn.addActionListener(evt -> rgClienteBtnActionPerformed(evt));
        jPanel3.add(rgClienteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 190, 50));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 610));

        Pnl_vista_principal.setBackground(new java.awt.Color(204, 0, 0));
        Pnl_vista_principal.setLayout(new java.awt.CardLayout());
        jPanel1.add(Pnl_vista_principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 730, 610));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 610));
    }// </editor-fold>                        

    private void movCuentaBtnMouseEntered(java.awt.event.MouseEvent evt) {                                          
        movCuentaBtn.setBackground(new Color(255,255,255));
        movCuentaBtn.setForeground(new Color(0,0,0));
    }                                         

    private void movCuentaBtnMouseExited(java.awt.event.MouseEvent evt) {                                         
        movCuentaBtn.setBackground(new Color(204,0,0));
        movCuentaBtn.setForeground(new Color(255,255,255));
    }                                        

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

    private void rgRetBtnMouseEntered(java.awt.event.MouseEvent evt) {                                      
        rgRetBtn.setBackground(new Color(255,255,255));
        rgRetBtn.setForeground(new Color(0,0,0));
    }                                     

    private void rgRetBtnMouseExited(java.awt.event.MouseEvent evt) {                                     
        rgRetBtn.setBackground(new Color(204,0,0));
        rgRetBtn.setForeground(new Color(255,255,255));
    }                                    

    private void rgRetBtnActionPerformed(java.awt.event.ActionEvent evt) {                                         
        CardLayout vista = (CardLayout) Pnl_vista_principal.getLayout();
        // Pnl_vista_principal.add(retiro, "retiro");
        vista.show(Pnl_vista_principal, "retiro");
        SwingUtilities.updateComponentTreeUI(this);
        this.repaint();
    }                                        

    private void rgClienteBtnMouseEntered(java.awt.event.MouseEvent evt) {                                          
        rgClienteBtn.setBackground(new Color(255,255,255));
        rgClienteBtn.setForeground(new Color(0,0,0));
    }                                         

    private void rgClienteBtnMouseExited(java.awt.event.MouseEvent evt) {                                         
        rgClienteBtn.setBackground(new Color(204,0,0));
        rgClienteBtn.setForeground(new Color(255,255,255));
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton movCuentaBtn;
    private javax.swing.JButton rgClienteBtn;
    private javax.swing.JButton rgDepBtn;
    private javax.swing.JButton rgRetBtn;
        
   }
    // End of variables declaration