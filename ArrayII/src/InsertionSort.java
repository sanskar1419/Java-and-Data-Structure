public class InsertionSort {
    public static void insertionSort(int arr[]){
        int n=arr.length;
        for(int i=1;i<n;i++){
          int j = i-1;
          int key = arr[i];
          while(j>=0 && arr[j]>key){
            arr[j+1] = arr[j];
            j--;
          }

          arr[j+1] = key;
           
        }
    }

    public static void PrintArray(int arr[]){
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " " );
        }
    }
    public static void main(String args[]){
        int arr[]={2,1,3,6,5,4,0};
        insertionSort(arr);
        PrintArray(arr);
    }
}
