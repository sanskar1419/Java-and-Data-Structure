import java.util.Scanner;

public class LargestElement {
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

    public static int ReturnLargestElement(int arr[]){
        int max_element = Integer.MIN_VALUE;
        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i]>max_element){
                max_element = arr[i];
            }
        }
        return max_element;
    }
    public static void main(String args[]){
       int arr[] = TakeInput();
       System.out.println(ReturnLargestElement(arr));
    }
}
