package tp1.ejercicio10;

public class Main10 {
    public static void main(String[] args) {
        Banco banco = new Banco();

        // Agregar clientes a la cola.
        banco.agregarCliente("Juan", false, false, 30);
        banco.agregarCliente("María", true, false, 25);
        banco.agregarCliente("Carlos", false, true, 50);
        banco.agregarCliente("Ana", false, false, 72);

        // Atender a los clientes.
        while (banco.hayClientes()) {
            Cliente cliente = banco.atenderCliente();
            System.out.println("Atendiendo a: " + cliente.getNombre());
        }
    }
}
