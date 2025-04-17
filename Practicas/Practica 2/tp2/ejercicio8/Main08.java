package tp2.ejercicio8;

public class Main08 {
    public static void main(String[] args) {

//Arbol 1:
        BinaryTree<Integer> ab1 = new BinaryTree<Integer>(1); // raiz ab1

        BinaryTree<Integer> HI = new BinaryTree<Integer>(2); // hijo izquierdo
        BinaryTree<Integer> HD = new BinaryTree<Integer>(3); //hijo derecho

        HI.addRightChild(new BinaryTree<Integer>(4));  // creo un hijo derecho del Hijo Izquierdo

        HD.addLeftChild(new BinaryTree<Integer>(5)); // creo hijo izquierdo de Hijo Derecho
        HD.addRightChild(new BinaryTree<Integer>(6)); // creo hijo derecho de Hijo Derecho


        ab1.addLeftChild(HI); // agrego hijo izquierdo a la raiz
        ab1.addRightChild(HD); // agrego hijo derecho a la raiz

//Arbol 2:

        BinaryTree<Integer> ab2 = new BinaryTree<Integer>(1); // raiz ab2

        BinaryTree<Integer> HI_a2 = new BinaryTree<Integer>(2); // hijo izquierdo
        BinaryTree<Integer> HD_a2 = new BinaryTree<Integer>(3); //hijo derecho

        HI_a2.addRightChild(new BinaryTree<Integer>(4)); // creo un hijo derecho del Hijo Izquierdo

        ab2.addLeftChild(HI_a2); // agrego hijo izquierdo a la raiz
        ab2.addRightChild(HD_a2); // agrego hijo derecho a la raiz


        ParcialArboles pa = new ParcialArboles();
        System.out.println();
        System.out.println("El Arbol 1 esta contenido en el Arbol 2 ? :");
        System.out.println(pa.esPrefijo(ab1,ab2));
    }
}
