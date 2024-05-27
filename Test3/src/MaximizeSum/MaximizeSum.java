package MaximizeSum;
public class MaximizeSum {
    public static int approach1(int arr1[], int arr2[]){
        /* 
         Time Complexity: O(n^2)
         Space Complexity: O(1)
         For Input Size n
         */
       int m = arr1.length;
       int n = arr2.length;

       int i = 0;
       int j = 0;

       int maxSum = 0;
       int arr1Sum = 0;
       int arr2Sum = 0;

       while(i<m && j<n){
        if(arr1[i] < arr2[j]){
         arr1Sum += arr1[i++];
        } else if(arr1[i]>arr2[j]){
            arr2Sum += arr2[j++];
        } else {
            maxSum += Math.max(arr1Sum, arr2Sum);
            arr1Sum = 0;
            arr2Sum = 0;
            while(i<m && j<n && arr1[i] == arr2[j]){
                maxSum += arr1[i++];
                j++;
            }
        }
       }


       while(i < m){
        maxSum += arr1[i++];
       }

       while(j < n){
        maxSum += arr2[j++];
       }

       return maxSum;
    }

    public static void main(String args[]){
        int arr1[] = {1, 5, 10, 15, 20, 25};
        int arr2[] = {2, 4, 5, 9, 15};
        System.out.println(approach1(arr1, arr2));;
        
    }
}
