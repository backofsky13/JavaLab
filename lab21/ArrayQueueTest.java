package lab21;
public class ArrayQueueTest {
    public static void main(String[] args) {
        testEnqueueAndDequeue();
        testElement();
        testSize();
        testIsEmpty();
    }
    public static void testEnqueueAndDequeue() {
        ArrayQueue<Integer> queue = new ArrayQueue<>();
        queue.clear();
        queue.enqueue(1);
        queue.enqueue(2);
        int result1 = queue.dequeue();
        int result2 = queue.dequeue();

        if (result1 == 1 && result2 == 2 && queue.isEmpty()) {
            System.out.println("testEnqueueAndDequeue: PASSED");
        } else {
            System.out.println("testEnqueueAndDequeue: FAILED");
        }
    }
    public static void testElement() {
        ArrayQueue<Integer> queue = new ArrayQueue<>();
        queue.clear();
        queue.enqueue(1);
        int result1 = queue.element();
        queue.enqueue(2);
        int result2 = queue.element();

        if (result1 == 1 && result2 == 1) {
            System.out.println("testElement: PASSED");
        } else {
            System.out.println("testElement: FAILED");
        }
    }
    public static void testSize() {
        ArrayQueue<Integer> queue = new ArrayQueue<>();
        queue.clear();
        int result1 = queue.size();
        queue.enqueue(1);
        queue.enqueue(2);
        int result2 = queue.size();

        if (result1 == 0 && result2 == 2) {
            System.out.println("testSize: PASSED");
        } else {
            System.out.println("testSize: FAILED");
        }
    }
    public static void testIsEmpty() {
        ArrayQueue<Integer> queue = new ArrayQueue<>();
        queue.clear();
        boolean result1 = queue.isEmpty();
        queue.enqueue(1);
        boolean result2 = queue.isEmpty();

        if (result1 && !result2) {
            System.out.println("testIsEmpty: PASSED");
        } else {
            System.out.println("testIsEmpty: FAILED");
        }
    }
}