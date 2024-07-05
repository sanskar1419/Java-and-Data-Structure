import java.util.Scanner;

public class mergeTwoSortedLL {
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
    public static int[] mergeArray(int arr1[] , int arr2[]){
      int m = arr1.length;
      int n = arr2.length;

      int result[] = new int[m+n];

      int i = 0 , j = 0, k = 0;

      while(i<m && j<n){
        if(arr1[i] >= arr2[j]){
          result[k] = arr2[j];
          j++;
          k++;
        } else {
          result[k] = arr1[i];
          i++;
          k++;
        }
      }

      while(i<m){
        result[k] = arr1[i];
        i++;
        k++;
      }

      while(j<n){
        result[k] = arr2[j];
        j++;
        k++;
      }

      return result;
    }

    public static void printArr(int arr[]){
      for(int i:arr){
        System.out.print(i + " ");
      }
      System.out.println();
    }

    public static Node<Integer> mergeLL(Node<Integer> head1 , Node<Integer> head2){
      if (head1==null)
      {
          return head2;
      }
      
      if (head2==null)
      {
          return head1;
      }
      Node<Integer> firstHead = head1;
      Node<Integer> secondHead = head2 , head = null, tail=null;

      while(firstHead!=null && secondHead!=null){
        if(firstHead.data <= secondHead.data){
          if(head == null){
            head = firstHead;
            tail= firstHead;
            firstHead = firstHead.next;
          } else {
          tail.next = firstHead;
          tail = firstHead;
          firstHead = firstHead.next;
          }
          
        } else {
          if(head == null){
            head = secondHead;
            tail= secondHead;
            secondHead = secondHead.next;
          } else {
            tail.next = secondHead;
            tail = secondHead;
            secondHead = secondHead.next;
          }
        }
      }

      if(firstHead!=null){
        tail.next = firstHead;
        
      }

      if(secondHead!=null){
        tail.next = secondHead;
        
      }

      return head;

    }

    public static void main(String args[]){
      Node<Integer> head1 = inputLL();
      Node<Integer> head2 = inputLL();

      Node<Integer> head = mergeLL(head1, head2);
      print(head);
      System.out.println();

      /* int arr1[] = {1,3,4};
      int arr2[] = {2,5,6};
      int result[] = mergeArray(arr1,arr2);
      printArr(result); */

      // Node<Integer> head = inputLL();
      // print(head);
      // System.out.println();
      // Node<Integer> mid = calculateMid(head);
      // System.out.println(mid.data + " " + mid.next);
    }
}
