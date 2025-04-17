package tp3.ejercicio10;

import java.util.ArrayList;
import java.util.List;

public class ParcialArboles {
    private Maximo max;

    public ParcialArboles (){
        this.max = new Maximo();
    }

    public List<Integer> resolver (GeneralTree<Integer> arbol){

        List<Integer> camino= new ArrayList<Integer>();
        if(arbol.isEmpty())
            return camino;
        List<Integer> lista =new ArrayList<Integer>();
        int nivel=0;
        int suma=0;
        resolver(arbol,lista,camino,nivel,suma);
        return camino;
    }

    public void resolver(GeneralTree<Integer> arbol, List<Integer> lista , List<Integer> camino,int nivel,int suma ) {

        if (arbol.getData() != 0){
            lista.add(arbol.getData());
        }

        suma += arbol.getData() * nivel;

        if (arbol.isLeaf()) {
            if(suma > max.getMax()) {
                camino.clear();
                camino.addAll(lista);
                max.setMax(suma);
            }
        }else{

            for(GeneralTree<Integer> hijo : arbol.getChildren()){
                resolver(hijo,lista,camino,nivel++,suma);
            }
        }
        if(arbol.getData() == 1)
          lista.remove(lista.size()-1);
    }
}
