import java.util.Scanner;

public class reverseLLUsingRecursion {
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

    public static Node<Integer> reverseLL(Node<Integer> head){
      if(head == null || head.next == null){
        return head;
      }

      Node<Integer> reversedHead = reverseLL(head.next);
      Node<Integer> tail = reversedHead;
      while(tail.next != null){
        tail = tail.next;
      }
      tail.next = head;
      head.next = null;
      return reversedHead;
    }

    public static Node<Integer> reverseLLOptimized(Node<Integer> head){
      Pairs result = optimizedWay(head);
      return result.head;
    }

    public static Pairs optimizedWay(Node<Integer> head){
      if(head == null || head.next == null){
        Pairs values = new Pairs(head,head);
        return values;
      }

      Pairs smallHeadPair = optimizedWay(head.next);
      smallHeadPair.tail.next = head;
      head.next = null;
      smallHeadPair.tail = head;
      return smallHeadPair;
    }

    public static Node<Integer> bestWay(Node<Integer> head){
      if(head == null || head.next == null){
        return head;
      }

      Node<Integer> smallHead = bestWay(head.next);
      Node<Integer> tail = head.next;

      tail.next = head;
      head.next = null;
      return smallHead;
    }
    public static void main(String args[]){
      Node<Integer> head = inputLL();
      print(head);
      System.out.println();
      head = bestWay(head);
      print(head);
    }
}
