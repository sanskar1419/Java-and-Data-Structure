package PairSum;
public class FindDuplicate {
    public static int approach1(int arr[]){
        /* 
         Time Complexity: O(n)
         Space Complexity: O(1)
         For Input Size n
         */
       int arr_sum = 0;
       int sum = 0;
       // Find sum => (n-3) operations   
       for(int i = 1 ; i<= arr.length -2 ; i++){
        sum += i;
       }

       // Finding the array sum => m operation
       for(int i= 0 ; i<arr.length ; i++){
        arr_sum += arr[i];
       }
       return arr_sum - sum;
    }

    public static int approach2(int arr[]){
        /* 
         Time Complexity: O(n)
         Space Complexity: O(1)
         For Input Size n
         */
       int xor = 0;
       // Find sum => (n-3) operations   
       for(int i = 1 ; i<= arr.length -2 ; i++){
        xor ^= i;
       }

       // Finding the array sum => m operation
       for(int i= 0 ; i<arr.length ; i++){
        xor ^= arr[i];
       }
       return xor;
    }

    public static int approach3(int arr[]){
        /* 
         Time Complexity: O(nlog(n))
         Space Complexity: O(1)
         For Input Size n
         */
       // Sort the array using merge sort => nlogn operations
       // Find the element in which arr[i] == arr[i+1] => (n-1) operations   
       return 1;
    }

    public static int approach4(int arr[]){
        /* 
         Time Complexity: O(n2)
         Space Complexity: O(1)
         For Input Size n
         */
        for(int i=0 ; i< arr.length-1 ; i++){
            for(int j= i+1 ; j<arr.length ; j++){
                if(arr[i] == arr[j]){
                    return arr[i];
                }
            }
        }
       return -1;
    }
   
    public static void main(String args[]){
        int arr[]={0, 7, 2, 5, 4, 7, 1, 3, 6};
        System.out.println(approach1(arr));
        System.out.println(approach2(arr));
        System.out.println(approach4(arr));
    }
}
