public class StackConnector<T> implements DataStructureConnector, Stack<T>{


    private final LinkedList<T> linkedList = new LinkedList<>();

        public T push(T data) {
            linkedList.addFirst(data);
            return data;
        }

        public T pop() {
            return linkedList.removeFirst();
        }

    @Override
    public int size() {
        return 0;
    }

    public boolean isEmpty() {
            return linkedList.isEmpty();
        }

        @Override
        public String toString() {
            return linkedList.toString();
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

    class LinkedList<T> extends  List {

        public LinkedList(int x) {
            super(x);
        }

        public LinkedList(int x, List l) {
            super(x, l);
        }

        private static class Node<T> {

            private T data;
            private Node<T> next;

            public Node(T data) {
                this.data = data;
            }

            @Override
            public String toString() {
                return data.toString();
            }
        }

        private Node<T> first = null;

        @Override
        public void delete() {
            super.delete();
        }

        @Override
        public void insert(T data) {
            Node<T> newFirst = new Node<T>(data);
            newFirst.next = first;
            first = newFirst;
        }

        // используется для pop операции
        public T removeFirst() {
            Node<T> oldFirst = first;
            first = first.next;
            return oldFirst.data;
        }



        public boolean isEmpty() {
            return first == null;
        }

    }