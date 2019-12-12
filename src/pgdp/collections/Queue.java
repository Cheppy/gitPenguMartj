package pgdp.collections;

interface Queue<T> extends DataStructure {
  void enqueue(T value);

  T dequeue(); // return null if the queue is empty
}
