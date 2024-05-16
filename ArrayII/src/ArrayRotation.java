public class ArrayRotation {
    public static int checkRotation(int arr[]){
       int i = 0;
       int min = Integer.MAX_VALUE;
       int minIndex = 0;
       while(i<arr.length){
        if(arr[i]<min){
           min = arr[i];
           minIndex = i;
        }
        i++;
       }
       return minIndex;
    }

    public static void PrintArray(int arr[]){
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " " );
        }
    }
    public static void main(String args[]){
        int arr[]={5,6,1,2,3,4};
        System.out.println(checkRotation(arr));
    }
}
