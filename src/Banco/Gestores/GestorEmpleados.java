package Banco.Gestores;

import Banco.BancoExceptions.BancoException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import ClasesBase.*;


public class GestorEmpleados {

    private ArrayList<Empleado> listaEmpleados;
    private Admin adminBando;
    private int contadorIds;
    
    public GestorEmpleados() {
        this.listaEmpleados = new ArrayList<>();
        contadorIds=1;
    }

    public Admin getAdmin() {
        return adminBando;
    }
    public void setAdmin(Admin adminBando) {
        this.adminBando = adminBando;
    }


    // Registrar nuevo empleado (solo Admin puede hacerlo)
    public Empleado registrarEmpleado(Empleado usuarioActual, String nombres, String dni, String edad, String correo, String contraseña) throws BancoException {
        // Validar permisos
        if (!(usuarioActual instanceof Admin)) {
            throw new BancoException.PermisosDenegadosException("Solo los administradores pueden registrar empleados");
        }

        // Validaciones
        if (!validarStringNoVacio(nombres)) {
            throw new BancoException.ValidacionException("Nombres no deben estar vacíos");
        }

        int dniEmpleado = validarStringNumericoInt(dni);
        int edadEmpleado = validarStringNumericoInt(edad);

        if (dniEmpleado == -1 || edadEmpleado == -1) {
            throw new BancoException.ValidacionException("DNI y edad deben ser numéricos");
        }

        if (dniEmpleado < 10000000 || dniEmpleado > 99999999) {
            throw new BancoException.ValidacionException("DNI debe tener 8 dígitos");
        }

        if (buscarEmpleadoPorDni(dniEmpleado) != null) {
            throw new BancoException.DuplicadoException("DNI ya registrado en el sistema");
        }

        if (edadEmpleado < 18 || edadEmpleado > 120) {
            throw new BancoException.ValidacionException("Edad no válida");
        }

        
        if (buscarEmpleadoPorCorreo(correo) != null) {
            throw new BancoException.DuplicadoException("Correo ya registrado");        //VALIDAR CORREO
        }
        if (!esEmailValido(correo)) {
            throw new BancoException.ValidacionException("Formato de correo no correspondiente (ejemplo@dominio.com)");
        }
        if (!validarStringNoVacio(contraseña)) {
            throw new BancoException.ValidacionException("Contraseña no válida");
        }

        Empleado nuevoEmpleado = new Empleado(nombres, dniEmpleado, edadEmpleado, correo, contraseña, contadorIds);
        contadorIds++;
        listaEmpleados.add(nuevoEmpleado);
        return nuevoEmpleado;
    }




    // -- ELIMINAR EMPLEADO -- 
    
    public boolean eliminarEmpleado(Usuario usuarioActual, String dni) throws BancoException {
        if (!(usuarioActual instanceof Admin)) {
            throw new BancoException.PermisosDenegadosException("Solo los administradores pueden eliminar empleados");
        }

        int dniEmpleado = validarStringNumericoInt(dni);
        if (dniEmpleado == -1) {
            throw new BancoException.ValidacionException("DNI debe ser numérico");
        }

        Empleado empleado = buscarEmpleadoPorDni(dniEmpleado);
        
        if (empleado == null) {
            throw new BancoException.RecursoNoEncontradoException("Empleado no encontrado");
        }

        listaEmpleados.remove(empleado);
        return true;
    }


    // -- LISTAR EMPLEADOS --
    public ArrayList<Empleado> listarEmpleados() {
        return listaEmpleados;
    }
    
    // -- MOSTRAR EMPLEADO --
    public Empleado mostrarEmpleado(String dniEmpleado) throws BancoException {
        int dniEmpl = validarStringNumericoInt(dniEmpleado);
        Empleado empleado = buscarEmpleadoPorDni(dniEmpl);
        
        if (empleado == null) {
            throw new BancoException.RecursoNoEncontradoException("No hay registro de empleado con ese Dni");
        }
        return empleado;
    }
    
    private int validarStringNumericoInt(String numero) {
        try {
            return Integer.parseInt(numero);
        } catch (Exception e) {
            return -1;
        }
    }
    
    private boolean validarStringNoVacio(String palabra) {
        return palabra != null && !palabra.trim().isEmpty();
    }
    
    public boolean esEmailValido(String correo) {
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$"; //especificar caracteres que puede contener un email y su estructura
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(correo);
        return matcher.matches();
    }

    public boolean validarSinEspaciosVacios(String palabra) {
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == ' ') {
                return false;
            }
        }
        return true;
    }

    
    // Buscar empleado por correo
    public Usuario buscarEmpleadoPorCorreo(String correo) {
        for (Empleado empleado : listaEmpleados) {
            if (empleado.getCorreo().equals(correo)) {
                return empleado;
            }
        }
        return null;
    }

    // Buscar empleado por DNI
    public Empleado buscarEmpleadoPorDni(int dni) {
        for (Empleado empleado : listaEmpleados) {
            if (empleado.getDni() == dni) {
                return empleado;
            }
        }
        return null;
    }
    
    // Buscar empleado por ID
    public Empleado buscarEmpleadoPorID(int id) {
        for (Empleado empleado : listaEmpleados) {
            if (empleado.getIdEmpleado() == id) {
                return empleado;
            }
        }
        return null;
    }
}

