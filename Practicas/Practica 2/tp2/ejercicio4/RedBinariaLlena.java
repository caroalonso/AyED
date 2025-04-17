package tp2.ejercicio4;

public class RedBinariaLlena {

    private BinaryTree <Integer> ab;

    public RedBinariaLlena(BinaryTree<Integer> ab) {
        this.ab=ab;
    }

    public int retardoEnvio(){
        if(this.ab.isEmpty())
            return 0;
        return retardoEnvio(this.ab);
    }

    private int retardoEnvio(BinaryTree<Integer> ab){

        if(ab.isLeaf()) //si sos hoja retorna tu valor
            return ab.getData();

        //no pregunto si tiene hijo izq y der por que es un arbol lleno
        int valor_HI= retardoEnvio(ab.getLeftChild());
        int valor_HD= retardoEnvio(ab.getRightChild());

        // Suma el valor del nodo actual y el mayor de sus dos hijos
        return ab.getData()+ Math.max(valor_HI, valor_HD);

    }

}
