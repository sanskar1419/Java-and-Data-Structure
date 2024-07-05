import java.util.Scanner;

public class PrintLLUsingRecursion {
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
              while(tail.next != null){
                tail = tail.next;
              }

              tail.next = currentNode;
            }
            data = s.nextInt();
        }
        return head;
    }
    
    public static void print(Node<Integer> head){
       if(head == null){
        return;
       }

       System.out.print(head.data + " ");
       print(head.next);
    }

    public static void printInReverseOrder(Node<Integer> head){
      if(head == null){
       return;
      }

      printInReverseOrder(head.next);
      System.out.print(head.data + " ");

   }


    public static void main(String args[]){
      Node<Integer> head = inputLL();
      print(head);
      System.out.println();
      printInReverseOrder(head);
    }
}
