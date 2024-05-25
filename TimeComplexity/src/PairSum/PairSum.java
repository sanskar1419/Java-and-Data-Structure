package PairSum;

import java.util.Arrays;

public class PairSum {
    public static int approach1(int arr[],int x){
        /* 
         Time Complexity: O(n*log(n))
         Space Complexity: O(1)
         For Input Size n
         */ 
         Arrays.sort(arr);
        
         int start_index = 0;
         int end_index = arr.length - 1;
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
        int arr[]={1,3,6,2,5,4,3,2,4};
        int x = 7;
        System.out.println(approach1(arr,x));
      
    }
}
