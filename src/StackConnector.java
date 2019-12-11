public class StackConnector<T> implements DataStructureConnector, Stack<T>{

    private char[] myStack;
    private StackConnector top;
    private T data;
    private StackConnector prev, next;



    @Override
    public boolean hasNextElement() {
        return false;
    }

    @Override
    public Object addElement(Object element) {
        //Stack<T>[] = element;
        return null;
    }

    @Override
    public Object removeNextElement() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public T push(T data) {
        StackConnector temp = new StackConnector();
        if (top == null) {
            top = temp;
        } else {
            top.next= temp;
            temp.prev = top;
            top = temp;
        }
        return temp.data; //???
    }



    @Override
    public T pop() {
        return null;
    }
}
