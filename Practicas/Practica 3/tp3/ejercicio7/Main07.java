package tp3.ejercicio7;

import java.util.LinkedList;
import java.util.List;

public class Main07 {
    public static void main(String[] args) {

//================== CREACION ARBOL =====================

        List<GeneralTree<Integer>> hijos6 = new LinkedList<>();
        hijos6.add(new GeneralTree<>(1));
        GeneralTree<Integer> nodo6 = new GeneralTree<>(6, hijos6);

        List<GeneralTree<Integer>> hijos17 = new LinkedList<>();
        hijos17.add(new GeneralTree<>(10));
        hijos17.add(nodo6);
        GeneralTree<Integer> nodo17 = new GeneralTree<>(17, hijos17);

        List<GeneralTree<Integer>> hijos9 = new LinkedList<>();
        hijos9.add(new GeneralTree<>(8));
        GeneralTree<Integer> nodo9 = new GeneralTree<>(9, hijos9);

        List<GeneralTree<Integer>> hijos14 = new LinkedList<>();
        hijos14.add(new GeneralTree<>(16));
        hijos14.add(new GeneralTree<>(7));
        GeneralTree<Integer> nodo14 = new GeneralTree<>(14, hijos14);

        List<GeneralTree<Integer>> hijos15 = new LinkedList<>();
        hijos15.add(nodo14);
        hijos15.add(new GeneralTree<>(18));
        GeneralTree<Integer> nodo15 = new GeneralTree<>(15, hijos15);

        List<GeneralTree<Integer>> hijos12 = new LinkedList<>();
        hijos12.add(nodo17);
        hijos12.add(nodo9);
        hijos12.add(nodo15);

        GeneralTree<Integer> arb = new GeneralTree<>(12, hijos12);

//============================================================

        Caminos c = new Caminos(arb);

        List<Integer> resultado= c.caminoAHojaMasLejana();

        System.out.println();
        System.out.println("Camino mas largo:");
        for(Integer res :resultado){
            System.out.print(res + " ");
        }

    }
}
