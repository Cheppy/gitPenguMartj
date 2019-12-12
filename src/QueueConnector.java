public class QueueConnector<T> implements  DataStructureConnector, Queue<T> {

    private int queueSize;
    private T[] queueArray;     //?
    int top;
    @Override
    public int size() {
        return queueSize;
    }

    @Override
    public boolean isEmpty() {
        return this.queueSize == 0;
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

        //List copyQ = new List(0, this.queueArray); //added
        //queueArray.delete();                                 //added
        return null;


    }
}
