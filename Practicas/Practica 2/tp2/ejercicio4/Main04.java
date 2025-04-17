package tp2.ejercicio4;

public class Main04 {
    public static void main(String[] args) {

        BinaryTree<Integer> ab = new BinaryTree<Integer>(3); // raiz

        BinaryTree<Integer> HI = new BinaryTree<Integer>(2); // hijo izquierdo

        BinaryTree<Integer> HD = new BinaryTree<Integer>(7); //hijo derecho

        HI.addLeftChild(new BinaryTree<Integer>(1)); // creo los hijos de Hijo Izquierdo
        HI.addRightChild(new BinaryTree<Integer>(6));

        HD.addLeftChild(new BinaryTree<Integer>(4)); // creo los hijos de Hijo Derecho
        HD.addRightChild(new BinaryTree<Integer>(5));

        ab.addLeftChild(HI); // agrego hijo izquierdo a la raiz
        ab.addRightChild(HD); // agrego hijo derecho a la raiz

        RedBinariaLlena rbl = new RedBinariaLlena(ab);

        System.out.println("retardo de envio: " + rbl.retardoEnvio());


    }
}
