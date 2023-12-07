package lab21;
public class ArrayQueueADTTest {
    public static void main(String[] args) {
        testEnqueueAndDequeue();
        testElement();
        testSize();
        testIsEmpty();
    }
    public static void testEnqueueAndDequeue() {
        ArrayQueueADT queue = new ArrayQueueADT();
        ArrayQueueADT.clear(queue);
        ArrayQueueADT.enqueue(queue, 1);
        ArrayQueueADT.enqueue(queue, 2);
        Integer result1 = (Integer) ArrayQueueADT.dequeue(queue);
        Integer result2 = (Integer) ArrayQueueADT.dequeue(queue);
        if (result1 != null && result2 != null && result1 == 1 && result2 == 2 && ArrayQueueADT.isEmpty(queue)) {
            System.out.println("testEnqueueAndDequeue: PASSED");
        } else {
            System.out.println("testEnqueueAndDequeue: FAILED");
        }
    }
    public static void testElement() {
        ArrayQueueADT queue = new ArrayQueueADT();
        ArrayQueueADT.clear(queue);
        ArrayQueueADT.enqueue(queue, 1);
        Integer result1 = (Integer) ArrayQueueADT.element(queue);
        ArrayQueueADT.enqueue(queue, 2);
        Integer result2 = (Integer) ArrayQueueADT.element(queue);
        if (result1 != null && result2 != null && result1 == 1 && result2 == 1) {
            System.out.println("testElement: PASSED");
        } else {
            System.out.println("testElement: FAILED");
        }
    }
    public static void testSize() {
        ArrayQueueADT queue = new ArrayQueueADT();
        ArrayQueueADT.clear(queue);
        int result1 = ArrayQueueADT.size(queue);
        ArrayQueueADT.enqueue(queue, 1);
        ArrayQueueADT.enqueue(queue, 2);
        int result2 = ArrayQueueADT.size(queue);

        if (result1 == 0 && result2 == 2) {
            System.out.println("testSize: PASSED");
        } else {
            System.out.println("testSize: FAILED");
        }
    }
    public static void testIsEmpty() {
        ArrayQueueADT queue = new ArrayQueueADT();
        ArrayQueueADT.clear(queue);
        boolean result1 = ArrayQueueADT.isEmpty(queue);
        ArrayQueueADT.enqueue(queue, 1);
        boolean result2 = ArrayQueueADT.isEmpty(queue);

        if (result1 && !result2) {
            System.out.println("testIsEmpty: PASSED");
        }
        else {
            System.out.println("testIsEmpty: FAILED");
        }
    }
}