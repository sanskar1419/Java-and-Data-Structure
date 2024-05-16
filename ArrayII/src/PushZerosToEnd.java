public class PushZerosToEnd {
    public static void Sort(int arr[]){
        int n=arr.length;
        int j = 0;
        for(int i=0;i<n-1;i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }

    public static void PrintArray(int arr[]){
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " " );
        }
    }
    public static void main(String args[]){
        int arr[]={2,0,0,1,3,0,0};
        Sort(arr);
        PrintArray(arr);
    }
}
