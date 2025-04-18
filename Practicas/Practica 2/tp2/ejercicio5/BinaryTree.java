package tp2.ejercicio5;

import java.util.Queue;

public class BinaryTree<T> {

	private T data;
	private BinaryTree<T> leftChild;
	private BinaryTree<T> rightChild;

	public BinaryTree() {  //constructor sin parametros
		super();
	}

	public BinaryTree(T data) { //constructor con parametros
		this.data = data;
	}

	public T getData() { //get dato
		return data;
	}

	public void setData(T data) { //retorna dato interno del nodo
		this.data = data;
	}

	// Preguntar siempre antes hasLeftChild()
	public BinaryTree<T> getLeftChild() { //dame hijo izquierdo
		return leftChild;
	}

	//Preguntar siempre antes hasRightChild()
	public BinaryTree<T> getRightChild() { //dame hijo Derecho
		return this.rightChild;
	}

	public void addLeftChild(BinaryTree<T> child) { //agrega hijo izquierdo
		this.leftChild = child;
	}

	public void addRightChild(BinaryTree<T> child) {//agrega hijo derecho
		this.rightChild = child;
	}

	public void removeLeftChild() { // elimina hijo izquierdo
		this.leftChild = null;
	}

	public void removeRightChild() { //elimina hijo derecho
		this.rightChild = null;
	}

	public boolean isEmpty() { //arbol vacio
		return (this.isLeaf() && this.getData() == null);
	}

	public boolean isLeaf() { //pregunta si es hoja.
		return (!this.hasLeftChild() && !this.hasRightChild());
	}

	public boolean hasLeftChild() { //tenes hijo izquiero ?
		return this.leftChild != null;
	}

	public boolean hasRightChild() { //tenes hijo derecho?
		return this.rightChild != null;
	}

	@Override
	public String toString() {
		return this.getData().toString();
	}

//-----------------------------------------------------------------------

// OPCION 1 CONTAR HOJAS CON CONTADOR:

	public int contarHojas() {
		if (this.isEmpty()) // si es vacio retorna 0
			return 0;
		if (this.isLeaf()) // si es una hoja retorno valor 1
			return 1;
		int contador = 0;
		if (this.hasLeftChild()) {
			contador += this.getLeftChild().contarHojas();
		}
		if (this.hasRightChild()) {
			contador += this.getRightChild().contarHojas();
		}
		return contador;
	}

// OPCION 2 CONTAR HOJAS MEJORADO SIN CONTADOR :
//
//	public int contarHojas() {
//	  if (this.isEmpty())
//	    return 0;
//	  if (this.isLeaf())
//		return 1;
//	  return this.getLeftChild().contarHojas() + this.getRightChild().contarHojas();
//	}


// OPCION 3 CONTAR HOJAS SIN CONTADOR RECIBIENDO UN ARBOL BINARY TREE POR PARAMETRO:
//
//	public int contarHojas( BinaryTree<Integer> ab) {
//	  if (ab.isEmpty())
//		return 0;
//	  if (ab.isLeaf())
//		return 1;
//	  return this.contarHojas(ab.getLeftChild()) + this.contarHojas(ab.getRightChild());
//	 }


//---------------------------------------------------------------------------

	public BinaryTree<T> espejo() {
		BinaryTree<T> espejoAB = new BinaryTree<T>();
		if (this.isEmpty())
			return espejoAB;
      espejoAB.setData(this.getData());
		this.espejo(this, espejoAB);
		return espejoAB;
	}

	private void espejo(BinaryTree<T> original, BinaryTree<T> espejo) {
		if (original.hasLeftChild()) {
			BinaryTree<T> hijoDerecho = new BinaryTree<T>(original.getLeftChild().getData());
			espejo.addRightChild(hijoDerecho);
			this.espejo(original.getLeftChild(), hijoDerecho);
		}
		if (original.hasRightChild()) {
			BinaryTree<T> hijoIzquierdo = new BinaryTree<T>(original.getRightChild().getData());
			espejo.addLeftChild(hijoIzquierdo);
			this.espejo(original.getRightChild(), hijoIzquierdo);
		}
	}

//--------------------------------------------------------------------------

	public void entreNiveles() {
		if (!this.isEmpty())
			this.entreNiveles(1, 2);
	}

	//Se asume que n y m cumplen con la condicion = (0 ≤ n <m ≤ altura)
	private void entreNiveles(int n, int m) {
		BinaryTree<T> nuevo = null;
		Queue<BinaryTree<T>> cola = new Queue<BinaryTree<T>>();
		cola.enqueue(this);
		cola.enqueue(null);
		int nivelActual = 0;
		while (!cola.isEmpty()) {
			nuevo = cola.dequeue();
			if (nuevo != null) {
				if (nivelActual >= n && nivelActual <= m)
					System.out.println(nuevo.getData());
				if (nuevo.hasLeftChild())
					cola.enqueue(nuevo.getLeftChild());
				if (nuevo.hasRightChild())
					cola.enqueue(nuevo.getRightChild());
			} else if (!cola.isEmpty()) {
				cola.enqueue(null);
				nivelActual++;
			}
		}
	}
}
