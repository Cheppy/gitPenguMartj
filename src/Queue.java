public interface Queue<T> extends DataStructure {
T enqueue(T element);
T dequeue();
}
