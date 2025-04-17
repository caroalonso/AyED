package tp3.ejercicio4;

import java.util.List;

public class AnalizadorArbol {

   public double devolverMaximoPromedio(GeneralTree<AreaEmpresa> ab) {

       if(ab.isEmpty()){
         return 0;
       }

       GeneralTree<AreaEmpresa> aux;
       Queue<GeneralTree<AreaEmpresa>> cola = new Queue<GeneralTree<AreaEmpresa>>();
       cola.enqueue(ab);
       cola.enqueue(null);
       double promediomax=0;
       double cantnodos=0;
       double suma=0;
       double calculo=0;

       while(!cola.isEmpty()){
           aux= cola.dequeue();
           if(aux != null){
               List<GeneralTree<AreaEmpresa>> children = aux.getChildren();
               cantnodos += children.size();
               for (GeneralTree<AreaEmpresa> hijo: children){
                   cola.enqueue(hijo);
                   suma += hijo.getData().getDemora();
               }
               calculo=suma/cantnodos;

           }else if(!cola.isEmpty()){
               cola.enqueue(null);
               if(promediomax < calculo)
                   promediomax=calculo;
               cantnodos=0;
               suma=0;
           }
       }
       return promediomax;
   }
}
