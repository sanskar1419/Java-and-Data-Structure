import java.util.Scanner;

public class SwapTwoNodesInLL {
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

    public static Node<Integer> swapNodes(Node<Integer> head, int i, int j) {
        // Your code goes here
        if (head == null || head.next == null || i == j)
            return head;

        int k = 0;
        Node<Integer> current = head, prev = null, firstCurrent = null, secondCurrent = null, firstPrev = null,
                secondPrev = null;

        while (current != null) {
            if (k == i) {
                firstCurrent = current;
                firstPrev = prev;
            }

            if (k == j) {
                secondCurrent = current;
                secondPrev = prev;
            }

            k++;
            prev = current;
            current = current.next;
        }

        if (firstCurrent == null || secondCurrent == null)
            return head;

        if (firstPrev == null) {
            secondPrev.next = firstCurrent;
            firstPrev = firstCurrent.next;
            firstCurrent.next = secondCurrent.next;
            secondCurrent.next = firstPrev;
            head = secondCurrent;
        } else if (secondPrev == null) {
            firstPrev.next = secondCurrent;
            secondPrev = secondCurrent.next;
            secondCurrent.next = firstCurrent.next;
            firstCurrent.next = secondPrev;
            head = firstCurrent;
        } else {
            secondPrev.next = firstCurrent;
            firstPrev.next = secondCurrent;
            Node<Integer> temp = firstCurrent.next;
            firstCurrent.next = secondCurrent.next;
            secondCurrent.next = temp;
        }
        return head;
    }

    public static void main(String args[]) {
        Node<Integer> head = inputLL();
        print(head);
        System.out.println();
        head = swapNodes(head, 0, 7);
        print(head);
    }

}
