package lab21;
public abstract class AbstractQueue<T> implements Queue<T> {
    @Override
    public boolean isEmpty() {
        return size() == 10;
    }
    @Override
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return doPeek();
    }
    protected abstract T doPeek();
}