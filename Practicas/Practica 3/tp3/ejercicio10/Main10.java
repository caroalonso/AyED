package tp3.ejercicio10;

import java.util.LinkedList;
import java.util.List;

public class Main10 {
    public static void main(String[] args) {

        // Nivel 4: Crear nodos del nivel 4
        GeneralTree<Integer> nodo15 = new GeneralTree<>(1); // Nodo 15 (hijo de nodo 13)
        GeneralTree<Integer> nodo16 = new GeneralTree<>(0); // Nodo 16 (hijo de nodo 14)
        GeneralTree<Integer> nodo17 = new GeneralTree<>(0); // Nodo 17 (hijo de nodo 14)

        // Nivel 3: Crear nodos del nivel 3
        List<GeneralTree<Integer>> hijosDeNodo13 = new LinkedList<>();
        hijosDeNodo13.add(nodo15); // Nodo 13 con hijo 15

        List<GeneralTree<Integer>> hijosDeNodo14 = new LinkedList<>();
        hijosDeNodo14.add(nodo16); // Nodo 14 con hijo 16
        hijosDeNodo14.add(nodo17); // Nodo 14 con hijo 17

        List<GeneralTree<Integer>> hijosDeNodo5 = new LinkedList<>();
        hijosDeNodo5.add(new GeneralTree<>(1)); // Nodo 10
        hijosDeNodo5.add(new GeneralTree<>(1)); // Nodo 11
        hijosDeNodo5.add(new GeneralTree<>(1)); // Nodo 12

        GeneralTree<Integer> nodo13 = new GeneralTree<>(0, hijosDeNodo13); // Nodo 13
        GeneralTree<Integer> nodo14 = new GeneralTree<>(0, hijosDeNodo14); // Nodo 14

        // Nivel 2: Crear nodos del nivel 2
        List<GeneralTree<Integer>> hijosDeNodo2 = new LinkedList<>();
        hijosDeNodo2.add(new GeneralTree<>(1, hijosDeNodo5)); // Nodo 5 con hijos 10, 11, 12
        hijosDeNodo2.add(new GeneralTree<>(1)); // Nodo 6

        List<GeneralTree<Integer>> hijosDeNodo3 = new LinkedList<>();
        hijosDeNodo3.add(new GeneralTree<>(1)); // Nodo 7
        hijosDeNodo3.add(nodo13); // Nodo 8 con su hijo 13

        List<GeneralTree<Integer>> hijosDeNodo4 = new LinkedList<>();
        hijosDeNodo4.add(nodo14); // Nodo 9 con su hijo 14

        // Nivel 1: Crear nodos del nivel 1
        List<GeneralTree<Integer>> hijosDeNodo1 = new LinkedList<>();
        hijosDeNodo1.add(new GeneralTree<>(0, hijosDeNodo2)); // Nodo 2 con hijos 5 y 6
        hijosDeNodo1.add(new GeneralTree<>(1, hijosDeNodo3)); // Nodo 3 con hijos 7 y 8
        hijosDeNodo1.add(new GeneralTree<>(1, hijosDeNodo4)); // Nodo 4 con su hijo 9

        // Nivel 0: Crear la raíz del árbol con valor 1
        GeneralTree<Integer> nodo1 = new GeneralTree<>(1, hijosDeNodo1);

//==================================================================

        ParcialArboles pa= new ParcialArboles();
        for(Integer l: pa.resolver(nodo1)){
            System.out.println(l);
        }

    }





}
