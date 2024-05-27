package LeaderInArray;
public class LeaderInArray {
    public static void approach1(int arr[]){
        /* 
         Time Complexity: O(n^2)
         Space Complexity: O(1)
         For Input Size n
         */
        int n = arr.length;
        System.out.print(arr[n-1] + " ");
        for(int i = n-2 ; i>=0 ; i--){
            int elementAtStart = arr[i];
            boolean isLeader = true;
           for(int j = i+1 ; j< n ; j++){
            if(arr[j] > elementAtStart){
                isLeader = false;
               break;
            }
           }
           if(isLeader == true){
            System.out.print(elementAtStart + " ");
           }
        }
    }

    public static void approach2(int arr[]){
        /* 
         Time Complexity: O(n)
         Space Complexity: O(1)
         For Input Size n
         */
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for(int i = n-1 ; i>=0 ; i--){
           if(arr[i] >= max){
            System.out.print(arr[i] + " ");
            max = arr[i];
           }
        }
    }
   
    public static void main(String args[]){
        int arr[]={3,12,34,2,0,-1};
        int arr1[]={13,17,5,4,6};
        approach1(arr);
        System.out.println();
        approach2(arr1);
    }
}
