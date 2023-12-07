package lab21;
import java.util.NoSuchElementException;
//Реализовывает один экземпляр очереди с использованием переменных класса.
public class ArrayQueueModule {
    private static Object[] elements = new Object[10];
    private static int size = 0;
    private static int front = 0;
    // Инвариант: size >= 0, front >= 0, size <= elements.length
    // Предусловие: element не равен null
    public static void enqueue(Object element) {
        ensureCapacity(size + 1);
        elements[(front + size) % elements.length] = element;
        size++;
    }
    // Предусловие: очередь не пуста
    public static Object element() {
        if (size == 0) {
            throw new NoSuchElementException("Queue is empty");
        }
        return elements[front];
    }
    // Предусловие: очередь не пуста
    public static Object dequeue() {
        if (size == 0) {
            throw new NoSuchElementException("Queue is empty");
        }
        Object removed = elements[front];
        elements[front] = null;
        front = (front + 1) % elements.length;
        size--;
        return removed;
    }
    public static int size() {
        return size;
    }
    public static boolean isEmpty() {
        return size == 0;
    }
    public static void clear() {
        for (int i = 0; i < size; i++) {
            elements[(front + i) % elements.length] = null;
        }
        size = 0;
        front = 0;
    }
    private static void ensureCapacity(int capacity) {
        if (capacity > elements.length) {
            int newCapacity = Math.max(2 * elements.length, capacity);
            Object[] newElements = new Object[newCapacity];
            for (int i = 0; i < size; i++) {
                newElements[i] = elements[(front + i) % elements.length];
            }
            elements = newElements;
            front = 0;
        }
    }
}