public class LinkedListUse {
    public static Node<Integer> createLinkedList(){
    Node<Integer> n1 = new Node<>(10);
    Node<Integer> n2 = new Node<>(20);
    Node<Integer> n3 = new Node<>(30);
    Node<Integer> n4 = new Node<>(40);
    Node<Integer> n5 = new Node<>(50);
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
    }
 public static void main(String args[]){
    Node<Integer> head = createLinkedList();
    print(head);
    // Node<Integer> n1 = new Node<>(10);
    // System.out.println(n1.data);
    // System.out.println(n1.reference);
 }
}
