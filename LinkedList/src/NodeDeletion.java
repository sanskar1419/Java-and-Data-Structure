import java.util.Scanner;

public class NodeDeletion{
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
    public static Node<Integer> deleteNode(Node<Integer> head , int pos){
        if(head == null){
            return head;
        }
        
        if(pos == 0){
            head = head.reference;
            return head;
        } else {
            Node<Integer> prev = head;
            int count = 0;
            while(count<pos-1 && prev!=null){
                count++;
                prev = prev.reference;
            }
           if(prev == null || prev.reference == null){
            return head;
           }

           prev.reference = prev.reference.reference;
           return head;
        }
    }

    public static Node<Integer> insertNode2(Node<Integer> head , int index , int data){
        int count = 0;
        Node<Integer> nodeToInserted = new Node<Integer>(data);
        if(index == 0){
            nodeToInserted.reference = head;
            head = nodeToInserted;
        }else{
            Node<Integer> prev = head;
            while(count<index-1 && prev !=null){
                count++;
              prev = prev.reference;
             }
             
             if(prev!=null){
                nodeToInserted.reference = prev.reference;
                prev.reference = nodeToInserted;
             }

        }
        return head;
    }
    public static void main(String arg[]){
        Node<Integer> head = inputLL();
        print(head);
        // System.out.println("Node Deletion at the 0th index");
        // head = deleteNode(head,0);
        // print(head);
        // System.out.println("Node Deletion at the index other then first or last");
        // head = deleteNode(head,1);
        // print(head);
        System.out.println("Node Deletion at the last index");
        head = deleteNode(head,8);
        print(head);
       

        
        // System.out.println(size(head));
    }
}