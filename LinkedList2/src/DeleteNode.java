import java.util.Scanner;

public class DeleteNode {
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

    public static Node<Integer> deleteNode(Node<Integer> head, int pos) {
        if (head == null)
            return head;
        if (head.next == null && pos > 0)
            return head;

        if (pos == 0) {
            return head.next;
        } else {
            head.next = deleteNode(head.next, --pos);
            return head;
        }
    }

    public static void main(String args[]) {
        Node<Integer> head = inputLL();
        print(head);
        System.out.println();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter position of node to be deleted : ");
        int pos = s.nextInt();
        head = deleteNode(head, pos);
        print(head);

    }

}
