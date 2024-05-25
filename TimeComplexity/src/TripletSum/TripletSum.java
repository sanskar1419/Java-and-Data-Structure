package TripletSum;

import java.util.Arrays;

public class TripletSum {
    public static int approach1(int arr[],int x){
        /* 
         Time Complexity: O(n^2)
         Space Complexity: O(1)
         For Input Size n
         */ 
         Arrays.sort(arr);
         int n = arr.length;
         int tripletSum = 0;

         for(int i = 0; i < n-2 ; i++){
           int pairSumFor = x-arr[i];
           int numPair = pairSum(arr, pairSumFor, i+1, n-1);
          //  System.out.println("Num Pairs : " + numPair);
           tripletSum += numPair;
         }

         return tripletSum;
       }

       public static int pairSum(int arr[],int x, int start_index, int end_index){
     
         int numPair = 0;

         while(start_index < end_index){
          if(arr[start_index] + arr[end_index] < x){
            start_index++;
          } else if(arr[start_index] + arr[end_index] > x){
            end_index--;
          } else {
             int elementAtStart = arr[start_index];
             int elementAtEnd = arr[end_index];

            //  Edge Case
            if(elementAtStart == elementAtEnd){
                int totalElementFromStartToEnd = end_index-start_index + 1;
                numPair += (totalElementFromStartToEnd*( totalElementFromStartToEnd-1))/2;
                return numPair;
            }

             int tempStartIndex = start_index + 1;
             int tempEndIndex = end_index - 1;

             while(tempStartIndex<=tempEndIndex && arr[tempStartIndex] ==  elementAtStart){
              tempStartIndex++;
             }

             while(tempEndIndex>=tempStartIndex && arr[tempEndIndex] == elementAtEnd){
                tempEndIndex--;
             }

             int totalElementFromStart = tempStartIndex-start_index;
             int totalElementFromEnd = end_index - tempEndIndex;

             numPair += totalElementFromStart*totalElementFromEnd;
             start_index = tempStartIndex;
             end_index = tempEndIndex;
          }
         }
         return numPair;
       }
   
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7};
        int x = 12;
        System.out.println(approach1(arr,x));
      
    }
}
