package SplitArray;

public class SplitArray {

   public static boolean splitArray(int arr[]){
     int sum = 0;
     for(int i = 0 ; i<arr.length ; i++){
      sum += arr[i];
     }

     if(sum % 2 == 0 ){
      return helper(arr,0,0,0);
     } else return false;
   }

   public static boolean helper(int arr[] , int start_index , int leftSum , int rightSum){

      if(start_index == arr.length)
      return leftSum == rightSum;

      if(arr[start_index] % 5 == 0){
         leftSum += arr[start_index];
      } else if(arr[start_index] %3 == 0){
         rightSum += arr[start_index];
      } else {
        return helper(arr, start_index+1, leftSum + arr[start_index], rightSum) || helper(arr, start_index+1, leftSum, rightSum + arr[start_index]);
      }

      return helper(arr, start_index + 1, leftSum, rightSum);
    }

    public static void main(String args[]){
      int arr[] = {1,4,3};
      System.out.println(splitArray(arr));

    }
}
