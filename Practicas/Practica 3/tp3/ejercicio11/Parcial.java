package tp3.ejercicio11;

import java.util.List;

public class Parcial {

    private GeneralTree<Integer> ab;

    public Parcial(){}

    public boolean resolver(GeneralTree<Integer> ab) {

        if(ab.isEmpty())
            return false;

        GeneralTree<Integer> aux;
        Queue<GeneralTree<Integer>> cola = new Queue<GeneralTree<Integer>>();
        cola.enqueue(ab);
        cola.enqueue(null);
        int canthijos=0;
        boolean cumple=true; // O SACAR Y RETORNAR TRUE
        int valoractual=1;

        while(!cola.isEmpty()){
            aux= cola.dequeue();
            if(aux != null){
                List<GeneralTree<Integer>> children = aux.getChildren();
                canthijos += children.size();
               // canthijos = children.size(); // SUMANDOLO FUNCA
                for(GeneralTree<Integer> hijo: children){
                    cola.enqueue(hijo);
                }

            }else if(!cola.isEmpty()){
                cola.enqueue(null);
                if(valoractual+1 != canthijos)
                    return false;
                valoractual=canthijos;
                canthijos=0; // seba : SACARLO Y AGREGAR EL COMENTADO FUNCIONA
            }
        }
        return cumple;
    }
}


