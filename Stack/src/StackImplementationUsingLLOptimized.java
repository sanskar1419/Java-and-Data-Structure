public class StackImplementationUsingLLOptimized<T> {
    private Node<T> head;
    private int size;

    StackImplementationUsingLLOptimized() {
    }

    public void push(T data) {
        Node<T> elementToInsert = new Node<T>(data);
        if (head == null) {
            head = elementToInsert;
            size++;
        } else {
            elementToInsert.next = head;
            head = elementToInsert;
            size++;
        }

    }

    public T top() throws StackEmptyException {
        if (head == null)
            throw new StackEmptyException();
        return head.data;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return size;
    }

    public T pop() throws StackEmptyException {
        if (head == null)
            throw new StackEmptyException();

        T temp = head.data;
        head = head.next;

        return temp;

    }
}
