public class RotateArray {
    public static void Rotate(int arr[],int d){
       while(d>0){
        int key = arr[0];
        int i = 1;
        while(i<arr.length){
            arr[i-1] = arr[i];
            i++;  
        }
       
        arr[arr.length -1] = key;
        d--;
       }
    }

    public static void PrintArray(int arr[]){
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " " );
        }
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7};
        int d = 2;
        Rotate(arr,d);
        PrintArray(arr);
    }
}
