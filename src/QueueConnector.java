public class QueueConnector<T> implements  DataStructureConnector, Queue<T> {

    private int queue;
    private T[] stackArray;     // if List.info is reffered to the stack size, otherwise dunno
    int top;
    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean hasNextElement() {
        return false;
    }

    @Override
    public Object addElement(Object element) {
        return null;
    }

    @Override
    public Object removeNextElement() {
        return null;
    }

    @Override
    public T enqueue(T element) {
        return null;
    }

    @Override
    public T dequeue() {
        return null;
    }
}
