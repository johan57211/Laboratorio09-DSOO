package Banco.Gestores;

import Banco.BancoExceptions.BancoException;
import Banco.ClasesBase.*;
import java.util.*;


public class GestorCuentas {
    ArrayList<Cuenta> listaCuentas;

    private GestorTitularidades gTitularidades;
    private GestorClientes gClientes;
    private int contadorNroCuenta = 10000;

    public GestorCuentas(GestorTitularidades gTitularidades, GestorClientes gClientes) {
        this.gTitularidades = gTitularidades;
        this.gClientes = gClientes;
        listaCuentas = new ArrayList<>();
    }

    // -- METODO ABRIR CUENTA, CREAR PRIMERA TITULARIDAD --

    public Cuenta abrirCuenta(String dni, String clave, String tipo) throws BancoException {

        int dniCliente = validarStringNumericoInt(dni);
        int claveCuenta = validarStringNumericoInt(clave);
        
        if (dniCliente == -1) {
            throw new BancoException.ValidacionException("DNI solo debe tener caracteres numericos");
        }

        Cliente cliente = gClientes.buscarCliente(dniCliente);

        if (cliente==null) {
            throw new BancoException.RecursoNoEncontradoException("Usuario no encontrado ");
        }
        if (!validarStringNoVacio(tipo)) {
            throw new BancoException.ValidacionException("Tipo de cuenta no debe estar vacio ");
        }
        if (claveCuenta<1000 || claveCuenta>9999) {
            throw new BancoException.ValidacionException("CLAVE debe tener solo 4 digitos");
        }

        Cuenta cuenta = new Cuenta(contadorNroCuenta, tipo, 0, claveCuenta);
        listaCuentas.add(cuenta);

        int nroTitularidad = gTitularidades.getContadorIds();

        Titularidad nTitularidad = new Titularidad("Primario", cliente, cuenta, nroTitularidad);
        gTitularidades.agregarPrimeraTitularidad(nTitularidad);

        contadorNroCuenta++;
        
        System.out.println("\n"+cuenta);
        System.out.println("\n"+nTitularidad);
        
        return cuenta;

    }

    // -- ELIMINAR CUENTA --

    public boolean eliminarCuenta(String dni, String num, String clave) throws BancoException {

        // Parseando argumentos ingresados 
        int numCuenta = validarStringNumericoInt(num);
        int dniCliente = validarStringNumericoInt(dni);
        int claveCuenta = validarStringNumericoInt(clave);

        if (numCuenta==-1) {
            throw new BancoException.ValidacionException("Formato de numero de cuenta solo deben de ser numeros"); 
        }
        if (dniCliente==-1) {
            throw new BancoException.ValidacionException("Formato de DNI solo deben de ser numeros"); 
        }
        
        // Validando existencia de cliente y cuenta
        Cliente cliente = gClientes.buscarCliente(dniCliente);
        Cuenta cuenta = buscarCuenta(numCuenta);

        if (cliente==null) {
            throw new BancoException.RecursoNoEncontradoException("Cliente no registrado en el sistema"); 
        }
        if (cuenta==null) {
            throw new BancoException.RecursoNoEncontradoException("Cuenta no registrada en el sistema"); 
        }

        // Validando titularidad relacionada entre cuenta y cliente
        Titularidad titularidadCl = gTitularidades.buscarTitularidad(cliente, cuenta);
        if (titularidadCl==null) {
            throw new BancoException.RecursoNoEncontradoException("NO EXISTE TITULARIDAD ASOCIADA CON ESTA CUENTA"); 
        }

        // Validando clave para eliminacion
        if (claveCuenta==-1) {
            throw new BancoException.ValidacionException("Formato de contraseña de cuenta solo son 4 numeros"); 
        }
        if (cuenta.getClave()!=claveCuenta) {
            throw new BancoException.PermisosDenegadosException("Clave incorrecta"); 
        }

        // Se elimina las titularidades del sistema
        for (Titularidad titularidad : gTitularidades.listarTitularesDeCuenta(cuenta)) {
            gTitularidades.eliminarTitularidad(titularidad);    
        }
        
        listaCuentas.remove(cuenta);
        return true;
    }



    // -- MOSTRAR CUENTA --

    public Cuenta mostrarCuenta(Usuario usuarioActual, String numeroCuenta) throws BancoException {

        int numCuenta = validarStringNumericoInt(numeroCuenta);
        Cuenta cuenta = buscarCuenta(numCuenta);
        
        if (cuenta==null) {
            throw new BancoException.ValidacionException("La cuenta ingresada no existe");
        }

        if (usuarioActual instanceof Cliente) {
            Cliente cliente = (Cliente) usuarioActual;
            Titularidad titularidad = gTitularidades.buscarTitularidad(cliente, cuenta);

            if (titularidad==null) {
                throw new BancoException.RecursoNoEncontradoException("No existe titularidad con esta cuenta");
            }
            else {
                return cuenta;
            }
        }
        
        else {
            return cuenta;
        }
    }


    // -- MOSTRAR CUENTAS --

    public ArrayList<Cuenta> mostrarCuentas() {
        return listaCuentas;
    }

    // -- MOSTRAR CUENTAS DE CLIENTE --

    public ArrayList<Titularidad> mostrarCuentasCliente(Usuario usuarioActual, String dniCliente) throws BancoException {

        int dniCl = validarStringNumericoInt(dniCliente);
        Cliente cliente = gClientes.buscarCliente(dniCl);
        
        if (cliente==null) {
            throw new BancoException.RecursoNoEncontradoException("No hay registro de cliente con DNI ingresado");
        }
        if (usuarioActual instanceof Cliente) {
            if (usuarioActual.getDni() != dniCl) {
                throw new BancoException.PermisosDenegadosException("Permisos no concedidos, solo puedes ver tus cuentas");
            }
        }

        ArrayList<Titularidad> titularidadsCliente = gTitularidades.listarTitularidadesDeCliente(cliente);
        
        return titularidadsCliente;
    }




    // Metodos para la logica del gestor
    public Cuenta buscarCuenta(int numeroCuenta) {
        for (Cuenta cuenta : listaCuentas) {
            if (cuenta.getNumeroCuenta() == numeroCuenta) {
                return cuenta;
            }
        }
        return null;
    }

    public int validarStringNumericoInt(String numero) {
        int numeroParseado;
        try {
            numeroParseado = Integer.parseInt(numero);
            return numeroParseado;
        } catch (Exception e) {
            return -1;
        }
    }

    public boolean validarStringNoVacio(String palabra) {
        return !(palabra == null || palabra.trim().isEmpty());
    }

}

