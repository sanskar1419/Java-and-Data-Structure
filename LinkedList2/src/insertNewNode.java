import java.util.Scanner;

public class insertNewNode {
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

    public static Node<Integer> insertNode(Node<Integer> head, int pos, int data) {
        if (head == null && pos > 0) {
            return head;
        }

        if (pos == 0) {
            Node<Integer> nodeToInsert = new Node<Integer>(data);
            nodeToInsert.next = head;
            return nodeToInsert;
        } else {
            head.next = insertNode(head.next, --pos, data);
            return head;
        }
    }

    public static void main(String args[]) {
        Node<Integer> head = inputLL();
        print(head);
        System.out.println();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number to add and what position : ");
        int num = s.nextInt();
        int pos = s.nextInt();
        head = insertNode(head, pos, num);
        print(head);

    }

}
