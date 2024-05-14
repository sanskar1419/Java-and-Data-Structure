import java.util.Scanner;

public class PairSum {

    public static int Sum(int arr[],int x){
        int count = 0;
       for(int i = 0 ; i<arr.length-1 ; i++){
        for(int j = i+1 ; j< arr.length ; j++){
            if(arr[i]+arr[j] == x){
               count++;
            }
        }
       }
        
     return count;
    }

   
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
       int arr1[] = {1, 3, 6, 2, 5, 4, 3, 2, 4};
       int x = s.nextInt();
       System.out.println(Sum(arr1,x));
            
    }
}
