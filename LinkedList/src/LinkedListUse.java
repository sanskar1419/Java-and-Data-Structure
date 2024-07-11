public class LinkedListUse {
    public static Node<Integer> createLinkedList(){
    Node<Integer> n1 = new Node<>(10);
    Node<Integer> n2 = new Node<>(20);
    Node<Integer> n3 = new Node<>(30);
    Node<Integer> n4 = new Node<>(40);
    Node<Integer> n5 = new Node<>(-1);
    n1.next = n2;
    n2.next = n3;
    n3.next = n4;
    n4.next = n5;

    return n1;
    }

    public static void print(Node<Integer> head){
      // System.out.println(head.data);
      // System.out.println(head.next.data);
      // System.out.println(head.next.next.data);
      // System.out.println(head.next.next.next.data);
      // System.out.println(head.next.next.next.next.data);

      // Node<Integer> temp = head;
      // while(temp != null){
      //    System.out.print(temp.data + " ");
      //    temp = temp.next;
      // }

      while(head != null){
      System.out.print(head.data + " ");
      head = head.next;
      }

      System.out.println();

    }

    public static void increment(Node<Integer> head){
         Node<Integer> temp = head;

         while(temp != null){
            temp.data++;
            temp = temp.next;
         }
    }

    public static int size(Node<Integer> head){
      int i = 0;
      Node<Integer> temp = head;

      while(temp != null){
         i++;
         temp = temp.next;
      }

      return i;

     
    }
 public static void main(String args[]){
    Node<Integer> head = createLinkedList();
   //  increment(head);
   //  print(head);
   //  System.out.println(head);
    System.out.println("Size : "+size(head));
   //  System.out.println("Head : " + head );
   //  System.out.println("data : " + head.data );
   //  System.out.println("next : " + head.next );

   //  print(head);
    // Node<Integer> n1 = new Node<>(10);
    // System.out.println(n1.data);
    // System.out.println(n1.next);
 }
}
