public class SelectionSort {
    public static void selectionSort(int arr[]){
        int minIndex;
        for(int i = 0 ; i< arr.length - 1 ; i++){
            minIndex=i;
            for(int j = i+1 ; j<arr.length ; j++){
                if(arr[j]< arr[minIndex]){
                    minIndex = j;
                }
            }
          
           if(minIndex != i){
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
           }
            
        }
    }

    public static void PrintArray(int arr[]){
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " " );
        }
    }
    public static void main(String args[]){
        int arr[]={2,1,3,6,5,4,0};
        selectionSort(arr);
        PrintArray(arr);
    }
}
