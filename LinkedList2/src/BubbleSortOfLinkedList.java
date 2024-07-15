import java.util.Scanner;

public class BubbleSortOfLinkedList {
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

    public static int size(Node<Integer> head) {
        if (head == null)
            return 0;

        int i = 0;
        while (head != null) {
            i++;
            head = head.next;
        }

        return i;
    }

    public static Node<Integer> bubbleSort(Node<Integer> head) {
        if (head == null || head.next == null) {
            return head;
        }
        int size = size(head);
        for (int i = 0; i < size - 1; i++) {
            Node<Integer> current = head, prev = null, next = null;
            while (current.next != null) {
                next = current.next;
                if (current.data > next.data) {
                    if (prev == null) {
                        head = next;
                    } else {
                        prev.next = next;
                    }
                    current.next = next.next;
                    next.next = current;
                    prev = next;
                } else {
                    prev = current;
                    current = next;
                }
            }
        }

        return head;
    }

    public static void main(String args[]) {
        Node<Integer> head = inputLL();
        print(head);
        System.out.println();
        head = bubbleSort(head);
        print(head);
    }

}
