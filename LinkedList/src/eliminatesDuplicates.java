import java.util.Scanner;

public class eliminatesDuplicates {
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
        Node<Integer> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    /* Find ]Size Function */
    public static int size(Node<Integer> head) {
        int i = 0;
        while (head != null) {
            i++;
            head = head.next;
        }
        return i;
    }

    public static Node<Integer> removeDuplicates(Node<Integer> head) {
        // Your code goes here
        if (head == null || head.next == null) {
            return head;
        }

        Node<Integer> current = head, prev = null;
        while (current != null) {
            if (prev == null) {
                prev = current;
                current = current.next;
            } else {
                if (!current.data.equals(prev.data)) {
                    if (prev.next != current) {
                        prev.next = current;
                    }
                    prev = current;
                    current = current.next;
                } else {
                    current = current.next;
                }
            }
        }
        prev.next = current;
        return head;
    }

    public static void main(String args[]) {
        Node<Integer> head = inputLL();
        print(head);
        head = removeDuplicates(head);
        print(head);
    }
}
