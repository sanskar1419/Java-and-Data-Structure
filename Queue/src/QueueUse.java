public class QueueUse {
    public static void main(String args[]) throws QueueEmptyException, QueueFullException {
        QueueImplementationUsingArrayOptimized queue = new QueueImplementationUsingArrayOptimized();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.dequeue();
        queue.enqueue(5);
        queue.enqueue(8);
        queue.enqueue(1);
        queue.enqueue(2);

        queue.print();
        // System.out.println(queue.front());
        // System.out.println(queue.size());

        // while (!queue.isEmpty()) {
        // System.out.print(queue.dequeue() + " ");
        // }

        // System.out.println();

        // System.out.println(queue.isEmpty());
    }
}
