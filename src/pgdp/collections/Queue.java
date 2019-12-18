package pgdp.collections;

public interface Queue<T> extends DataStructure {
  public void enqueue(T value);

  public T dequeue(); // return null if the queue is empty
}
                            