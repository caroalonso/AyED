package tp1.ejercicio9;

import static tp1.ejercicio9.TestBalanceo.esBalanceado;

public class Main9 {
    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Por favor, proporciona un string como parámetro.");
            return;
        }

        String input = args[0];
        boolean resultado = esBalanceado(input);

        if (resultado) {
            System.out.println("El string está balanceado.");
        } else {
            System.out.println("El string no está balanceado.");
        }

    }

    //para ejecutar correr programa desde la terminal con los parametros deseados
    // java tp1.ejercicio9.TestBalanceo "{( [ ( ) ] )}"
}
