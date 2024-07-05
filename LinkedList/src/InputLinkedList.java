import java.util.Scanner;

public class InputLinkedList {
    public static Node<Integer> inputLL(){
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        Node<Integer> head = null;

        while(data != -1){
            // If it is not equal to -1 then we will create a node
            Node<Integer> currentNode = new Node<>(data);

            // If the node is the first node then only we will assign it to head
            if(head == null){
              head = currentNode;
            } else {
              Node<Integer> tail = head;
              while(tail.reference != null){
                tail = tail.reference;
              }

              tail.reference = currentNode;
            }
            data = s.nextInt();
        }
        return head;
    }
    
    public static void print(Node<Integer> head){
        Node<Integer> temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.reference;
        }

        System.out.println();
    }

    public static void main(String args[]){
      Node<Integer> head = inputLL();
      print(head);
    }
}
