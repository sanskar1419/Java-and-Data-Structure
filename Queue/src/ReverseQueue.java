import java.util.Queue;

public class ReverseQueue {
    public static void reverseQueue(Queue<Integer> input) {
        // Your code goes here
        if (input.isEmpty())
            return;

        int element = input.poll();
        reverseQueue(input);
        input.add(element);
    }
}
