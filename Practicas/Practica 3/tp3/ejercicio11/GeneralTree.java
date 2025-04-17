package tp3.ejercicio11;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class GeneralTree<T> {
    private T data;
    private List<GeneralTree<T>> children = new LinkedList<GeneralTree<T>>();

    public GeneralTree() {}

    public GeneralTree(T data) {
        this.data = data;
    }

    public GeneralTree(T data, List<GeneralTree<T>> children) {
        this(data);
        this.children = children;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public List<GeneralTree<T>> getChildren() {
        return this.children;
    }

    public void setChildren(List<GeneralTree<T>> children) {
        if (children != null)
            this.children = children;
    }

    public void addChild(GeneralTree<T> child) {
        this.getChildren().add(child);
    }

    public boolean isLeaf() {
        return !this.hasChildren();
    }

    public boolean hasChildren() {
        return !this.children.isEmpty();
    }

    public boolean isEmpty() {
        return this.data == null && !this.hasChildren();
    }

    public void removeChild(GeneralTree<T> child) {
        if (this.hasChildren())
            children.remove(child);
    }

//============================================================================

    //retorna la altura del arbol
    public int altura() {
        if (this.isEmpty()) //arbol vacio
            return -1;

        int max = 0; //altura maxima
        List<GeneralTree<T>> children = this.getChildren(); //hijos
        for (GeneralTree<T> hijo : children) { //por cada hijo
            int altura = hijo.altura();
            if (altura > max)
                max = altura;
        }
        return max + 1; // altura maxima + nodo actual
    }

//==============================================================================

    //devuelve el nivel donde se encuentra el dato , si es que se encuentra si no retorna -1.
    public int nivel(T dato) {
        if (this.isEmpty()) //arbol vacio
            return -1;

        GeneralTree<T> aux = null; //creo arbol vacio.
        tp3.ejercicio3.Queue<GeneralTree<T>> cola = new tp3.ejercicio3.Queue<GeneralTree<T>>();
        cola.enqueue(this);
        cola.enqueue(null);
        int nivelactual = 0;

        while (!cola.isEmpty()) {
            aux = cola.dequeue();
            if (aux != null) {
                if (aux.getData().equals(dato))
                    return nivelactual;
                List<GeneralTree<T>> hijos = aux.getChildren();
                for (GeneralTree<T> hijo : hijos) {
                    cola.enqueue(hijo);
                }
            } else if (!cola.isEmpty()) {
                cola.enqueue(null);
                nivelactual++;
            }
        }
        return -1; //nivel no existe
    }

//============================================================================

    //retorna la cantidad de nodos del nivel mas ancho
    public int ancho() {

        if (this.isEmpty()) //arbol vacio
            return -1;

        GeneralTree<T> aux=null; //arbol aux
        Queue<GeneralTree<T>> cola = new Queue<GeneralTree<T>>(); //cola
        cola.enqueue(this); // original
        cola.enqueue(null); // cargo null
        int max=0;  //deria ser 1? por si solo existe un nodo raiz?
        int contador=0;
        while(!cola.isEmpty()){
            aux = cola.dequeue();
            if(aux != null){
                List<GeneralTree<T>> hijos= aux.getChildren();
                contador+= hijos.size();
                for(GeneralTree<T> hijo : hijos){
                    cola.enqueue(hijo);
                    //contador++;
                }
            } else if (!cola.isEmpty()) {
                cola.enqueue(null);
                if(max < contador)
                    max=contador;
                contador=0;
            }
        }
        return max;
    }

//========================================================================

  //retorna si a es ancestro de b
  public boolean esAncestro(T a,T b) {

      if (this.isEmpty())
          return false;

      GeneralTree<T> arbol = buscar_a(this,a);
      if (arbol == null)
          return false;
      return buscar_b(arbol,b);
  }

  private GeneralTree<T> buscar_a(GeneralTree<T> ab, T a){

     if (ab.getData().equals(a))
        return ab;

     List<GeneralTree<T>> children= ab.getChildren();
     Iterator<GeneralTree<T>> it = children.iterator();

     GeneralTree<T> arbol= null;
     while (it.hasNext() && arbol==null)
         arbol= buscar_a(it.next(),a);

     return arbol;
    }


    private boolean buscar_b(GeneralTree<T> arbol , T b){
        if(arbol.getData().equals(b))
            return true;

        List<GeneralTree<T>> children = arbol.getChildren();
        Iterator<GeneralTree<T>> it = children.iterator();

        boolean cumple = false;
        while(it.hasNext() && !cumple)
            cumple= buscar_b(it.next(),b);

        return cumple;
    }
  }


