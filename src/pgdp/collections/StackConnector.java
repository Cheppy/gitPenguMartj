package pgdp.collections;

public class StackConnector<T> implements DataStructureConnector<T> {
  Stack<T> inner;


  public StackConnector(Stack inStack) {
    inner = inStack;
  }
  public boolean hasNextElement () {
    var nextVal = inner.pop();
    boolean hasNextElem = inner.isEmpty();
    inner.push(nextVal);
    return hasNextElem;
  }

  public  void addElement (T value) {
    inner.push(value);
  }

  public T removeNextElement () {
    if (inner.isEmpty()) {
      return null;
    }

    if (!hasNextElement()) {
      return null;
    }
    var one = inner.pop(); // removed inner
    var two = inner.pop(); // removed next
    inner.push(one); // push inner back
    return two;
  }
}
