public class QueueImplementationUsingArrayOptimized {
    private int data[];
    private int rear;
    private int front;
    private int size;

    QueueImplementationUsingArrayOptimized() {
        this.data = new int[5];
        this.rear = -1;
        this.front = -1;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int front() throws QueueEmptyException {
        if (front == -1)
            throw new QueueEmptyException();

        return this.data[front];

    }

    public void enqueue(int num) throws QueueFullException {
        if (rear >= data.length - 1)
            throw new QueueFullException();

        if (size == 0) {
            front++;
        }

        data[rear + 1] = num;
        rear++;
        size++;
    }

    private void doubleSize() {
        int temp[] = this.data;
        data = new int[2 * temp.length];

        int j = 0;
        for (int i = front; i <= rear; i++) {
            data[j] = temp[i];
        }

        front = 0;
    }

    public int dequeue() throws QueueEmptyException {
        if (rear <= -1)
            throw new QueueEmptyException();

        int temp = data[front];

        front++;
        size--;

        if (size == 0) {
            front = -1;
            rear = -1;
        }

        return temp;

    }
}
