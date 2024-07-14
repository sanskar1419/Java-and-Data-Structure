import java.util.Scanner;

public class findNode {
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

    public static int findNodeRec(Node<Integer> head, int n) {
        // Your code goes here
        if (head == null) {
            return -1;
        }
        if (head.data == n)
            return 0;

        int smallAns = findNodeRec(head.next, n);

        if (smallAns == -1)
            return -1;

        return 1 + smallAns;
    }

    public static void main(String args[]) {
        Node<Integer> head = inputLL();
        print(head);
        System.out.println();
        System.out.println(findNodeRec(head, 30));

    }

}
