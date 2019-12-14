package pgdp.collections;

public class QueueConnector<T> implements DataStructureConnector<T> {
    Queue<T> inner;
          

    public QueueConnector(Queue inQueue) {
        inner = inQueue;
    }
    public boolean hasNextElement () {
    	return !inner.isEmpty();
        //var nextVal = inner.dequeue();
       // boolean hasNextElem = inner.isEmpty();
        //inner.enqueue(nextVal);
        //return hasNextElem;
    }   

    public  void addElement (T value) {
        inner.enqueue(value);
    }

    public T removeNextElement () {
        if (inner.isEmpty()) {
            return null;
        }

        if (!hasNextElement()) {
            return null;
        }
        var two = inner.dequeue(); // removed next
       // push inner back
        return two;
    }
}     
   