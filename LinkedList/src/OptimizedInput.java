import java.util.Scanner;

public class OptimizedInput {
    public static Node<Integer> inputLL(){
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        Node<Integer> head = null , tail = null;

        while(data != -1){
            Node<Integer> currentNode = new Node<>(data);
            if(head == null){
                head = currentNode;
                tail = currentNode;
            } else {
                tail.reference = currentNode;
                tail =  tail.reference; // tail = currentNode
            }
            data = s.nextInt();
        }

        return head;
    }
    public static void printLL(Node<Integer> head){
        Node<Integer> temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.reference;
        }
        System.out.println();
    }
    public static void main(String args[]){
        Node<Integer> head = inputLL();
        printLL(head);
    }
}
