package tp2.ejercicio6;


// CREANDO UN NUEVO ARBOL y LO RETORNA.
public class Transformation2 {

    private BinaryTree<Integer> ab;

    public Transformation2 (BinaryTree<Integer> ab){
        this.ab=ab;
    }

    public BinaryTree<Integer> suma(){
        if (this.ab.isEmpty())
            return null;
        return suma2(this.ab);
    }


    private BinaryTree<Integer> suma2(BinaryTree<Integer> ab) {

        if(ab.isLeaf())
           return new BinaryTree<Integer>(0); //crea y retorna arbol con dato 0

        BinaryTree<Integer> izq = null;
        BinaryTree<Integer> der = null;

        int contador = 0;

        if(ab.hasLeftChild()) {
            izq = suma2(ab.getLeftChild());
            contador += izq.getData() + ab.getRightChild().getData();
        }

        if(ab.hasRightChild()) {
            der = suma2(ab.getRightChild());
            contador += der.getData() + ab.getLeftChild().getData();
        }

        BinaryTree<Integer> arbolSuma = new BinaryTree<Integer>(contador);
        arbolSuma.addLeftChild(izq);
        arbolSuma.addRightChild(der);

        return arbolSuma;

    }
}



