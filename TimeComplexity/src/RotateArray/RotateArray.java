package RotateArray;
public class RotateArray {
    public static void approach1(int arr[], int d){
        /* 
         Time Complexity: O(n^2)
         Space Complexity: O(1)
         For Input Size n
         */
      if(d == arr.length){
        return;
      }

      while(d>0){
        int temp = arr[0];
        for(int i = 1 ; i< arr.length ; i++){
            arr[i-1] = arr[i];
        }

        arr[arr.length - 1] = temp;
        d--;
      }
    }

    public static void approach2(int arr[] , int d){
        /* 
         Time Complexity: O(n)
         Space Complexity: O(1)
         For Input Size n
         */
       int tempArr[] = new int[d];
    
       for(int i = 0 ; i< d ; i++){
        tempArr[i] = arr[i];
       }

       for(int i = d ; i<arr.length ; i++){
        arr[i-d] = arr[i];
       }

       for(int i = arr.length - d, j=0 ; i<arr.length ; i++,j++){
          arr[i] = tempArr[j];
       }
    }

    public static void approach3(int arr[] , int d){
        /* 
         Time Complexity: O(n)
         Space Complexity: O(1)
         For Input Size n
         */
       ReverseArr(arr, 0, arr.length-1);
       ReverseArr(arr, 0, arr.length-1-d);
       ReverseArr(arr, arr.length-d, arr.length-1);
    }

    public static void ReverseArr(int arr[] , int start, int end){
        while(start<end){
            arr[start] ^= arr[end];
            arr[end] ^= arr[start];
            arr[start] ^= arr[end];
            start++;
            end--;
        }
    }

    public static void PrintArray(int arr[]){
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
   
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7};
        int d = 2;
        approach3(arr,d);
        PrintArray(arr);
        // System.out.println();
        // System.out.println(approach2(arr));
        // System.out.println(approach4(arr));
    }
}
