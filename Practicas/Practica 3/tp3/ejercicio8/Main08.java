package tp3.ejercicio8;

//El arbol es abeto si cada nodo que no sea hoja tiene como minimo 3 hijos hojas.
//Dado un árbol general, compruebe si es un abeto.

import java.util.LinkedList;
import java.util.List;

public class Main08 {
    public static void main(String[] args) {

       GeneralTree<Integer> a1 = new GeneralTree<Integer>(15);

        List<GeneralTree<Integer>> children2 = new LinkedList<GeneralTree<Integer>>();
        children2.add(new GeneralTree<Integer>(21));
        children2.add(new GeneralTree<Integer>(22));
        children2.add(new GeneralTree<Integer>(23));
        GeneralTree<Integer> a2 = new GeneralTree<Integer>(2, children2);

        GeneralTree<Integer> a3 = new GeneralTree<Integer>(3);
        GeneralTree<Integer> a4 = new GeneralTree<Integer>(5);

        List<GeneralTree<Integer>> childen = new LinkedList<GeneralTree<Integer>>();
        childen.add(a1); //hoja
        childen.add(a2); // no hoja , con 3 hijos hojas
        childen.add(a3); //hoja
        childen.add(a4); //hoja

       GeneralTree<Integer> a = new GeneralTree<Integer>(13, childen);//raiz

       //se asume que la raiz al menos tiene 2 hijos (raiz nunca es hoja)
        Navidad n = new Navidad(a);
        System.out.println();
        System.out.println(n.esAbetoNavidenio());

    }
}
