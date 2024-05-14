import java.util.Scanner;

public class SearchElement {
    public static int[] TakeInput(){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
 
        //    Taking Input
        for(int i = 0 ; i<n ; i++){
            arr[i]=s.nextInt();
        }
        return arr;
    }

    public static int ReturnElementIndex(int arr[], int x){
        int elementIndex = -1;
        for(int i = 0 ; i< arr.length ; i++){
           if(arr[i] == x){
             elementIndex = i;
             break;
           }
        }
        return elementIndex;
    }
    public static void main(String args[]){
       Scanner s = new Scanner(System.in);
       int arr[] = TakeInput();
       int x = s.nextInt();
       
       System.out.println(ReturnElementIndex(arr,x));
    }
}
