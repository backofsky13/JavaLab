package lab21;
import java.util.NoSuchElementException;
//Реализовывает очередь в виде абстрактного типа данных (с явной передачей ссылки на экземпляр очереди)
public class ArrayQueueADT {
    private Object[] elements = new Object[10];
    private int size = 0;
    private int front = 0;

    // Предусловие: element не равен null
    public static void enqueue(ArrayQueueADT queue, Object element) {
        if (element == null) {
            throw new IllegalArgumentException("Element cannot be null");
        }

        ensureCapacity(queue, queue.size + 1);
        queue.elements[(queue.front + queue.size) % queue.elements.length] = element;
        queue.size++;
    }

    // Предусловие: очередь не пуста
    public static Object element(ArrayQueueADT queue) {
        if (isEmpty(queue)) {
            throw new NoSuchElementException("Queue is empty");
        }
        return queue.elements[queue.front];
    }

    // Предусловие: очередь не пуста
    public static Object dequeue(ArrayQueueADT queue) {
        if (isEmpty(queue)) {
            throw new NoSuchElementException("Queue is empty");
        }
        Object removed = queue.elements[queue.front];
        queue.elements[queue.front] = null;
        queue.front = (queue.front + 1) % queue.elements.length;
        queue.size--;
        return removed;
    }

    public static int size(ArrayQueueADT queue) {
        return queue.size;
    }

    public static boolean isEmpty(ArrayQueueADT queue) {
        return queue.size == 0;
    }

    public static void clear(ArrayQueueADT queue) {
        while (!isEmpty(queue)) {
            dequeue(queue);
        }
    }

    private static void ensureCapacity(ArrayQueueADT queue, int capacity) {
        if (capacity > queue.elements.length) {
            int newCapacity = Math.max(2 * queue.elements.length, capacity);
            Object[] newElements = new Object[newCapacity];
            for (int i = 0; i < queue.size; i++) {
                newElements[i] = queue.elements[(queue.front + i) % queue.elements.length];
            }
            queue.elements = newElements;
            queue.front = 0;
        }
    }
}