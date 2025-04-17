package tp2.ejercicio7;

public class Main07
{
    public static void main(String[] args) {
        BinaryTree<Integer> ab = new BinaryTree<Integer>(1); // raiz

        BinaryTree<Integer> HI = new BinaryTree<Integer>(2); // hijo izquierdo

        BinaryTree<Integer> HD = new BinaryTree<Integer>(3); //hijo derecho

        HI.addRightChild(new BinaryTree<Integer>(4));

        HD.addLeftChild(new BinaryTree<Integer>(5)); // creo los hijos de Hijo Derecho
        HD.addRightChild(new BinaryTree<Integer>(6));


        ab.addLeftChild(HI); // agrego hijo izquierdo a la raiz
        ab.addRightChild(HD); // agrego hijo derecho a la raiz

        ParcialArbol pa = new ParcialArbol(ab);

        System.out.println("El arbol tiene mas hijos con un solo hijo del lado izquierdo: " + pa.isLeftTree(1));

    }
}


