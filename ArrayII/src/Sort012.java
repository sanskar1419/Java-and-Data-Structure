public class Sort012 {
    public static void Sort(int arr[]){
       int i = 0;
       int nextOne = 0;
       int nextTwo = arr.length -1;
       while(i<=nextTwo){
        if(arr[i] == 0){
            int temp = arr[i];
            arr[i] = arr[nextOne];
            arr[nextOne] = temp;
            nextOne++;
            i++;
        } else if(arr[i] == 2){
            int temp = arr[i];
            arr[i] = arr[nextTwo];
            arr[nextTwo] = temp;
            nextTwo--;
        } else{
            i++;
        }
       }
    }

    public static void PrintArray(int arr[]){
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " " );
        }
    }
    public static void main(String args[]){
        int arr[]={0,1,2,0,2,0,1};
        Sort(arr);
        PrintArray(arr);
    }
}
