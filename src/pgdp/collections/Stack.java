package pgdp.collections;

interface Stack<T> extends DataStructure {
  void push(T value);

  T pop();
}
