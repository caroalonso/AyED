package tp2.ejercicio9;

public class Main09 {
    public static void main(String[] args) {

        BinaryTree<Integer> ab = new BinaryTree<Integer>(1); // raiz

        BinaryTree<Integer> HI = new BinaryTree<Integer>(2); // hijo izquierdo

        BinaryTree<Integer> HD = new BinaryTree<Integer>(3); //hijo derecho

        HI.addRightChild(new BinaryTree<Integer>(4));

        ab.addLeftChild(HI);
        ab.addRightChild(HD);

        ParcialArboles pa = new ParcialArboles();
        BinaryTree<Contenedor> ac = pa.sumAndDif(ab);

        System.out.println();
        System.out.println("Raiz suma: "+ ac.getData().getSuma());
        System.out.println("Raiz diferencia: "+ ac.getData().getDiferencia());
        System.out.println();
        System.out.println("Hijo izquiero suma: "+ ac.getLeftChild().getData().getSuma());
        System.out.println("Hijo izquiero difencia: "+ ac.getLeftChild().getData().getDiferencia());
        System.out.println();
        System.out.println("Hijo derecho suma: "+ ac.getRightChild().getData().getSuma());
        System.out.println("Hijo derecho suma: "+ ac.getRightChild().getData().getDiferencia());
        System.out.println();
        System.out.println("Hijo derecho del hijo izquiedo de la raiz suma: " +ac.getLeftChild().getRightChild().getData().getSuma());
        System.out.println("Hijo derecho del hijo iquierdo de la raiz diferencia: " +ac.getLeftChild().getRightChild().getData().getDiferencia());
    }
}


