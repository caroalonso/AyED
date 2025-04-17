package tp2.ejercicio3;

import java.util.List;

public class Main03ab {
    public static void main(String[] args) {

        //creacion arbol binario
       BinaryTree<Integer> ab = new BinaryTree<Integer>(3); // raiz

       BinaryTree<Integer> HI = new BinaryTree<Integer>(2); // hijo izquierdo

       BinaryTree<Integer> HD = new BinaryTree<Integer>(7); //hijo derecho

        HI.addLeftChild(new BinaryTree<Integer>(1)); // creo los hijos de Hijo Izquierdo
        HI.addRightChild(new BinaryTree<Integer>(6));

        HD.addLeftChild(new BinaryTree<Integer>(4)); // creo los hijos de Hijo Derecho
        HD.addRightChild(new BinaryTree<Integer>(5));

        ab.addLeftChild(HI); // agrego hijo izquierdo a la raiz
        ab.addRightChild(HD); // agrego hijo derecho a la raiz

        ContadorArbol contadorArbol = new ContadorArbol(ab);

        List<Integer> lista = contadorArbol.numerosPares();

        System.out.println("numeros pares de la lista:");
        for( Integer l : lista ){ // muestra los numeros pares del arbol
            System.out.println(l);
        }

    }
}
