import java.util.Scanner;

public class isPalindrome {
    /* Taking LL Input */
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

    /* Printing LL */
    public static void print(Node<Integer> head) {
        Node<Integer> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    /* Find Size Function */
    public static int size(Node<Integer> head) {
        int i = 0;
        while (head != null) {
            i++;
            head = head.next;
        }
        return i;
    }

    /* Function to find the mid node */
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

    /* Return the reversed list head */
    public static Node<Integer> reverseLL(Node<Integer> head) {
        if (head == null || head.next == null)
            return head;

        Node<Integer> current = head, prev = null, next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    /* Checking Weather LL is palindrome or not */
    public static boolean palindromeCheck(Node<Integer> head) {
        // Your code goes here
        if (head == null || head.next == null)
            return true;

        Node<Integer> mid = mid(head);
        Node<Integer> reversedHead = reverseLL(mid.next);

        while (reversedHead != null) {
            if (!reversedHead.data.equals(head.data)) {
                return false;
            }
            reversedHead = reversedHead.next;
            head = head.next;
        }

        return true;
    }

    public static void main(String args[]) {
        Node<Integer> head = inputLL();
        System.out.println(palindromeCheck(head));
    }
}
