import java.util.Stack;

public class QueueImplementationUsingStack {
    private Stack<Integer> stack;
    private Stack<Integer> helper;

    public QueueImplementationUsingStack() {
        stack = new Stack<>();
        helper = new Stack<>();
    }

    public int size() {
        return stack.size();
    }

    public boolean isEmpty() {
        return stack.size() == 0;
    }

    public int front() throws QueueEmptyException {
        if (stack.isEmpty())
            throw new QueueEmptyException();

        while (!stack.isEmpty()) {
            helper.push(stack.pop());
        }

        int temp = helper.peek();

        while (!helper.isEmpty()) {
            stack.push(helper.pop());
        }

        return temp;

    }

    public void enqueue(int num) {
        stack.push(num);
    }

    public int dequeue() throws QueueEmptyException {
        if (stack.isEmpty())
            throw new QueueEmptyException();

        while (!stack.isEmpty()) {
            helper.push(stack.pop());
        }

        int temp = helper.pop();

        while (!helper.isEmpty()) {
            stack.push(helper.pop());
        }

        return temp;
    }
}
