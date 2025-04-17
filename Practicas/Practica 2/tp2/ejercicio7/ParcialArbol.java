package tp2.ejercicio7;

public class ParcialArbol {
    private BinaryTree<Integer> ab;

    public ParcialArbol(BinaryTree<Integer> ab){
        this.ab=ab;
    }

    public boolean isLeftTree(int num){
        if(this.ab.isEmpty())
            return false;

        BinaryTree<Integer> arbol = BuscarNum(this.ab,num);
        if(arbol.isEmpty())
            return false;

        return cumple(arbol);

    }

    private BinaryTree<Integer> BuscarNum(BinaryTree<Integer> ab, int num){
        if(ab.getData() == num)
            return ab;

        BinaryTree<Integer> arbol =null;
        if(ab.hasLeftChild())
            arbol= BuscarNum(ab.getLeftChild(),num);
        if(arbol.isEmpty())
            if(ab.hasRightChild())
                arbol= BuscarNum(ab.getRightChild(),num);

        return arbol;
    }


    private boolean cumple(BinaryTree<Integer> arbol) {

          int izq=-1; //caso de que raiz no tenga hijos
          int der=-1;

           if (arbol.hasLeftChild())
               izq= this.contarUnSoloHijo(arbol.getLeftChild());
           if (arbol.hasRightChild())
               der= this.contarUnSoloHijo(arbol.getRightChild());

        return izq > der;
    }

    public int contarUnSoloHijo(BinaryTree<Integer> ab){

        if(ab.isLeaf())
            return 0;
        if(ab.hasLeftChild() && !ab.hasRightChild())
            return 1 + this.contarUnSoloHijo(ab.getLeftChild());
        if(ab.hasRightChild() &&!ab.hasLeftChild())
           return 1 + this.contarUnSoloHijo(ab.getRightChild());

        //tengo ambos hijos
        return this.contarUnSoloHijo(ab.getLeftChild()) + this.contarUnSoloHijo(ab.getRightChild());

    }
}





