import java.util.Scanner;

public class ReturningSumOfArray {
    public static int[] TakeInput(){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
 
        //    Taking Input
        for(int i = 0 ; i<n ; i++){
            arr[i]=s.nextInt();
        }
        s.close();
        return arr;
    }

    public static int ReturnSum(int arr[]){
        int sum = 0;
        for(int i = 0 ; i<arr.length ; i++){
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String args[]){
       Scanner s = new Scanner(System.in);
       int t = s.nextInt();
       int arr[];
       while(t>0){
        arr = TakeInput();
        System.out.println(ReturnSum(arr));
        t--;
       }
    }
}
