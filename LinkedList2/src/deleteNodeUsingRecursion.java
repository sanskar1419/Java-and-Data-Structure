import java.util.Scanner;

public class deleteNodeUsingRecursion {
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

    public static Node<Integer> deleteNode(Node<Integer> head, int pos){
      if(head.next == null && pos>0){
        return head;
      }
      if(pos == 0){
        return head.next;
      } else {
        head.next = deleteNode(head.next, pos-1);
        return head;
      }

    }


    public static void main(String args[]){
      Node<Integer> head = inputLL();
      print(head);
      System.out.println();
      head = deleteNode(head, 4);
      print(head);
      System.out.println();
      // head = deleteNode(head, 2);
      // print(head);
      // System.out.println();
      // head = deleteNode(head, 100);
      // print(head);
      // System.out.println();
    }
}
