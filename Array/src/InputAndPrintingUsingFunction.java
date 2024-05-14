import java.util.Scanner;

public class InputAndPrintingUsingFunction {
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

    public static void PrintArray(int arr[]){
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " " );
        }
    }
    public static void main(String args[]){
       int arr[] = TakeInput();
       PrintArray(arr);
    }
}
