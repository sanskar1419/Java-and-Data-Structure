public class LinkedListUse {
    public static Node<Integer> createLinkedList(){
    Node<Integer> n1 = new Node<>(10);
    Node<Integer> n2 = new Node<>(20);
    Node<Integer> n3 = new Node<>(30);
    Node<Integer> n4 = new Node<>(40);
    Node<Integer> n5 = new Node<>(-1);
    n1.reference = n2;
    n2.reference = n3;
    n3.reference = n4;
    n4.reference = n5;

    return n1;
    }

    public static void print(Node<Integer> head){
      // System.out.println(head.data);
      // System.out.println(head.reference.data);
      // System.out.println(head.reference.reference.data);
      // System.out.println(head.reference.reference.reference.data);
      // System.out.println(head.reference.reference.reference.reference.data);

      // Node<Integer> temp = head;
      // while(temp != null){
      //    System.out.print(temp.data + " ");
      //    temp = temp.reference;
      // }

      while(head != null){
      System.out.print(head.data + " ");
      head = head.reference;
      }

      System.out.println();

    }

    public static void increment(Node<Integer> head){
         Node<Integer> temp = head;

         while(temp != null){
            temp.data++;
            temp = temp.reference;
         }
    }

    public static int size(Node<Integer> head){
      int i = 0;
      Node<Integer> temp = head;

      while(temp != null){
         i++;
         temp = temp.reference;
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
   //  System.out.println("reference : " + head.reference );

   //  print(head);
    // Node<Integer> n1 = new Node<>(10);
    // System.out.println(n1.data);
    // System.out.println(n1.reference);
 }
}
