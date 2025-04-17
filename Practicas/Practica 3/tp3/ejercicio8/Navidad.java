package tp3.ejercicio8;

import java.util.Iterator;
import java.util.List;

public class Navidad {
    private GeneralTree<Integer> arbol;

    public Navidad (GeneralTree<Integer> arbol){
        this.arbol= arbol;
    }

    public String esAbetoNavidenio(){
        if(arbol.isEmpty())
            return "No es un Abeto Navideño";

        if(esAbetoNavidenio(arbol))
            return "Es un Abeto Navideño";
        return "No es un Abeto Navideño";
    }

    private boolean esAbetoNavidenio(GeneralTree<Integer> arbol ){

        if(arbol.isLeaf())
            return true;

        if(arbol.getChildren().size() < 3) // no soy hoja
            return false;

        List<GeneralTree<Integer>> hijos = arbol.getChildren();
        Iterator<GeneralTree<Integer>> it = hijos.iterator();

        boolean cumple=true;
        while( it.hasNext() && cumple){
            GeneralTree<Integer> hijo = it.next();
            cumple=esAbetoNavidenio(hijo);
        }

        return cumple;

    }
}
