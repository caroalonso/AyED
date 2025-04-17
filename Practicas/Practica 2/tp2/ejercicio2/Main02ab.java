package tp2.ejercicio2;

public class Main02ab {
   public static void main(String[] args) {
        //creacion arbol binario
        BinaryTree <Integer> ab = new BinaryTree<Integer>(3); // raiz

        BinaryTree <Integer> HI = new BinaryTree<Integer>(2); // hijo izquierdo

        BinaryTree <Integer> HD = new BinaryTree<Integer>(4); //hijo derecho

        HI.addLeftChild(new BinaryTree<Integer>(1)); // creo los hijos de Hijo Izquierdo
        HI.addRightChild(new BinaryTree<Integer>(8));

        HD.addLeftChild(new BinaryTree<Integer>(5)); // creo los hijos de Hijo Derecho
        HD.addRightChild(new BinaryTree<Integer>(1));

        ab.addLeftChild(HI); // agrego hijo izquierdo a la raiz
        ab.addRightChild(HD); // agrego hijo derecho a la raiz

        System.out.println("cantidad de hojas del arbol: "+ ab.contarHojas());
        System.out.println();

        System.out.println();
        System.out.println("niveles entre n=1 y m:2 ");
        ab.entreNiveles();

    }
}
