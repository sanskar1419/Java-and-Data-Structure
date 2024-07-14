import java.util.Scanner;

public class DeleteEveryNNodes {
    public static Node<Integer> inputLL() {
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        Node<Integer> head = null, tail = null;

        while (data != -1) {
            // If it is not equal to -1 then we will create a node
            Node<Integer> currentNode = new Node<>(data);

            // If the node is the first node then only we will assign it to head
            if (head == null) {
                head = currentNode;
                tail = currentNode;
            } else {
                tail.next = currentNode;
                tail = tail.next;
            }
            data = s.nextInt();
        }
        return head;
    }

    public static void print(Node<Integer> head) {
        // Base Case
        if (head == null) {
            return;
        }

        System.out.print(head.data + " ");
        print(head.next);
    }

    public static Node<Integer> skipMdeleteN(Node<Integer> head, int M, int N) {
        // Your code goes here
        if (head == null || N == 0)
            return head;

        if (M == 0)
            return null;

        Node<Integer> current = head, prev = null;

        while (current != null) {
            int i = 0;
            int j = 0;
            while (i < M && current != null) {
                i++;
                prev = current;
                current = current.next;
            }

            while (j < N && current != null) {
                j++;
                current = current.next;
            }

            prev.next = current;
        }

        return head;
    }

    public static void main(String args[]) {
        Node<Integer> head = inputLL();
        print(head);
        System.out.println();
        head = skipMdeleteN(head, 2, 2);
        print(head);
    }

}
