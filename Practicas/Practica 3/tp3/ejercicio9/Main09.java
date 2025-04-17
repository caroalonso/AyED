package tp3.ejercicio9;

import java.util.LinkedList;
import java.util.List;

public class Main09 {
    public static void main(String[] args) {

//================= creacion arbol ===================================

        List<GeneralTree<Integer>> hijosDe12 = new LinkedList<>();
        hijosDe12.add(new GeneralTree<>(12)); // hijo con valor 12
        hijosDe12.add(new GeneralTree<>(40)); // hijo con valor 40
        GeneralTree<Integer> nodo12 = new GeneralTree<>(12, hijosDe12);

        // Crear hijos del nodo con valor 25 (que es hijo de la raíz)
        List<GeneralTree<Integer>> hijosDe25 = new LinkedList<>();
        hijosDe25.add(new GeneralTree<>(25)); // hijo con valor 25
        GeneralTree<Integer> nodo25 = new GeneralTree<>(25, hijosDe25);

        // Crear la lista de hijos de la raíz (12 y 25)
        List<GeneralTree<Integer>> hijosDeRaiz = new LinkedList<>();
        hijosDeRaiz.add(nodo12);
        hijosDeRaiz.add(nodo25);

        // Crear la raíz del árbol con valor 12 y agregar sus hijos
       GeneralTree<Integer> a = new GeneralTree<>(12, hijosDeRaiz);

//============================================================================

        ParcialArboles pa = new ParcialArboles();
        System.out.println();
        System.out.println("El arbol es de seleccion? " + pa.esDeSeleccion(a));

    }
}
