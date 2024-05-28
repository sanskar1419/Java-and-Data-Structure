package MaximumSubArraySum;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSubArraySum {
    public static int approach1(int arr[] ,int k , int n){
        int max_sum = 0;
        int current_sum = 0;

        for(int i = 0 ; i<k ; i++){
            current_sum += arr[i];
        }

        max_sum = current_sum;

        for(int i = k ; i< n ; i++){
            current_sum = current_sum - arr[i-k] + arr[i];
            if(current_sum > max_sum){
                max_sum = current_sum;
            }
        }
        

        return max_sum;
    }

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
       int arr[] = new int[n];

       for(int i = 0 ; i< n ; i++){
        arr[i] = s.nextInt();
       }
       System.out.println(approach1(arr , k , n));
    }
}
