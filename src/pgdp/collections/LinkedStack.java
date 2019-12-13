package pgdp.collections;

public class LinkedStack<T> implements Stack<T> {
  List<T> elem;

  public  LinkedStack(){
    this.elem = null;
  }
  // DataStructure implementation
  public int size() {
    if (elem != null ) {
      return elem.length();
    }
    return 0;
  }

  public boolean isEmpty() {
    return elem == null;
  }

  // Stack implementation
  public void push(T value) {
    if (elem == null) {
      elem = new List(value);
    } else {
      elem = new List(value, elem);
    }
  }

  public T pop() {
    if (isEmpty()) return null;
    var popped = elem;
    elem = elem.getNext();
    return popped.getInfo();
  }


}
