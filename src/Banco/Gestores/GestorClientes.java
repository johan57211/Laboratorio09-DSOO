package Banco.Gestores;

import Banco.BancoExceptions.BancoException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import ClasesBase.Cliente;



public class GestorClientes {

    private ArrayList<Cliente> listaClientes = new ArrayList<>();

    // -- METODO PARA REGISTRAR CLIENTE --
    public Cliente registrarCliente(String nombres, String dni, String edad, String correo, String contraseña) throws BancoException {

        if (!validarStringNoVacio(nombres)) {
            throw new BancoException.ValidacionException("Nombres no deben estar vacios");
        }

        int dniCliente = validarStringNumericoInt(dni);
        int edadCliente = validarStringNumericoInt(edad);

        if (dniCliente == -1 || edadCliente == -1) {
            throw new BancoException.ValidacionException("Formato de DNI y EDAD tienen que ser numeros");
        }
        if (dniCliente < 10000000 || dniCliente > 99999999) {
            throw new BancoException.ValidacionException("Formato de DNI debe tener 8 numeros");
        }
        if (buscarCliente(dniCliente) != null) {
            throw new BancoException.DuplicadoException("DNI ingresado ya esta asociado a un Cliente existente");
        }
        if (edadCliente < 18 || edadCliente > 120) {
            throw new BancoException.ValidacionException("Edad no valida, debes ser mayor de edad");
        }
        if (!validarStringNoVacio(correo)) {
            throw new BancoException.ValidacionException("Correo ingresado no debe ser vacio");
        }
        if (buscarClienteCorreo(correo) != null) {
            throw new BancoException.DuplicadoException("Correo ya registrado anteriormente");
        }
        if (!esEmailValido(correo)) {
            throw new BancoException.ValidacionException("Formato de correo no correspondiente (ejemplo@dominio.com)");
        }
        if (!validarStringNoVacio(contraseña) || !validarSinEspaciosVacios(contraseña)) {
            throw new BancoException.ValidacionException("Formato de contraseña no valido");
        }

        Cliente cliente = new Cliente(nombres, dniCliente, edadCliente, correo, contraseña);
        listaClientes.add(cliente);
        return cliente;
    }

    
    
    // -- METODO PARA BUSCAR CLIENTE --
    public Cliente mostrarCliente(String dni) throws BancoException {

        int dniCliente = validarStringNumericoInt(dni);

        if (dniCliente == -1) {
            throw new BancoException.ValidacionException("DNI ingresado solo debe contener numeros");
        }

        Cliente cliente = buscarCliente(dniCliente);
        if (cliente == null) {
            throw new BancoException.RecursoNoEncontradoException("Cliente no Registrado");
        }

        return cliente;
    }

    
    
    // -- ELIMINAR CLIENTE --
    public boolean eliminarCliente(String dni) throws BancoException {

        int dniCliente = validarStringNumericoInt(dni);

        if (dniCliente == -1) {
            throw new BancoException.ValidacionException("DNI numeros");
        }

        Cliente cliente = buscarCliente(dniCliente);

        if (cliente == null) {
            throw new BancoException.RecursoNoEncontradoException("Cliente no registrado");
        }

        listaClientes.remove(cliente);
        return true;
    }

    
    
    // -- MOSTRAR CLIENTES --
    public ArrayList<Cliente> listarClientes() {
        return listaClientes;
    }
    
    
    
    // -- METODO PARA AUTENTICAR ENTRADA --
    public Cliente autenticar(String correo, String contraseña) throws BancoException {
        if (!validarStringNoVacio(correo) || !validarStringNoVacio(contraseña)) {
            throw new BancoException.ValidacionException("Correo y contraseña son obligatorios");
        }
        
        Cliente cliente = buscarClienteCorreo(correo);
        if (cliente == null) {
            throw new BancoException.CredencialesInvalidasException("Credenciales incorrectas");
        }
        
        if (!cliente.getContraseña().equals(contraseña)) {
            throw new BancoException.CredencialesInvalidasException("Credenciales incorrectas");
        }
        
        return cliente;
    }
    
    
    // Metodos del Gestor
    public Cliente buscarCliente(int dni) {
        for (Cliente cliente : listaClientes) {
            if (cliente.getDni() == dni) {
                return cliente;
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
        return (palabra == null || palabra.trim().isEmpty());
    }

    public boolean validarFormatoCorreo(String correo) {
        if (validarSinEspaciosVacios(correo)) {
            return false;
        }
        // Regex sencillo y práctico para validar formato de correo: local@domain.tld
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        return Pattern.matches(regex, correo);
    }

    public boolean validarSinEspaciosVacios(String palabra) {
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == ' ') {
                return false;
            }
        }
        return true;
    }

    public Cliente buscarClienteCorreo(String correo) {
        for (Cliente cliente : listaClientes) {
            if (cliente.getCorreo().equals(correo)) {
                return cliente;
            }
        }
        return null;
    }

    public boolean esEmailValido(String correo) {
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$"; //especificar caracteres que puede contener un email y su estructura
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(correo);
        return matcher.matches();
    }

}
