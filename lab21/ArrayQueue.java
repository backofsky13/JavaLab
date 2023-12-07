package lab21;
import java.util.NoSuchElementException;
//Реализовывает очередь в виде класса (с неявной передачей ссылки на экземпляр очереди)
public class ArrayQueue<T> {
    private T[] elements = (T[]) new Object[10];
    private int size = 0;
    private int front = 0;

    public void enqueue(T element) {
        ensureCapacity(size + 1);
        elements[(front + size) % elements.length] = element;
        size++;
    }

    public T element() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return elements[front];
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        T removed = elements[front];
        elements[front] = null;
        front = (front + 1) % elements.length;
        size--;
        return removed;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        while (!isEmpty()) {
            dequeue();
        }
    }
    private void ensureCapacity(int capacity) {
        if (capacity > elements.length) {
            int newCapacity = Math.max(2 * elements.length, capacity);
            T[] newElements = (T[]) new Object[newCapacity];
            for (int i = 0; i < size; i++) {
                newElements[i] = elements[(front + i) % elements.length];
            }
            elements = newElements;
            front = 0;
        }
    }
}