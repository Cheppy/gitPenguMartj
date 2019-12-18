package pgdp.collections;

import java.lang.reflect.Array;

public class LinkedQueue<T> implements Queue<T> {

  List<T> elem;

  public LinkedQueue() {           
	  this.elem = null;
  }
  // DataStructure implementation
  public int size() {
    if (elem != null) {
      return elem.length();
    }
    return 0;
  }
 
  public boolean isEmpty() {
    return elem == null;
  }

  // Stack implementation
  public void enqueue(T value) {
    if (elem == null) {
      elem = new List(value);
    } else {
      elem = new List(value, elem);
    }
  } 

  public T dequeue() {
	    if (isEmpty())
	      return null;
	    
	    int len = elem.length();
	    Object[] values =   new Object[len];
	    var next = elem;
	    for (int x = len - 1; x >= 0; x--) {
	      values[x] = next.getInfo();
	      next = next.getNext();
	    }       
	    var outVal = (T) values[0];

	    // rebuild the queue
	    List<T> l = null;
	    for (int x = len - 1; x > 0; x--) {
	      if (l == null) {
	        l = new List((T)values[x]);
	      }
	      else l = new List((T)values[x], l);
	    }

	    elem = l;

	    return outVal;
	  }      

}