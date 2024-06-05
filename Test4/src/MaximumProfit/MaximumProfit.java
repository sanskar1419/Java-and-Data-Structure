package MaximumProfit;

import java.util.Arrays;

public class MaximumProfit {

   public static int maxProfit(int arr[]){
    Arrays.sort(arr);
    int max = 0 ;
    for(int i = 0 ; i < arr.length; i++){
       if(arr[i]*(arr.length-i) > max){
         max = arr[i]*(arr.length-i);
       }
    }
    return max;
   }

   public static int maxProfit2(int arr[]){
      Arrays.sort(arr);
      return calculateMax(arr, 0);
     }

     public static int calculateMax(int arr[] , int idx){
      int n = arr.length;
      if(idx >= n){
         return 0;
      }

      return Math.max(arr[idx]*(n-idx), calculateMax(arr, idx+1));
    }

    public static void main(String args[]){
      int arr[] = {14,20,30,53};
      System.out.println(maxProfit(arr));
      System.out.println(maxProfit2(arr));

    }
}
