package tp1.ejercicio10;

import java.util.*;
public class Banco {
    private Queue<Cliente> colaPrioritaria;
    private Queue<Cliente> colaGeneral;

    public Banco() {
        colaPrioritaria = new LinkedList<>();
        colaGeneral = new LinkedList<>();
    }

    public void agregarCliente(String nombre, boolean esEmbarazada, boolean tieneMovilidadReducida, int edad) {
        Cliente nuevoCliente = new Cliente(nombre, esEmbarazada, tieneMovilidadReducida, edad);
        if (nuevoCliente.esPrioritario()) {
            colaPrioritaria.add(nuevoCliente);
        } else {
            colaGeneral.add(nuevoCliente);
        }
    }

    public Cliente atenderCliente() {
        if (!colaPrioritaria.isEmpty()) {
            return colaPrioritaria.poll(); // Atiende al cliente prioritario.
        } else {
            return colaGeneral.poll(); // Atiende al cliente general.
        }
    }

    public boolean hayClientes() {
        return !colaPrioritaria.isEmpty() || !colaGeneral.isEmpty();
    }
}

