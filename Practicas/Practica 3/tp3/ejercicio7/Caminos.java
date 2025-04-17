package tp3.ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class Caminos {

    private GeneralTree<Integer> ab;

    public  Caminos(GeneralTree<Integer> ab){
       this.ab=ab;
    }

    public List<Integer> caminoAHojaMasLejana(){
        List<Integer> lista= new ArrayList<Integer>();
        if(this.ab.isEmpty())
            return lista;

        List<Integer> camino = new ArrayList<Integer>();
        caminoAHojaMasLejana(ab,lista,camino);
        return camino;
    }

    private void caminoAHojaMasLejana(GeneralTree<Integer> arbol, List<Integer> lista, List<Integer> camino) {

        lista.add(arbol.getData());

        if (arbol.isLeaf()) {
            if (lista.size() > camino.size()) {
                camino.clear();
                camino.addAll(lista);
            }
        }else{
            for (GeneralTree<Integer> hijo : arbol.getChildren()) {
                caminoAHojaMasLejana(hijo, lista, camino);
            }
        }

        lista.remove(lista.size() - 1);
    }
}

