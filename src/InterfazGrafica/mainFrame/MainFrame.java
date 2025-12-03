package InterfazGrafica.mainFrame;

import Banco.ClasesBase.*;
import Banco.GestorPrincipal.*;
import InterfazGrafica.panelCliente.Pnl_Menu_Cliente;
import InterfazGrafica.panelEmpleado.Pnl_Menu_Empleado;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.*;


public class MainFrame extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MainFrame.class.getName());

    // Variables importantes para manejar los paneles
    private CardLayout cardLayout;
    private JPanel contenedorPrincipal;
    private Banco banco;
    private Pnl_Iniciar_Sesion panelLogin;

    public MainFrame(Banco banco) {
        this.banco = banco;
        initComponents();
        configurarVentana();
        inicializarPaneles();
    }

    private void configurarVentana() {
        setTitle("Banco Nacional Cerdita - Sistema de Gestión");
        setSize(1150, 700);
        setLocationRelativeTo(null); // Centrar ventana
        setResizable(false); // Opcional: evitar que se redimensione
    }

    private void inicializarPaneles() {
        cardLayout = new CardLayout();
        contenedorPrincipal = new JPanel(cardLayout);

        panelLogin = new Pnl_Iniciar_Sesion(banco);

        // IMPORTANTE: Configurar el callback ANTES de agregar el panel
        panelLogin.setLoginCallback(this::navegarSegunUsuario);

        contenedorPrincipal.add(panelLogin, "inicioSesion");

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(contenedorPrincipal, BorderLayout.CENTER);

        cardLayout.show(contenedorPrincipal, "inicioSesion");

        pack();
        setLocationRelativeTo(null);

        revalidate();
        repaint();
    }

    private void configurarBotonLogin() {
        // Configurar el callback para cuando el login sea exitoso
        panelLogin.setLoginCallback(this::navegarSegunUsuario);
    }

    /**
     * Navega al menú correspondiente según el tipo de usuario
     */
    private void navegarSegunUsuario(Usuario usuario) {

        // IMPORTANTE: Verificar Admin PRIMERO (es más específico)
        if (usuario instanceof Admin) {
            System.out.println("→ Navegando a menú Admin");
            irAMenuAdmin(usuario);
        } 
        // LUEGO Empleado
        else if (usuario instanceof Empleado) {
            System.out.println("→ Navegando a menú Empleado");
            irAMenuEmpleado(usuario);
        } 
        // FINALMENTE Cliente
        else if (usuario instanceof Cliente) {
            System.out.println("→ Navegando a menú Cliente");
            irAMenuCliente(usuario);
        }
        else {
            System.out.println("ERROR: Tipo de usuario desconocido");
            JOptionPane.showMessageDialog(this,
                "Error: Tipo de usuario no reconocido",
                "Error",
                JOptionPane.ERROR_MESSAGE);
        }

    }

    /**
     * Navegar al menú de cliente
     */
    public void irAMenuCliente(Usuario usuario) {
        Pnl_Menu_Cliente menuCliente = new Pnl_Menu_Cliente(banco, usuario);
        contenedorPrincipal.add(menuCliente, "menuCliente");
        cardLayout.show(contenedorPrincipal, "menuCliente");
        logger.info("Usuario cliente " + usuario.getNombres() + " ingresó al sistema");
    }

    /**
     * Navegar al menú de empleado (por implementar)
     */
    public void irAMenuEmpleado(Usuario usuario) {
        // Crear el panel del menú empleado
        Pnl_Menu_Empleado menuEmpleado = new Pnl_Menu_Empleado(banco, usuario);

        // Agregarlo al contenedor
        contenedorPrincipal.add(menuEmpleado, "menuEmpleado");

        // Mostrarlo
        cardLayout.show(contenedorPrincipal, "menuEmpleado");

        logger.info("Usuario empleado " + usuario.getNombres() + " ingresó al sistema");
    }

    /**
     * Navegar al menú de administrador (por implementar)
     */
    public void irAMenuAdmin(Usuario usuario) {
        JOptionPane.showMessageDialog(this,
                "Menú de Administrador en desarrollo\nUsuario: " + usuario.getNombres(),
                "Próximamente",
                JOptionPane.INFORMATION_MESSAGE);
        volverALogin();
    }

    /**
     * Volver al panel de login (cerrar sesión)
     */
    public void volverALogin() {
        panelLogin = new Pnl_Iniciar_Sesion(banco);
        panelLogin.setLoginCallback(this::navegarSegunUsuario);
        contenedorPrincipal.add(panelLogin, "inicioSesion");
        cardLayout.show(contenedorPrincipal, "inicioSesion");
        logger.info("Sesión cerrada - volviendo al login");
    }

    /*
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    */
    @SuppressWarnings("unchecked")
// <editor-fold defaultstate="collapsed" desc="Generated Code">
private void initComponents() {
    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    // El layout se configura en inicializarPaneles()
}// </editor-fold>

    public static void main(String args[]) {

    Banco banco = new Banco();

    java.awt.EventQueue.invokeLater(() -> {
        MainFrame frame = new MainFrame(banco);
        frame.setVisible(true);
    });
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
