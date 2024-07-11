import java.util.Scanner;

public class RemoveDuplicates{
    public static Node<Integer> inputLL(){
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        Node<Integer> head=null, tail=null;

        while(data != -1){
            Node<Integer> currentNode = new Node<Integer>(data);
          if(head == null){
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
    public static void print(Node<Integer> head){
        Node<Integer> temp = head;

        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }
    public static int size(Node<Integer> head){
        int i=0;
        while(head != null){
            i++;
            head = head.next;
        }
        return i;
    }

    public static Node<Integer> removeDuplicates(Node<Integer> head) {
        if(head == null  || head.next==null){
            return head;
        }
        Node<Integer> slow = head;
        Node<Integer> fast = head.next;
        while(fast != null){
            if(!(fast.data).equals(slow.data) ){
               slow.next = fast;
               slow = fast;
            }
            fast = fast.next;
        }
       
            slow.next = fast;
      
        return head;
	}
  
    public static void main(String arg[]){
        Node<Integer> head = inputLL();
        print(head);
        head = removeDuplicates(head);
        print(head);
    }
}

