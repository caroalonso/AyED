package tp2.ejercicio6;

public class Main06 {
    public static void main(String[] args) {

        BinaryTree<Integer> ab = new BinaryTree<Integer>(1); // raiz

        BinaryTree<Integer> HI = new BinaryTree<Integer>(2); // hijo izquierdo

        BinaryTree<Integer> HD = new BinaryTree<Integer>(3); //hijo derecho

        HI.addRightChild(new BinaryTree<Integer>(4));

        HD.addLeftChild(new BinaryTree<Integer>(5)); // creo los hijos de Hijo Derecho
        HD.addRightChild(new BinaryTree<Integer>(6));


        HD.getLeftChild().addLeftChild(new BinaryTree<Integer>(7));
        HD.getLeftChild().addRightChild(new BinaryTree<Integer>(8));

        ab.addLeftChild(HI); // agrego hijo izquierdo a la raiz
        ab.addRightChild(HD); // agrego hijo derecho a la raiz

        Transformation t = new Transformation(ab);
        System.out.println("La suma total de los elementos del arbol : " + t.suma());

    }
}
