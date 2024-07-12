
import java.util.Scanner;

public class mergeSort {

    public static Node<Integer> inputLL() {
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        Node<Integer> head = null;

        while (data != -1) {
            // If it is not equal to -1 then we will create a node
            Node<Integer> currentNode = new Node<>(data);

            // If the node is the first node then only we will assign it to head
            if (head == null) {
                head = currentNode;
            } else {
                Node<Integer> tail = head;
                while (tail.next != null) {
                    tail = tail.next;
                }

                tail.next = currentNode;
            }
            data = s.nextInt();
        }
        return head;
    }

    public static void print(Node<Integer> head) {
        if (head == null) {
            return;
        }

        System.out.print(head.data + " ");
        print(head.next);
    }

    public static Node<Integer> calculateMid(Node<Integer> head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node<Integer> slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static Node<Integer> mergeLL(Node<Integer> head1, Node<Integer> head2) {
        if (head1 == null) {
            return head2;
        }

        if (head2 == null) {
            return head1;
        }
        Node<Integer> firstHead = head1;
        Node<Integer> secondHead = head2, head = null, tail = null;

        while (firstHead != null && secondHead != null) {
            if (firstHead.data <= secondHead.data) {
                if (head == null) {
                    head = firstHead;
                    tail = firstHead;
                    firstHead = firstHead.next;
                } else {
                    tail.next = firstHead;
                    tail = firstHead;
                    firstHead = firstHead.next;
                }

            } else {
                if (head == null) {
                    head = secondHead;
                    tail = secondHead;
                    secondHead = secondHead.next;
                } else {
                    tail.next = secondHead;
                    tail = secondHead;
                    secondHead = secondHead.next;
                }
            }
        }

        if (firstHead != null) {
            tail.next = firstHead;

        }

        if (secondHead != null) {
            tail.next = secondHead;

        }

        return head;

    }

    public static Node<Integer> ms(Node<Integer> head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node<Integer> firstHead = head;
        Node<Integer> midNode = calculateMid(head);
        Node<Integer> secondHead = midNode.next;
        midNode.next = null;

        firstHead = ms(firstHead);
        secondHead = ms(secondHead);

        Node<Integer> newHead = mergeLL(firstHead, secondHead);
        return newHead;

    }

    public static void main(String args[]) {
        Node<Integer> head = inputLL();
        print(head);
        System.out.println();
        head = ms(head);
        print(head);
        System.out.println();
    }

    public static Node<Integer> skipMdeleteN(Node<Integer> head, int M, int N) {
        if (M == 0 || head == null) {
            return null;
        }
        if (N == 0) {
            return head;
        }
        Node<Integer> currentNode = head;
        Node<Integer> temp = null;
        while (currentNode != null) {
            int take = 0;
            int skip = 0;
            while (currentNode != null && take < M) {
                if (temp == null) {
                    temp = currentNode;
                } else {
                    temp.next = currentNode;
                    temp = currentNode;
                }
                currentNode = currentNode.next;
                take += 1;
            }
            while (currentNode != null && skip < N) {
                currentNode = currentNode.next;
                skip += 1;
            }
        }
        if (temp != null) {
            temp.next = null;
        }
        return head;
    }

}
