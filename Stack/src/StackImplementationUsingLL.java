public class StackImplementationUsingLL<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    StackImplementationUsingLL() {
    }

    public void push(T data) {
        Node<T> elementToInsert = new Node<T>(data);
        if (head == null) {
            head = elementToInsert;
            tail = elementToInsert;
            size++;
        } else {
            tail.next = elementToInsert;
            tail = tail.next;
            size++;
        }

    }

    public T top() throws StackEmptyException {
        if (tail == null)
            throw new StackEmptyException();
        return tail.data;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return size;
    }

    public void print() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public T pop() throws StackEmptyException {
        if (tail == null)
            throw new StackEmptyException();

        T temp = tail.data;

        Node<T> current = head, prev = null;

        while (current.next != null) {
            prev = current;
            current = current.next;
        }

        tail = prev;
        if (tail != null) {
            tail.next = null;
        }

        return temp;

    }
}
