import java.util.LinkedList;
import java.util.Queue;

public class QueueUse {
    public static void main(String args[]) throws StackEmptyException {

        StackImplementationUsingQueue stack = new StackImplementationUsingQueue();

        System.out.println(stack.isEmpty());
        stack.enqueue(10);
        stack.enqueue(20);
        stack.enqueue(30);

        System.out.println(stack.size());

        System.out.println(stack.dequeue());
        System.out.println(stack.dequeue());
        stack.enqueue(100);
        stack.enqueue(50);
        stack.enqueue(2);

        System.out.println(stack.size());
        System.out.println(stack.isEmpty());

        while (!stack.isEmpty()) {
            System.out.print(stack.dequeue() + " ");
        }

        System.out.println();
        System.out.println(stack.isEmpty());

        /*
         * Queue Implementation using 2 Stack
         * QueueImplementationUsingStack queue = new QueueImplementationUsingStack();
         * 
         * System.out.println(queue.isEmpty());
         * queue.enqueue(10);
         * queue.enqueue(20);
         * queue.enqueue(30);
         * 
         * System.out.println(queue.size());
         * 
         * System.out.println(queue.dequeue());
         * System.out.println(queue.dequeue());
         * queue.enqueue(100);
         * queue.enqueue(50);
         * queue.enqueue(2);
         * 
         * System.out.println(queue.size());
         * System.out.println(queue.isEmpty());
         * 
         * while (!queue.isEmpty()) {
         * System.out.print(queue.dequeue() + " ");
         * }
         * 
         * System.out.println();
         * System.out.println(queue.isEmpty());
         */

        /*
         * Queue Implementation using Java Collection Framework
         * Queue<Integer> queue = new LinkedList<>();
         * 
         * System.out.println(queue.poll());
         * System.out.println(queue.remove());
         */

        /*
         * Queue Implementation using LL
         * QueueImplementationUsingLL q = new QueueImplementationUsingLL();
         * 
         * q.enqueue(10);
         * q.enqueue(20);
         * q.enqueue(30);
         * 
         * System.out.println(q.dequeue());
         * System.out.println(q.dequeue());
         * 
         * q.enqueue(20);
         * q.enqueue(40);
         * 
         * System.out.println(q.size());
         * System.out.println(q.isEmpty());
         * 
         * while (!q.isEmpty()) {
         * System.out.print(q.dequeue() + " ");
         * }
         * 
         * System.out.println();
         * System.out.println(q.isEmpty());
         */

        /*
         * Queue implementation using Array
         * QueueImplementationUsingArrayOptimized queue = new
         * QueueImplementationUsingArrayOptimized();
         * 
         * queue.enqueue(1);
         * queue.enqueue(2);
         * queue.enqueue(3);
         * queue.dequeue();
         * queue.enqueue(5);
         * queue.enqueue(8);
         * queue.enqueue(1);
         * queue.enqueue(2);
         * 
         * queue.print();
         * // System.out.println(queue.front());
         * // System.out.println(queue.size());
         * 
         * // while (!queue.isEmpty()) {
         * // System.out.print(queue.dequeue() + " ");
         * // }
         * 
         * // System.out.println();
         * 
         * // System.out.println(queue.isEmpty());
         */
    }
}
