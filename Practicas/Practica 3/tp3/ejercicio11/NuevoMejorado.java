package tp3.ejercicio11;

public class NuevoMejorado {

    public NuevoMejorado(){}

    public boolean resolver(GeneralTree<Integer> ab) {

        if(ab.isEmpty())
            return false;

        GeneralTree<Integer> aux;
        Queue<GeneralTree<Integer>> cola = new Queue<GeneralTree<Integer>>();
        cola.enqueue(ab);
        cola.enqueue(null);
        boolean cumple=true;
        int cantHijos=0;
        int valoractual=1;

        while(!cola.isEmpty() && cumple){
            aux= cola.dequeue();
            if(aux != null){
                if(valoractual+1 == aux.getChildren().size()) {
                    cantHijos = aux.getChildren().size();
                    for(GeneralTree<Integer> hijo: ab.getChildren())
                        cola.enqueue(hijo);
                }else{
                    cumple=false;
                }
            }else if(!cola.isEmpty()){
                cola.enqueue(null);
                valoractual=cantHijos;
            }
        }
        return cumple;
    }
}


