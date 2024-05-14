import java.util.Scanner;

public class Sort01 {

    public static void Sort(int arr[]){
       int oneIndex = 0;
       for(int i = 0; i< arr.length; i++){
        if(arr[i] == 0){
            int temp = arr[oneIndex];
            arr[oneIndex]= arr[i];
            arr[i]=temp;
            oneIndex++;
        }
       }
    }

    public static void PrintArray(int arr[]){
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " " );
        }
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
       int arr1[] = {0, 1, 1, 0, 1, 0, 1};
       Sort(arr1);
       PrintArray(arr1);
    }
}
