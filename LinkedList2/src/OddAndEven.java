import java.util.Scanner;

public class OddAndEven {
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

    public static Node<Integer> evenAfterOdd(Node<Integer> head) {
        // Your code goes here
        if (head == null || head.next == null)
            return head;

        Node<Integer> oddHead = null, oddTail = null, evenHead = null, evenTail = null;

        while (head != null) {
            if (head.data % 2 == 0) {
                if (evenHead == null) {
                    evenHead = head;
                    evenTail = head;
                } else {
                    evenTail.next = head;
                    evenTail = evenTail.next;
                }
                head = head.next;
            } else {
                if (oddHead == null) {
                    oddHead = head;
                    oddTail = head;
                } else {
                    oddTail.next = head;
                    oddTail = oddTail.next;
                }

                head = head.next;
            }
        }

        if (evenHead == null)
            return oddHead;

        if (oddHead == null)
            return evenHead;

        oddTail.next = evenHead;
        evenTail.next = null;

        return oddHead;
    }

    public static void main(String args[]) {
        Node<Integer> head = inputLL();
        print(head);
        System.out.println();
        head = evenAfterOdd(head);
        print(head);
    }

}
