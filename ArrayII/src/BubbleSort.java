public class BubbleSort {
    public static void bubbleSort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            //In-1 Rounds
            
            for(int j=0;j<n-1-i;j++){
                
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
    
                }
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
        bubbleSort(arr);
        PrintArray(arr);
    }
}
