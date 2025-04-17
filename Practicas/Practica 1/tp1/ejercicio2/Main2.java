package tp1.ejercicio2;

import java.util.Scanner;

import static tp1.ejercicio2.Metodos2.generarMultiplos;

public class Main2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero n: ");
        int n = scanner.nextInt(); //ingreso tamaño de vector n

        int[] resultado = generarMultiplos(n); // devuelve vector de enteros de n posiciones

        System.out.print("Los primeros " + n + " múltiplos de " + n + " son: ");
        for (int numero : resultado) { //imprime vector completo con foreach
            System.out.print(numero + " ");
        }
    }
}

