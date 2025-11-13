package Gestores;

import java.util.ArrayList;

import ClasesBase.Cliente;
import ClasesBase.Cuenta;
import ClasesBase.Titularidad;


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

	public void agregarTitularidad(String dni, String numeroCuenta) {
		System.out.println("\n════════════════════════════════════");
        System.out.println("           AGREGAR TITULAR          ");
        System.out.println("════════════════════════════════════");
        
        int dniCliente = validarStringNumericoInt(dni);
		int numeroCuentaCl = validarStringNumericoInt(numeroCuenta);
        
        //Validaciones
        if (dniCliente==-1) {
            System.out.println("\nERROR ASIGNACION TITULARIDAD: Dni solo debe contener numeros");
            return;
        }
        
        if (numeroCuentaCl==-1) {
            System.out.println("\nERROR ASIGNACION TITULARIDAD: Numero de Cuenta solo debe contener numeros");
            return;
        }

        Cliente clienteP = gClientes.buscarCliente(dniCliente);
        Cuenta cuentaP = gCuentas.buscarCuenta(numeroCuentaCl);

        if (clienteP==null) {
            System.out.println("\nERROR ASIGNACION TITULARIDAD: Cliente no registrado en el sistema");
            return;
        }
        if (cuentaP==null) {
            System.out.println("\nERROR ASIGNACION TITULARIDAD: Cuenta no registrada en el sistema");
            return;
        }
        if (buscarTitularidad(clienteP, cuentaP)!=null) {
            System.out.println("\nERROR ASIGNACION TITULARIDAD: Ya existe una titularidad con esta cuenta");
            return;
        }

        Titularidad titularidad = new Titularidad("Secundario", clienteP, cuentaP, contadorIds);
        contadorIds++;

        System.out.println(titularidad);
        listaTitularidades.add(titularidad);
	}
    

    // -- METODO PARA CREAR TITULARIDAD CUANDO SE ABRE UNA CUENTA --
    public void agregarPrimeraTitularidad(Titularidad nTitularidad) {
        listaTitularidades.add(nTitularidad);
        contadorIds++;
    }

    // -- MOSTRAR TITULARES DE CUENTA --

    public void mostrarTitularesDeCuenta(String numero) {
        System.out.println("\n════════════════════════════════════");
        System.out.println("         TITULARES DE CUENTA        ");
        System.out.println("════════════════════════════════════");
        
        int numeroCuenta = validarStringNumericoInt(numero);

        Cuenta cuenta = gCuentas.buscarCuenta(numeroCuenta);
        
        if (cuenta==null) {
            System.out.println("\nERROR MOSTRAR TITULARES DE CUENTA: No se encontro cuenta con el numero de cuenta ingresado");
            return;
        }

        ArrayList<Titularidad> titularesCuenta = listarTitularesDeCuenta(cuenta);

        if (titularesCuenta.isEmpty()) {
            System.out.println("-- No existen titulares en esta cuenta -- ??");
        }
        else {
            for (Titularidad titularidad : titularesCuenta) {
                System.out.println("\n"+titularidad);
            }
        }
    }

    // Elimina una titularidad del registro
    public void eliminarTitularidad(Titularidad titularidad) {listaTitularidades.remove(titularidad);}



    public void eliminarTitularSecundario() {

    }





    // Busca si hay una titularidad entre un cliente y una cuenta
    public Titularidad buscarTitularidad(Cliente cliente, Cuenta cuenta) {
        for (Titularidad titular : listaTitularidades) {
            if (titular.getCliente()==cliente && titular.getCuenta()==cuenta) {
                return titular;
            }
        }
        return null;
    }



    // Array de las titularidades de un Cliente
	public ArrayList<Titularidad> listarTitularidadesDeCliente(Cliente cliente) {
        
        ArrayList<Titularidad> titularidadesCliente = new ArrayList<>();
        for (Titularidad titularidad : listaTitularidades) {
            if (titularidad.getCliente()==cliente) {
                titularidadesCliente.add(titularidad);
            }
        }
        return titularidadesCliente;
	}



    // Array de los titulares de una cuenta
    public ArrayList<Titularidad> listarTitularesDeCuenta(Cuenta cuenta) {

        ArrayList<Titularidad> titularidadesCuenta = new ArrayList<>();
        for (Titularidad titularidad : listaTitularidades) {
            if (titularidad.getCuenta()==cuenta) {
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
