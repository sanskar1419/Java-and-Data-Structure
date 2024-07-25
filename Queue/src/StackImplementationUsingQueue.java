import java.util.LinkedList;
import java.util.Queue;

public class StackImplementationUsingQueue {
    private Queue<Integer> queue;
    private Queue<Integer> helper;

    public StackImplementationUsingQueue() {
        queue = new LinkedList<>();
        helper = new LinkedList<>();
    }

    public int size() {
        return queue.size();
    }

    public boolean isEmpty() {
        return queue.size() == 0;
    }

    public int front() throws StackEmptyException {
        if (queue.isEmpty())
            throw new StackEmptyException();

        transferToHelper(queue, helper);

        int temp = helper.peek();

        transferToHelper(helper, queue);

        return temp;

    }

    public void enqueue(int num) {
        queue.add(num);
    }

    private void transferToHelper(Queue<Integer> queue, Queue<Integer> helper) {
        if (queue.size() <= 0) {
            return;
        }

        int element = queue.poll();
        transferToHelper(queue, helper);
        helper.add(element);
    }

    public int dequeue() throws StackEmptyException {
        if (queue.isEmpty())
            throw new StackEmptyException();

        transferToHelper(queue, helper);

        int temp = helper.poll();

        transferToHelper(helper, queue);

        return temp;
    }
}
