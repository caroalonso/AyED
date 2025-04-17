package tp2.ejercicio9;

import java.util.LinkedList;
import java.util.List;

public class Queue<T> extends Sequence {
    List<T> data;
    public Queue() {
        this.data = new LinkedList<T>();
    }

    public void enqueue(T dato) {
        data.add(dato); }

    public T dequeue() {
        return data.remove(0);
    }

    public T head() {
        return data.get(0);
    }

    @Override
    public int size() {
        return data.size();
    }

    @Override
    public Boolean isEmpty() {
        return data.isEmpty();
    }

    public String toString() {
        return data.toString();
    }

}
