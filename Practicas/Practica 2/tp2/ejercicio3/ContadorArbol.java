package tp2.ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class ContadorArbol {
    private BinaryTree<Integer> ab;

    public ContadorArbol(BinaryTree<Integer> ab) {
        this.ab = ab;
    }

    public List<Integer> numerosPares() {

        if (ab.isEmpty())
            return null;

        List<Integer> lista = new ArrayList<>();

        this.numerosParesPreOrden(lista, ab); //recorrido preorden
        this.numerosParesPosOrden(lista, ab); //recorrido  posorden
        this.numerosParesInOrden(lista, ab);  // recorrido inorden

        return lista;
    }


    private void numerosParesInOrden(List lista, BinaryTree<Integer> ab) {

        if (ab.hasLeftChild())
            this.numerosParesInOrden(lista, ab.getLeftChild());

        if (ab.getData() % 2 == 0)
            lista.add(ab.getData());

        if (ab.hasRightChild())
            this.numerosParesInOrden(lista, ab.getRightChild());

    }


    private void numerosParesPreOrden(List lista, BinaryTree<Integer> ab) {

        if (ab.getData() % 2 == 0)
            lista.add(ab.getData());

        if (ab.hasLeftChild())
            numerosParesPreOrden(lista, ab.getLeftChild());

        if (ab.hasRightChild())
            numerosParesPreOrden(lista, ab.getRightChild());

    }

    private void numerosParesPosOrden (List lista, BinaryTree < Integer > ab){

        if (ab.hasLeftChild())
            numerosParesPosOrden(lista, ab.getLeftChild());

        if (ab.hasRightChild())
            numerosParesPosOrden(lista, ab.getRightChild());

        if (ab.getData() % 2 == 0)
            lista.add(ab.getData());

    }
}

