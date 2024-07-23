public class StackUse {
    public static void main(String args[]) throws StackEmptyException {
        StackImplementationUsingLL<Integer> stack = new StackImplementationUsingLL<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.top());
        int size = stack.size();
        System.out.println(size);

        while (size != 0) {
            System.out.print(stack.pop() + " ");
            size--;
        }

        System.out.println();

        System.out.println(stack.isEmpty());

        // Stack Implementation using Array
        /*
         * StackUsingArray stack = new StackUsingArray();
         * stack.push(1);
         * stack.push(2);
         * stack.push(3);
         * stack.push(4);
         * stack.push(5);
         * System.out.println(stack.top());
         * int size = stack.size();
         * System.out.println(size);
         * 
         * while (size != 0) {
         * System.out.print(stack.pop() + " ");
         * size--;
         * }
         * 
         * System.out.println();
         * 
         * System.out.println(stack.isEmpty());
         */

    }

}
