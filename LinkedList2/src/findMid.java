import java.util.Scanner;

public class findMid {
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

    public static Node<Integer> calculateMid(Node<Integer> head){
      if(head == null || head.next == null){
        return head;
      }
      Node<Integer> slow = head , fast = head ;
      while(fast.next != null && fast.next.next != null){
        slow = slow.next;
        fast = fast.next.next;
      }

      return slow;
    }


    public static void main(String args[]){
      Node<Integer> head = inputLL();
      print(head);
      System.out.println();
      Node<Integer> mid = calculateMid(head);
      System.out.println(mid.data + " " + mid.next);
    }
}
