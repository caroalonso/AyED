package tp1.ejercicio8;

public class DoubleEndedQueue<T> extends Queue<T>{
    public void enqueueFirst(T dato) {
        data.add(0, dato); // Inserta el dato en la posición 0, moviendo cualquier elemento existente hacia la derecha
    }
}
