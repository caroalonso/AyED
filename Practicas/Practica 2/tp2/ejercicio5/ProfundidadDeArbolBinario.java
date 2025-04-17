package tp2.ejercicio5;

public class ProfundidadDeArbolBinario {

    private BinaryTree<Integer> ab;

    public ProfundidadDeArbolBinario(BinaryTree<Integer> ab) {
        this.ab = ab;
    }

    public int sumaElementosProfundiad(int p) {
        if (this.ab.isEmpty())
            return 0;
        int nivel = 0;
        return sumaElementosProfundiad(this.ab, nivel, p);
    }

    private int sumaElementosProfundiad(BinaryTree<Integer> ab, int nivel, int p) {
        if(nivel == p)
          return ab.getData();
        int contador = 0;
        if (ab.hasLeftChild())
            contador+= sumaElementosProfundiad(ab.getRightChild(), nivel + 1, p);
        if (ab.hasLeftChild())
            contador+= sumaElementosProfundiad(ab.getLeftChild(), nivel + 1, p);
        return contador;
    }
}
