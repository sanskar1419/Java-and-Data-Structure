public class QueueImplementationUsingArrayOptimized {
    private int data[];
    private int rear;
    private int front;
    private int size;

    QueueImplementationUsingArrayOptimized() {
        this.data = new int[3];
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
        if (size == 0)
            throw new QueueEmptyException();

        return this.data[front];

    }

    public void enqueue(int num) throws QueueFullException {
        if (size == data.length)
            doubleSize();
        if (size == 0) {
            front = 0;
        }

        /*
         * rear++;
         * if (rear == data.length) {
         * rear = 0;
         * }
         */

        rear = (rear + 1) % data.length;
        data[rear] = num;
        size++;
    }

    private void doubleSize() {
        System.out.println("Function Executed");
        int temp[] = data;
        data = new int[2 * temp.length];
        int j = 0;
        for (int i = front; i < temp.length; i++) {
            data[j] = temp[i];
            j++;
        }

        if (rear != temp.length - 1) {
            for (int i = rear; i < front; i++) {
                data[j] = temp[i];
                j++;
            }
        }

        front = 0;
        rear = j - 1;

    }

    public void print() {
        for (int i : data) {
            System.out.print(i + " ");
        }

    }

    public int dequeue() throws QueueEmptyException {
        if (size == 0)
            throw new QueueEmptyException();

        int temp = data[front];

        /*
         * front++;
         * if (front == data.length) {
         * front = 0;
         * }
         */

        front = (front + 1) % data.length;

        size--;
        if (size == 0) {
            front = -1;
            rear = -1;
        }

        return temp;

    }
}
