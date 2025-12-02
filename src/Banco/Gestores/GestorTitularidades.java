package Banco.Gestores;

import Banco.BancoExceptions.BancoException;
import Banco.ClasesBase.*;
import java.util.ArrayList;



public class GestorTitularidades {

    private ArrayList<Titularidad> listaTitularidades;
    private GestorCuentas gCuentas;
    private GestorClientes gClientes;
    private int contadorIds = 1;

    // Constructor sin parámetros
    public GestorTitularidades() {
        this.listaTitularidades = new ArrayList<>();
    }

    // Setters para inyectar las dependencias
    public void setGestorCuentas(GestorCuentas gCuentas) {
        this.gCuentas = gCuentas;
    }

    public void setGestorClientes(GestorClientes gClientes) {
        this.gClientes = gClientes;
    }

    // -- AGREGAR TITULAR A CUENTA --
    public Titularidad agregarTitularidad(String dni, String numeroCuenta) throws BancoException {

        int dniCliente = validarStringNumericoInt(dni);
        int numeroCuentaCl = validarStringNumericoInt(numeroCuenta);

        //Validaciones
        if (dniCliente == -1) {
            throw new BancoException.ValidacionException("Dni solo debe contener numeros");
        }

        if (numeroCuentaCl == -1) {
            throw new BancoException.ValidacionException("Numero de Cuenta solo debe contener numeros");
        }

        Cliente clienteP = gClientes.buscarCliente(dniCliente);
        Cuenta cuentaP = gCuentas.buscarCuenta(numeroCuentaCl);

        if (clienteP == null) {
            throw new BancoException.RecursoNoEncontradoException("Cliente no registrado en el sistema");
        }
        if (cuentaP == null) {
            throw new BancoException.RecursoNoEncontradoException("Cuenta no registrada en el sistema");
        }
        if (buscarTitularidad(clienteP, cuentaP) != null) {
            throw new BancoException.DuplicadoException("Ya existe una titularidad con esta cuenta");
        }

        Titularidad titularidad = new Titularidad("Secundario", clienteP, cuentaP, contadorIds);
        contadorIds++;

        listaTitularidades.add(titularidad);
        return titularidad;
    }

    // -- METODO PARA CREAR TITULARIDAD CUANDO SE ABRE UNA CUENTA --
    public void agregarPrimeraTitularidad(Titularidad nTitularidad) {
        listaTitularidades.add(nTitularidad);
        contadorIds++;
    }


    // Elimina una titularidad del registro
    public void eliminarTitularidad(Titularidad titularidad) {
        listaTitularidades.remove(titularidad);
    }


    // Busca si hay una titularidad entre un cliente y una cuenta
    public Titularidad buscarTitularidad(Cliente cliente, Cuenta cuenta) {
        for (Titularidad titular : listaTitularidades) {
            if (titular.getCliente() == cliente && titular.getCuenta() == cuenta) {
                return titular;
            }
        }
        return null;
    }

    // Array de las titularidades de un Cliente
    public ArrayList<Titularidad> listarTitularidadesDeCliente(Cliente cliente) {

        ArrayList<Titularidad> titularidadesCliente = new ArrayList<>();
        for (Titularidad titularidad : listaTitularidades) {
            if (titularidad.getCliente() == cliente) {
                titularidadesCliente.add(titularidad);
            }
        }
        return titularidadesCliente;
    }

    // Array de los titulares de una cuenta
    public ArrayList<Titularidad> listarTitularesDeCuenta(Cuenta cuenta) {

        ArrayList<Titularidad> titularidadesCuenta = new ArrayList<>();
        for (Titularidad titularidad : listaTitularidades) {
            if (titularidad.getCuenta() == cuenta) {
                titularidadesCuenta.add(titularidad);
            }
        }
        return titularidadesCuenta;
    }

    // Metodos complementarios
    public int getContadorIds() {
        return contadorIds;
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

}
