public class IsArraySorted {
    public static void isSorted(int arr[] , int start_index){
     if(start_index == arr.length - 1){
        System.out.println("true");
        return;
     }

     if(arr[start_index]<=arr[start_index+1]){
       isSorted(arr, start_index+1);
     } else {
        System.out.println("false");
     }
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,6};
        int arr1[] = {1,2,3,7,5,6};
        isSorted(arr , 0);
        isSorted(arr1 , 0);
        // System.out.println(isSorted(arr , arr.length - 1));
        // System.out.println(isSorted(arr1 , arr1.length - 1));

    }
}
