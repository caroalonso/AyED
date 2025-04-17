package tp3.ejercicio2;


import java.util.LinkedList;
import java.util.List;

public class Main02 {
    public static void main(String[] args) {

        GeneralTree<Integer> a1 = new GeneralTree<Integer>(15);

        List<GeneralTree<Integer>> children2 = new LinkedList<GeneralTree<Integer>>();
        children2.add(new GeneralTree<Integer>(21));
        children2.add(new GeneralTree<Integer>(22));
        children2.add(new GeneralTree<Integer>(23));
        GeneralTree<Integer> a2 = new GeneralTree<Integer>(7, children2);

        List <GeneralTree<Integer>> children3 = new LinkedList<GeneralTree<Integer>>();
        children3.add(new GeneralTree<Integer>(31));
        children3.add(new GeneralTree<Integer>(32));
        GeneralTree<Integer> a3 = new GeneralTree<Integer>(3, children3);

        List<GeneralTree<Integer>> childen = new LinkedList<GeneralTree<Integer>>();
        childen.add(a1);
        childen.add(a2);
        childen.add(a3);

        GeneralTree<Integer> a = new GeneralTree<Integer>(13, childen);//raiz

        RecorridosAG recorridosAG = new RecorridosAG();
        int num=4;

       // List<Integer> lista = recorridosAG.numerosImparesMayoresQuePreOrden(a,num);
        System.out.println();
        System.out.println("Recorrido PreOrden de los numeros impares mayores a "+ num +" del arbol : " );
        for(Integer hijo: recorridosAG.numerosImparesMayoresQuePreOrden(a,num)){
            System.out.println(hijo);
        }

        System.out.println();
        //List<Integer> lista1 = recorridosAG.numerosImparesMayoresQuePostOrden(a,num)
        System.out.println();
        System.out.println("Recorrido PosOrden de los numeros impares mayores a "+ num +" del arbol : " );
        for(Integer hijo: recorridosAG.numerosImparesMayoresQuePostOrden(a,num)){
            System.out.println(hijo);
        }

        System.out.println();
        //List<Integer> lista2 = recorridosAG.inOrden(a,num);
        System.out.println();
        System.out.println("Recorrido InOrden de los numeros impares mayores a "+ num +" del arbol : " );
        for(Integer hijo: recorridosAG.numerosImparesMayoresQueInOrden(a,num)){
            System.out.println(hijo);
        }

        //List<Integer> lista3 = recorridosAG.porNivel(a,num);
        System.out.println();
        System.out.println("Recorrido Por Nivel de los numeros impares mayores a "+ num +" del arbol : " );
        for(Integer hijo: recorridosAG.porNivel(a,num)){
            System.out.println(hijo);
        }



    }
}
