import java.util.Scanner;

public class KReverse {
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

    public static Node<Integer> reverse(Node<Integer> head, Node<Integer> tail) {
        Node<Integer> current = head, prev = null, next = head.next;
        while (current.next != tail) {
            current.next = prev;
            prev = current;
            current = next;
            next = current.next;
        }

        current.next = prev;
        return current;
    }

    public static Node<Integer> kReverse(Node<Integer> head, int k) {
        // Your code goes here
        if (head == null || head.next == null || k == 0 || k == 1) {
            return head;
        }

        Node<Integer> current = head, prev = null, startNode = current, startNodePrev = null;

        while (current != null) {
            int i = 0;
            while (i < k && current != null) {
                i++;
                prev = current;
                current = current.next;
            }

            Node<Integer> reversedHead = reverse(startNode, current);
            if (startNodePrev == null) {
                head = reversedHead;
            } else {
                startNodePrev.next = reversedHead;
            }

            startNodePrev = startNode;
            startNode = current;
        }

        return head;

    }

    public static void main(String args[]) {
        Node<Integer> head = inputLL();
        print(head);
        System.out.println();
        head = kReverse(head, 2);
        print(head);
    }

}
