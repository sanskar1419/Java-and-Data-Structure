public class QueueImplementationUsingArray {
    private int data[];
    private int rear;

    QueueImplementationUsingArray() {
        this.data = new int[5];
        this.rear = -1;
    }

    public int size() {
        return this.rear + 1;
    }

    public boolean isEmpty() {
        return rear == -1;
    }

    public int front() throws QueueEmptyException {
        if (rear == -1)
            throw new QueueEmptyException();

        return this.data[0];

    }

    public void enqueue(int num) {
        if (rear >= data.length - 1)
            doubleSize();

        data[rear + 1] = num;
        rear++;
    }

    private void doubleSize() {
        int temp[] = this.data;
        data = new int[2 * temp.length];

        int j = 0;
        for (int i : temp) {
            data[j] = i;
            j++;
        }
    }

    public int dequeue() throws QueueEmptyException {
        if (rear <= -1)
            throw new QueueEmptyException();

        int temp = data[0];

        if (rear == 0) {
            rear--;
        } else {
            for (int i = 0; i < rear; i++) {
                this.data[i] = this.data[i + 1];
            }

            rear--;
        }

        return temp;

    }
}
