package lab21;
public class ArrayQueueModuleTest {
    public static void main(String[] args) {
        testEnqueueAndDequeue();
        testElement();
        testSize();
        testIsEmpty();
    }
    public static void testEnqueueAndDequeue() {
        ArrayQueueModule.clear();
        ArrayQueueModule.enqueue(1);
        ArrayQueueModule.enqueue(2);
        int result1 = (int) ArrayQueueModule.dequeue();
        int result2 = (int) ArrayQueueModule.dequeue();

        if (result1 == 1 && result2 == 2 && ArrayQueueModule.isEmpty()) {
            System.out.println("testEnqueueAndDequeue: PASSED");
        } else {
            System.out.println("testEnqueueAndDequeue: FAILED");
        }
    }

    public static void testElement() {
        ArrayQueueModule.clear();
        ArrayQueueModule.enqueue(1);
        int result1 = (int) ArrayQueueModule.element();
        ArrayQueueModule.enqueue(2);
        int result2 = (int) ArrayQueueModule.element();

        if (result1 == 1 && result2 == 1) {
            System.out.println("testElement: PASSED");
        } else {
            System.out.println("testElement: FAILED");
        }
    }

    public static void testSize() {
        ArrayQueueModule.clear();
        int result1 = ArrayQueueModule.size();
        ArrayQueueModule.enqueue(1);
        ArrayQueueModule.enqueue(2);
        int result2 = ArrayQueueModule.size();

        if (result1 == 0 && result2 == 2) {
            System.out.println("testSize: PASSED");
        } else {
            System.out.println("testSize: FAILED");
        }
    }

    public static void testIsEmpty() {
        ArrayQueueModule.clear();
        boolean result1 = ArrayQueueModule.isEmpty();
        ArrayQueueModule.enqueue(1);
        boolean result2 = ArrayQueueModule.isEmpty();

        if (result1 && !result2) {
            System.out.println("testIsEmpty: PASSED");
        } else {
            System.out.println("testIsEmpty: FAILED");
        }
    }
}