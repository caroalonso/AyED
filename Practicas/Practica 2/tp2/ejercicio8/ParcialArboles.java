package tp2.ejercicio8;

public class ParcialArboles {

    public ParcialArboles(){}

    public boolean esPrefijo(BinaryTree<Integer> ab1, BinaryTree<Integer> ab2 ){
        if(ab1.isEmpty() || ab2.isEmpty())
            return false;
        boolean cumple=true;
        return esPrefijo(ab1,ab2,cumple);
    }

    public boolean esPrefijo( BinaryTree<Integer> ab1, BinaryTree<Integer> ab2 , boolean cumple){

        if(!ab1.getData().equals(ab2.getData())) //equals() tipo Integer
            return false;

        if (ab1.hasLeftChild())
            if(!ab2.hasLeftChild())
                cumple= false;
            else
             cumple= esPrefijo(ab1.getLeftChild(),ab2.getLeftChild(),cumple);

        if((ab1.hasRightChild()) && cumple){
            if (!ab2.hasRightChild())
                cumple=false;
            else
                cumple= esPrefijo(ab1.getRightChild(), ab2.getRightChild(),cumple);
        }
        return cumple;
    }
}
