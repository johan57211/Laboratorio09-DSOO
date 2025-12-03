package Banco.GestorPrincipal;
import Banco.ClasesBase.*;
import Banco.Gestores.*;
import Banco.BancoExceptions.BancoException;

public class Banco {

    private GestorClientes gClientes;
    private GestorEmpleados gEmpleados;
    private GestorCuentas gCuentas;
    private GestorTitularidades gTitularidades;
    private GestorTransacciones gTransacciones;
    
    public Banco() {
        this.gClientes = new GestorClientes();
        this.gEmpleados = new GestorEmpleados();
        this.gTitularidades = new GestorTitularidades(); 
        this.gCuentas = new GestorCuentas(gTitularidades, gClientes);
        this.gTitularidades.setGestorCuentas(gCuentas);
        this.gTitularidades.setGestorClientes(gClientes);
        this.gTransacciones = new GestorTransacciones(gCuentas, gClientes, gTitularidades);
        inicializarUsuarios();
    }

    public GestorClientes getgClientes() {
        return gClientes;
    }
    public GestorCuentas getgCuentas() {
        return gCuentas;
    }
    public GestorEmpleados getgEmpleados() {
        return gEmpleados;
    }
    public GestorTitularidades getgTitularidades() {
        return gTitularidades;
    }
    public GestorTransacciones getgTransacciones() {
        return gTransacciones;
    }
    
    
    public Cliente autenticarCliente(String correo, String contraseña) throws BancoException {
        Cliente cliente = gClientes.buscarClienteCorreo(correo);
         
        if (cliente == null) {
            throw new BancoException.RecursoNoEncontradoException("Correo o contraseña de Cliente incorrecta");
        }
        
        if (!(cliente.getContraseña().equals(contraseña))) {
            throw new BancoException.RecursoNoEncontradoException("Contraseña de cliente incorrecta");
        }
        
        return cliente;
    }
   
    public Empleado autenticarEmpleado(String correo, String contraseña) throws BancoException {
        
        Empleado empleado = gEmpleados.buscarEmpleadoPorCorreo(correo);
        
        if (empleado == null) {
            throw new BancoException.RecursoNoEncontradoException("Correo o Contraseña de Empleado incorrecta");
        }
        
        if (!empleado.getContraseña().equals(contraseña)) {
            throw new BancoException.RecursoNoEncontradoException("Contraseña de Empleado incorrecta");
        }
        
        return empleado;
    }
    
    public Admin autenticarAdministrador(String correo, String contraseña) throws BancoException {
        Admin admin = gEmpleados.getAdmin();
        
        if (admin == null) {
            throw new BancoException.RecursoNoEncontradoException("Contraseña de Admin incorrecta");
        }
        
        if (!admin.getCorreo().equals(correo)) {
            throw new BancoException.RecursoNoEncontradoException("Correo o Contraseña de Admin incorrecta");
        }
        
        if (!admin.getContraseña().equals(contraseña)) {
            throw new BancoException.RecursoNoEncontradoException("Correo o Contraseña de Admin incorrecta");
        }
        
        return admin;
    }
    
    private void inicializarUsuarios() {
        // Admin
        try {
            gEmpleados.setAdmin(new Admin("admin", 11111111, 100, "admin@banco.com", "admin123", 1));
            System.out.println("✓ Admin registrado");
        } catch (Exception e) {
            System.out.println("✗ Error registrando Admin: " + e.getMessage());
            e.printStackTrace();
        }

        // Clientes
        try {
            gClientes.registrarCliente("Josue Camero", "61217911", "18", "hola@ciente.com", "123");
            System.out.println("✓ Cliente Josue Camero registrado");
        } catch (Exception e) {
            System.out.println("✗ Error registrando Josue: " + e.getMessage());
        }

        try {
            gClientes.registrarCliente("Johan Yucra", "61217923", "19", "2@c.com", "123");
            System.out.println("✓ Cliente Johan Yucra registrado");
        } catch (Exception e) {
            System.out.println("✗ Error registrando Johan: " + e.getMessage());
        }

        try {
            gClientes.registrarCliente("Osmeyer Meza", "61217921", "19", "3@c.com", "123");
            System.out.println("✓ Cliente Osmeyer Meza registrado");
        } catch (Exception e) {
            System.out.println("✗ Error registrando Osmeyer: " + e.getMessage());
        }

        // Empleados
        try {
            gEmpleados.registrarEmpleado(gEmpleados.getAdmin(), "Brayan Motta", "61234510", "20", "brayan@banco.com", "123");
            System.out.println("✓ Empleado Brayan Motta registrado");
        } catch (Exception e) {
            System.out.println("✗ Error registrando Brayan: " + e.getMessage());
        }

        try {
            gEmpleados.registrarEmpleado(gEmpleados.getAdmin(), "Luciana Valdivia", "62254510", "21", "luciana@banco.com", "123");
            System.out.println("✓ Empleado Luciana Valdivia registrado");
        } catch (Exception e) {
            System.out.println("✗ Error registrando Luciana: " + e.getMessage());
        }

        try {
            gEmpleados.registrarEmpleado(gEmpleados.getAdmin(), "Osmeyer Meza", "61274510", "19", "oms@banco.com", "123");
            System.out.println("✓ Empleado Osmeyer Meza registrado");
        } catch (Exception e) {
            System.out.println("✗ Error registrando empleado Osmeyer: " + e.getMessage());
        }

        // Cuentas
        try {
            gCuentas.abrirCuenta("61217911", "1111", "Ahorro");
            System.out.println("✓ Cuenta para 61217911 creada");
        } catch (Exception e) {
            System.out.println("✗ Error abriendo cuenta 61217911: " + e.getMessage());
        }

        try {
            gCuentas.abrirCuenta("61217923", "1111", "Ahorro");
            System.out.println("✓ Cuenta para 61217923 creada");
        } catch (Exception e) {
            System.out.println("✗ Error abriendo cuenta 61217923: " + e.getMessage());
        }

        // Resumen final
        System.out.println("\n═══════════════════════════════════");
        System.out.println("RESUMEN DE INICIALIZACIÓN");
        System.out.println("═══════════════════════════════════");
        System.out.println("Total clientes registrados: " + gClientes.listarClientes().size());
        System.out.println("Total empleados registrados: " + gEmpleados.listarEmpleados().size());
        System.out.println("═══════════════════════════════════\n");
    }
}

