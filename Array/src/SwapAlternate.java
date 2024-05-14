
public class SwapAlternate {

    public static void swap(int arr[]){
        // for(int i = 0, j=i+1; i<arr.length && j<arr.length ; i +=2, j+=2){
        //     int temp = arr[i];
        //     arr[i] = arr[j];
        //     arr[j] = temp;
        // }
        for(int i=0; i<arr.length ; i+=2){
            if(i+1 == arr.length){
                break;
            }
            int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
        }
    }

    public static void PrintArray(int arr[]){
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " " );
        }
    }
    public static void main(String args[]){
       int arr[] = {9,3,6,12,4};
       swap(arr);
       PrintArray(arr);
    }
}
