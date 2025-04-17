package tp1.ejercicio1;

import static tp1.ejercicio1.Metodos1.*;

public class Main1 {

public static void main(String[] args) {

    int a = 1;
    int b = 5;

    System.out.println("Impresión con for:");
    imprimirConFor(a, b); //metodo a

    System.out.println("\nImpresión con while:");
    imprimirConWhile(a, b); //metodo b

    System.out.println("\nImpresión con recursion:");
    imprimirConRecursion(a, b); //metodo c

}
}
