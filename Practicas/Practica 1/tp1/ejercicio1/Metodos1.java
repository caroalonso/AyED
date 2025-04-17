package tp1.ejercicio1;

public class Metodos1 {

// Método utilizando un bucle for
public static void imprimirConFor(int a, int b) {
    for (int i = a; i <= b; i++) {
        System.out.println(i);
    }
}

// Método utilizando un bucle while
public static void imprimirConWhile(int a, int b) {
    while (a <= b) {
        System.out.println(a);
        a++;
    }
}

// Método con recursion.
public static void imprimirConRecursion(int a, int b) {
    if (a > b) {
        return; // Caso base para evitar bucle infinito en caso de a > b
    }
    System.out.println(a);
    if (a < b) {
        imprimirConRecursion(a + 1, b);
    }
}

}
