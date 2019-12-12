public class StackConnector<T> implements DataStructureConnector, Stack<T>{

//   stack size
    private int stackSize;
    private T[] stackArray;     // if List.info is reffered to the stack size, otherwise dunno
    int top;



  /// might need   A CONSTRUCTOR?


    @Override
    public void push(T entry){
        if(this.isEmpty()){
            throw new UnsupportedOperationException("Stack is empty. Can not push element.");
            //increase capacity??
        }

        stackArray[++top] = entry;
    }


    public T pop() throws UnsupportedOperationException {
        if(this.isEmpty()){
            throw new UnsupportedOperationException("Stack is empty. Can not remove element.");
        }
        T element = this.stackArray[top--];
        System.out.println("DEBUG: ELEEMENT  POPPED " + element);
        return element;
    }


    @Override
    public int size() {
        return stackSize;
    }

    public boolean isEmpty() { return top == -1;}

        @Override
        public String toString() {
          //  return list.toString();
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
}

