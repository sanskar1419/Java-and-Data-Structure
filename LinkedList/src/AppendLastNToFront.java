import java.util.Scanner;

public class AppendLastNToFront{
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
            tail.reference = currentNode;
            tail = tail.reference;
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
    public static int size(Node<Integer> head){
        int i=0;
        while(head != null){
            i++;
            head = head.reference;
        }
        return i;
    }
    public static Node<Integer> appendLastNToFirst(Node<Integer> head, int n) {
        if(head == null){
            return head;
        }
        int count = 0;
        Node<Integer> lastNode = head;
        while(lastNode.reference != null){
            count++;
            lastNode = lastNode.reference;
        }

        int size = count+1;

        if(n >= size)
        return head;

        Node<Integer> prevNode = head;
        count = 0;
        while(count < size - n - 1 && prevNode != null){
            count++;
            prevNode = prevNode.reference;
        }

        if(prevNode!=null){
            lastNode.reference = head;
            head = prevNode.reference;
            prevNode.reference = null;
        }
        return head;
	}
    public static void main(String arg[]){
        Node<Integer> head = inputLL();
        print(head);
       
        head = appendLastNToFirst(head, 0);
        print(head);

        
        // System.out.println(size(head));
    }
}