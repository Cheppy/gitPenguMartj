public class StackConnector<T> implements DataStructureConnector, Stack<T>{
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

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public T push(T elem) {
        return null;
    }

    @Override
    public T pop() {
        return null;
    }
}
