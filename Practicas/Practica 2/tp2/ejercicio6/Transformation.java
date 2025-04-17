package tp2.ejercicio6;

public class Transformation {
    private BinaryTree<Integer> ab;

    public Transformation (BinaryTree<Integer> ab){
        this.ab=ab;
    }

    public BinaryTree<Integer> suma(){
        if (this.ab.isEmpty())
          return null;

        suma(this.ab);
        return ab;
    }

    private int suma(BinaryTree<Integer> ab) {

        int dato1 = ab.getData();
        int suma = 0;
        if(ab.hasLeftChild()) {
            suma += suma(ab.getLeftChild());
        }
        if(ab.hasRightChild()) {
            suma += suma(ab.getRightChild());
        }
        ab.setData(suma);
        return suma + dato1; // suma de los dos hijos + el dato viejo antes de hacer el setData.
    }
}

