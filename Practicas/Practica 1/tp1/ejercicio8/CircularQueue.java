package tp1.ejercicio8;

public class CircularQueue <T> extends Queue<T> {
    public T shift() {
        if (isEmpty()) {
            throw new RuntimeException("La cola se encuentra vacia");
        }
        // Remueve el primer elemento y lo añade al final, retornando dicho elemento
        T item = dequeue();
        enqueue(item);

        return item;
    }
}

