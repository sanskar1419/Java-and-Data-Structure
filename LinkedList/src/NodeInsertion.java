import java.util.Scanner;

public class NodeInsertion{
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
    public static Node<Integer> insertNode(Node<Integer> head , int index , int data){
        Node<Integer> nodeToAdd  = new Node<Integer>(data);
        int n = size(head);
        if(index > n)
        return head;

        if(index == 0){
            nodeToAdd.next = head;
            head = nodeToAdd;
        } else if(index == n){
          Node<Integer> temp = head;
          while(temp.next != null){
            temp = temp.next;
          }
          temp.next = nodeToAdd;
        } else{
            int j = 0;
            Node<Integer> temp = head;
            Node<Integer> firstNode = null , secondNode=null;
            while(temp!=null){
                if(j == index-1){
                    firstNode = temp;
                    secondNode = temp.next;
                    break;
                }
                j++;
                temp=temp.next;
            } 

            nodeToAdd.next = secondNode;
            firstNode.next = nodeToAdd;
        }
        return head;
    }

    public static Node<Integer> insertNode2(Node<Integer> head , int index , int data){
        int count = 0;
        Node<Integer> nodeToInserted = new Node<Integer>(data);
        if(index == 0){
            nodeToInserted.next = head;
            head = nodeToInserted;
        }else{
            Node<Integer> prev = head;
            while(count<index-1 && prev !=null){
                count++;
              prev = prev.next;
             }
             
             if(prev!=null){
                nodeToInserted.next = prev.next;
                prev.next = nodeToInserted;
             }

        }
        return head;
    }
    public static void main(String arg[]){
        Node<Integer> head = inputLL();
        print(head);
        System.out.println("Node Insertion at the 0th index");
        head = insertNode2(head,0 , 100);
        print(head);
        System.out.println("Node Insertion at the index other then first or last");
        head = insertNode2(head,3 , 80);
        print(head);
        System.out.println("Node Insertion at the last index");
        head = insertNode2(head,size(head)-1 , 99);
        print(head);
        // System.out.println(size(head));
    }
}