import java.util.Scanner;

public class reverseLLR {
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

    public static DoubleNode reverse(Node<Integer> head) {
        if (head == null || head.next == null) {
            DoubleNode result = new DoubleNode(head, head);
            return result;
        }

        DoubleNode rightSide = reverse(head.next);
        rightSide.tail.next = head;
        rightSide.tail = rightSide.tail.next;
        rightSide.tail.next = null;
        return rightSide;
    }

    public static Node<Integer> reverseLLrecursive(Node<Integer> head) {
        DoubleNode result = reverse(head);
        return result.head;
    }

    public static Node<Integer> approach2(Node<Integer> head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node<Integer> smallHead = approach2(head.next);
        Node<Integer> tail = head.next;
        tail.next = head;
        tail = tail.next;
        tail.next = null;
        return smallHead;
    }

    public static void main(String args[]) {
        Node<Integer> head = inputLL();
        print(head);
        System.out.println();
        head = approach2(head);
        print(head);

    }

}
