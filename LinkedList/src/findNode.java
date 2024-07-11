import java.util.Scanner;

public class findNode {
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

    /* Find Node Function */
    public static int findNodeIndex(Node<Integer> head, int n) {
        int i = 0;
        Node<Integer> temp = head;
        while (temp != null) {
            if (n == temp.data)
                return i;
            i++;
            temp = temp.next;
        }

        return -1;
    }

    public static void main(String args[]) {
        Node<Integer> head = inputLL();
        print(head);
        System.out.println(findNodeIndex(head, 60));
    }
}
