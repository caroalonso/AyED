package tp3.ejercicio9;

import java.util.Iterator;
import java.util.List;

public class ParcialArboles {

    public ParcialArboles(){};

    public boolean esDeSeleccion(GeneralTree<Integer> arbol){
        if (arbol.isEmpty())
             return false;

        return es_DeSeleccion(arbol);
    }

    private boolean es_DeSeleccion(GeneralTree<Integer> ab){

        if (ab.isLeaf())
            return true;

        List<GeneralTree<Integer>> hijos= ab.getChildren();
        Iterator <GeneralTree<Integer>> it = hijos.iterator();

        int min=999;
        boolean cumple= true;
        while (it.hasNext() && cumple){
            GeneralTree<Integer> hijo = it.next();
            if(hijo.getData() < min)
                min = hijo.getData();

            cumple= es_DeSeleccion(hijo);
        }

        if(ab.getData() != min)
            return false;

        return cumple;
    }
}
