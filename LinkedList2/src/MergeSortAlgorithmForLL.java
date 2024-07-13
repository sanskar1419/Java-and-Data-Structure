import java.util.Scanner;

public class MergeSortAlgorithmForLL {
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

    public static Node<Integer> merge(Node<Integer> head1, Node<Integer> head2) {
        if (head1 == null && head2 == null)
            return head1;

        if (head1 == null)
            return head2;

        if (head2 == null)
            return head1;

        Node<Integer> head = null, tail = null;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                if (head == null) {
                    head = head1;
                    tail = head;
                    head1 = head1.next;
                } else {
                    tail.next = head1;
                    tail = tail.next;
                    head1 = head1.next;
                }
            } else {
                if (head == null) {
                    head = head2;
                    tail = head;
                    head2 = head2.next;
                } else {
                    tail.next = head2;
                    tail = tail.next;
                    head2 = head2.next;
                }
            }
        }

        if (head1 != null) {
            tail.next = head1;
        }

        if (head2 != null) {
            tail.next = head2;
        }

        return head;
    }

    public static Node<Integer> mid(Node<Integer> head) {
        if (head == null || head.next == null)
            return head;

        Node<Integer> slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static Node<Integer> MS(Node<Integer> head) {
        if (head == null || head.next == null)
            return head;

        Node<Integer> mid = mid(head);
        Node<Integer> lHead = head, rHead = mid.next;
        mid.next = null;
        lHead = MS(lHead);
        rHead = MS(rHead);
        head = merge(lHead, rHead);
        return head;

    }

    public static void main(String args[]) {
        Node<Integer> head = inputLL();
        head = MS(head);
        print(head);

    }

}
