import java.util.Scanner;

public class appendLastNToStart {
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

    public static Node<Integer> appendToLast(Node<Integer> head, int N) {
        if (head == null || head.next == null || N == 0) {
            return head;
        }

        int n = size(head);

        if (N == n) {
            return head;
        }

        int i = 0;
        Node<Integer> current = head, prev = null, breakHead = null, breakPrev = null;
        while (current != null) {
            if (i == n - N) {
                breakHead = current;
                breakPrev = prev;
            }
            i++;
            prev = current;
            current = current.next;
        }

        if (breakHead != null) {
            prev.next = head;
            breakPrev.next = null;
            head = breakHead;
        }

        return head;
    }

    public static void main(String args[]) {
        Node<Integer> head = inputLL();
        print(head);
        head = appendToLast(head, 5);
        print(head);

    }
}
