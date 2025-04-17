package tp3.ejercicio11;

import java.util.LinkedList;
import java.util.List;

public class Main11 {
    public static void main(String[] args) {

//============= ARBOL QUE CUMPLE =================================

//        // Crear hijos del nodo con valor 3
//        List<GeneralTree<Integer>> hijosDe3 = new LinkedList<>();
//        hijosDe3.add(new GeneralTree<>(33)); // hijo con valor 33
//        hijosDe3.add(new GeneralTree<>(12)); // hijo con valor 12
//        hijosDe3.add(new GeneralTree<>(17)); // hijo con valor 17
//        hijosDe3.add(new GeneralTree<>(9));  // hijo con valor 9
//        GeneralTree<Integer> nodo3 = new GeneralTree<>(3, hijosDe3);
//
//        // Crear hijos del nodo con valor 18
//        List<GeneralTree<Integer>> hijosDe18 = new LinkedList<>();
//        hijosDe18.add(new GeneralTree<>(83)); // hijo con valor 83
//        GeneralTree<Integer> nodo18 = new GeneralTree<>(18, hijosDe18);
//
//        // Crear hijos del nodo con valor 4
//        List<GeneralTree<Integer>> hijosDe4 = new LinkedList<>();
//        hijosDe4.add(nodo3); // nodo 3 con sus hijos
//        hijosDe4.add(new GeneralTree<>(7)); // hijo con valor 7
//        hijosDe4.add(new GeneralTree<>(11)); // hijo con valor 11
//        GeneralTree<Integer> nodo4 = new GeneralTree<>(4, hijosDe4);
//
//        // Crear hijos del nodo con valor 5
//        List<GeneralTree<Integer>> hijosDe5 = new LinkedList<>();
//        hijosDe5.add(nodo18); // nodo 18 con su hijo 83
//        GeneralTree<Integer> nodo5 = new GeneralTree<>(5, hijosDe5);
//
//        // Crear hijos del nodo con valor 1
//        List<GeneralTree<Integer>> hijosDe1 = new LinkedList<>();
//        hijosDe1.add(nodo5); // nodo 5 con su hijo 18
//        hijosDe1.add(nodo4); // nodo 4 con sus hijos 7, 11, 3
//        GeneralTree<Integer> nodo1 = new GeneralTree<>(1, hijosDe1);
//
//        // Crear hijos del nodo con valor 25
//        List<GeneralTree<Integer>> hijosDe25 = new LinkedList<>();
//        hijosDe25.add(new GeneralTree<>(13)); // hijo con valor 13
//        GeneralTree<Integer> nodo25 = new GeneralTree<>(25, hijosDe25);
//
//        // Crear hijos de la raíz con valor 2
//        List<GeneralTree<Integer>> hijosDeRaiz = new LinkedList<>();
//        hijosDeRaiz.add(nodo1); // nodo 1 con sus hijos
//        hijosDeRaiz.add(nodo25); // nodo 25 con su hijo 13
//
//        // Crear la raíz del árbol con valor 2
//        GeneralTree<Integer> arbol = new GeneralTree<>(2, hijosDeRaiz);

//================= ARBOL QUE NO CUMPLE ==========================

        // Crear hijos del nodo con valor 3
        List<GeneralTree<Integer>> hijosDe3 = new LinkedList<>();
        hijosDe3.add(new GeneralTree<>(33)); // hijo con valor 33
        hijosDe3.add(new GeneralTree<>(12)); // hijo con valor 12
        hijosDe3.add(new GeneralTree<>(17)); // hijo con valor 17
        hijosDe3.add(new GeneralTree<>(9));  // hijo con valor 9
        GeneralTree<Integer> nodo3 = new GeneralTree<>(3, hijosDe3);

        // Crear hijos del nodo con valor 18
        List<GeneralTree<Integer>> hijosDe18 = new LinkedList<>();
        hijosDe18.add(new GeneralTree<>(83)); // hijo con valor 83
        GeneralTree<Integer> nodo18 = new GeneralTree<>(18, hijosDe18);

        // Crear hijos del nodo con valor 4
        List<GeneralTree<Integer>> hijosDe4 = new LinkedList<>();
        hijosDe4.add(new GeneralTree<>(7));  // hijo con valor 7
        hijosDe4.add(nodo3); // nodo 3 con sus hijos 33, 12, 17, 9
        GeneralTree<Integer> nodo4 = new GeneralTree<>(4, hijosDe4);

        // Crear hijos del nodo con valor 5
        List<GeneralTree<Integer>> hijosDe5 = new LinkedList<>();
        hijosDe5.add(nodo18); // nodo 18 con su hijo 83
        GeneralTree<Integer> nodo5 = new GeneralTree<>(5, hijosDe5);

        // Crear hijos del nodo con valor 1
        List<GeneralTree<Integer>> hijosDe1 = new LinkedList<>();
        hijosDe1.add(nodo5); // nodo 5 con su hijo 18
        hijosDe1.add(nodo4); // nodo 4 con sus hijos 7 y 3
        GeneralTree<Integer> nodo1 = new GeneralTree<>(1, hijosDe1);

        // Crear hijos del nodo con valor 25
        List<GeneralTree<Integer>> hijosDe25 = new LinkedList<>();
        hijosDe25.add(new GeneralTree<>(13)); // hijo con valor 13
        GeneralTree<Integer> nodo25 = new GeneralTree<>(25, hijosDe25);

        // Crear hijos de la raíz con valor 2
        List<GeneralTree<Integer>> hijosDeRaiz = new LinkedList<>();
        hijosDeRaiz.add(nodo1); // nodo 1 con sus hijos
        hijosDeRaiz.add(nodo25); // nodo 25 con su hijo 13

        // Crear la raíz del árbol con valor 2
        GeneralTree<Integer> arbol = new GeneralTree<>(2, hijosDeRaiz);

//====================================================================================

        //ejercicio sin mejora: Clase Parcial
        Parcial p = new Parcial();
        System.out.println();
        System.out.println(p.resolver(arbol));

        //ejercicio mejorado: Clase NuevoMejorado
        NuevoMejorado n = new NuevoMejorado();
        System.out.println(n.resolver(arbol));
    }
}
