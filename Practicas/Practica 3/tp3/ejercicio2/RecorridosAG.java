package tp3.ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class RecorridosAG {

    public RecorridosAG(){}

    public List<Integer> numerosImparesMayoresQuePreOrden(GeneralTree<Integer> arbol, Integer num) {
        List<Integer> lista = new ArrayList<>();
        if (arbol.isEmpty())
            return lista;
        preOrden(arbol, lista, num);
        return lista;
    }

    public void preOrden(GeneralTree<Integer> arbol, List<Integer> lista, Integer num) {
        if (arbol.getData() > num && arbol.getData() % 2 != 0)
            lista.add(arbol.getData());
        List<GeneralTree<Integer>> children = arbol.getChildren(); // Obtén los hijos
        for (GeneralTree<Integer> hijo : children) {
            preOrden(hijo, lista, num);
        }
    }

    //otra manera de hacer PreOrden
    public void preOrden2(GeneralTree<Integer> arbol,List<Integer> lista, Integer num){
        if (arbol.getData() > num && arbol.getData() % 2 != 0)
            lista.add(arbol.getData());
        List<GeneralTree<Integer>> children = arbol.getChildren();
        Iterator<GeneralTree<Integer>> it= children.iterator();
        while(it.hasNext()){
            GeneralTree<Integer> hijo= it.next();
            preOrden2(hijo, lista, num);
        }
    }

//========================================================

    public List<Integer> numerosImparesMayoresQuePostOrden(GeneralTree<Integer> arbol, Integer num) {
        List<Integer> lista = new ArrayList<>();
        if (arbol.isEmpty())
            return lista;
        posOrden(arbol, lista, num);
        return lista;
    }
    public void posOrden (GeneralTree <Integer> arbol,List<Integer> lista,Integer num){

        List<GeneralTree<Integer>> children = arbol.getChildren(); // Obtén los hijos
        for (GeneralTree<Integer> hijo : children) {
            posOrden(hijo, lista, num);
        }
        if (arbol.getData() > num && arbol.getData() % 2 != 0)
            lista.add(arbol.getData());
    }

//============================================================

    public List<Integer>  numerosImparesMayoresQueInOrden(GeneralTree<Integer> arbol, Integer num) {
        List<Integer> lista = new ArrayList<>();
        if (arbol.isEmpty())
            return lista;
        inOrden(arbol, lista, num);
        return lista;
    }

    public void inOrden(GeneralTree <Integer> arbol,List<Integer> lista,Integer num){

            List <GeneralTree<Integer>> children = arbol.getChildren();
            Iterator<GeneralTree<Integer>> it= children.iterator();

            //primer hijo izquierdo
            if(it.hasNext())
                inOrden(it.next(),lista,num);

            //nodo actual
            if (arbol.getData() > num && arbol.getData() % 2 != 0)
                lista.add(arbol.getData());

            //hijos derechos
            while(it.hasNext())
                inOrden(it.next(),lista,num);
    }

//==================================================================

    public List<Integer> porNivel(GeneralTree <Integer> arbol, Integer num){
        List<Integer> lista = new ArrayList<>();
        if (arbol.isEmpty())
            return lista;
        porNivel(arbol, lista, num);
        return lista;
    }

    public void porNivel(GeneralTree <Integer> arbol, List<Integer> lista, Integer num){

        Queue<GeneralTree<Integer>> cola = new Queue<GeneralTree<Integer>>(); //creo cola
        GeneralTree<Integer> aux = new GeneralTree<Integer>(); //creo arbol aux
        cola.enqueue(arbol); //agrego raiz a la cola
        while (!cola.isEmpty()){  //mientras la cola no este vacia
            aux=cola.dequeue();
            if(aux.getData() > num && aux.getData() % 2 != 0)
                lista.add(aux.getData());
            List <GeneralTree<Integer>> children= aux.getChildren();
            for(GeneralTree<Integer> hijo : children){
                cola.enqueue(hijo); // encolo todo los hijos a la cola
            }
        }
    }
}


// b)Si ahora tuviera que implementar estos métodos en la clase GeneralTree<T>,
// ¿qué modificaciones haría tanto en la firma como en la implementación de los mismos?
// Respuesta:
//
// EJEMPLO DE METODO POSORDEN PARA CLASE GENERALTREE:
//
//    public List<Integer> numerosImparesMayoresQuePreOrden(Integer num) {
//        List<Integer> lista = new ArrayList<>();
//        if (this.isEmpty())
//            return lista;
//        preOrden(num,lista);
//        return lista;
//    }
//
//    private void preOrden(List<Integer> lista, Integer num) {
//        if (this.getData() > num && this.getData() % 2 != 0)
//            lista.add(this.getData());
//        List<GeneralTree<Integer>> children = this.getChildren(); // Obtén los hijos
//        for (GeneralTree<Integer> hijo : children) {
//            preOrden(hijo, lista, num);
//        }
//    }
