package tp1.ejercicio7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import static tp1.ejercicio7.Metodos7.*;

public class TestArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> l = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una secuencia de números enteros" + "\n"
                + "Para terminar, introduce un número negativo:");

        while (true) {
            // Leer el siguiente número
            int numero = scanner.nextInt();

            // Si el número es negativo, terminamos el bucle
            if (numero < 0) {
                break;
            }

            l.add(numero);
        }

        // Cerrar el objeto Scanner
        scanner.close();

        System.out.println("Los números introducidos son:");
        for (int num : l) {
            System.out.println(num);
        }
        System.out.println();

        //INCIDO D Y E
        metodoDyE();

        System.out.println();

        //INCISO F
        ArrayList<Integer> lista1 = new ArrayList<>();
        lista1.add(2);
        lista1.add(5);
        lista1.add(3);
        lista1.add(8);
        System.out.println("La lista de enteros es capicua: " + esCapicua(lista1));

        System.out.println();

        //INCISO G
        int num = 8;
        List<Integer> lis = calcularSucesion (num);
        System.out.println("Sucesión de " + num + ": " + lis);


        System.out.println();

        //INCISO H
        System.out.println("Lista original: " + lista1);
        invertir(lista1,0,lista1.size()-1);
        System.out.println("Lista invertida: " + lista1);

        System.out.println();

        //INCISO I
        LinkedList<Integer> lk = new LinkedList<>();
        lk.add(10);
        lk.add(20);
        lk.add(30);
        lk.add(40);
        lk.add(50);

        int suma = sumarLinkedList(lk);
        System.out.println("La suma de los elementos en la LinkedList es: " + suma);

        System.out.println();

        //INCISO J
        // Crear dos listas ordenadas
        ArrayList<Integer> lis1 = new ArrayList<>();
        lis1.add(1);
        lis1.add(3);
        lis1.add(5);
        lis1.add(7);

        ArrayList<Integer> lis2 = new ArrayList<>();
        lis2.add(2);
        lis2.add(4);
        lis2.add(6);
        lis2.add(8);

        ArrayList<Integer> listaCombinada = combinarOrdenado(lis1, lis2);

        System.out.println("Lista combinada: " + listaCombinada);


    }
}
