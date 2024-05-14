import java.util.Scanner;

public class PopulateArray {
    public static int[] ArrangeArray(int n){
        int arr[] = new int[n];
        int num = 1;
        for(int i =0 , j = n-1 ; num<=n ; i++,j--){
            arr[i] = num;
            num++;
           if(i!=j){
            arr[j] = num;
           }
           num++;

        }        
        return arr;
    }

    public static void PrintArray(int arr[]){
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " " );
        }
    }
    
    public static void main(String args[]){
       Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       int arr[] = ArrangeArray(n);
       PrintArray(arr);
       
    }
}
