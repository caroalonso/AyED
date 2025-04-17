package tp2.ejercicio9;

public class ParcialArboles {

    public ParcialArboles(){}

    public BinaryTree<Contenedor> sumAndDif(BinaryTree<Integer> arbol){
        BinaryTree<Contenedor> ab = new BinaryTree<Contenedor>();
        if(arbol.isEmpty())
            return ab;
        return sumaYdiferencia(arbol,0);
    }

    private BinaryTree<Contenedor> sumaYdiferencia(BinaryTree<Integer> arbol, int valor_padre){

        Contenedor actual = new Contenedor();
        actual.setSuma(arbol.getData()+valor_padre);
        actual.setDiferencia(arbol.getData()-valor_padre);

        BinaryTree<Contenedor> hijoIzq= new BinaryTree<>();  // null
        BinaryTree<Contenedor> hijoDer= new BinaryTree<>();  //null

        if(arbol.hasLeftChild()) {
            hijoIzq= sumaYdiferencia(arbol.getLeftChild(), actual.getSuma());
        }

        if(arbol.hasRightChild()) {
            hijoDer = sumaYdiferencia(arbol.getRightChild(),actual.getSuma());
        }

        BinaryTree<Contenedor> ab = new BinaryTree<>(actual);
        ab.addLeftChild(hijoIzq);
        ab.addRightChild(hijoDer);

        return ab;

    }
}
