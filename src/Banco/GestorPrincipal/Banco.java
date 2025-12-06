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
        try {
            // Admin

            gEmpleados.setAdmin(new Admin("admin", 11111111, 100, "admin", "123", 1));

            // Clientes
            gClientes.registrarCliente("Josue Camero", "61217911", "18", "hola@ciente.com", "123");
            gClientes.registrarCliente("Johan Yucra", "61217923", "19", "2@c.com", "123");
            gClientes.registrarCliente("Osmeyer Meza", "61217921", "19", "3@c.com", "123");

            // Empleados
            gEmpleados.registrarEmpleado(gEmpleados.getAdmin(), "Brayan Motta", "61234510", "20", "brayan@banco.com", "123");
            gEmpleados.registrarEmpleado(gEmpleados.getAdmin(), "Luciana Valdivia", "62254510", "21", "luciana@banco.com", "123");
            gEmpleados.registrarEmpleado(gEmpleados.getAdmin(), "Osmeyer Meza", "61274510", "19", "oms@banco.com", "123");

            // Cuentas
            gCuentas.abrirCuenta("61217911", "1111", "Ahorro");
            gCuentas.abrirCuenta("61217923", "1111", "Ahorro");
            
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
