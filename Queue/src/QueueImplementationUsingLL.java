public class QueueImplementationUsingLL {
    private Node front;
    private Node rear;
    private int size;

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int front() throws QueueEmptyException {
        if (size == 0)
            throw new QueueEmptyException();

        return front.data;

    }

    public void enqueue(int num) {
        Node nodeToInsert = new Node(num);
        if (size == 0) {
            front = nodeToInsert;
            rear = nodeToInsert;
        } else {
            rear.next = nodeToInsert;
            rear = rear.next;
        }

        size++;

    }

    public int dequeue() throws QueueEmptyException {

        if (size == 0)
            throw new QueueEmptyException();

        int temp = front.data;
        front = front.next;
        if (front == null)
            rear = null;

        size--;

        return temp;
    }

}
