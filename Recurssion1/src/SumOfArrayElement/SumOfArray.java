package SumOfArrayElement;
public class SumOfArray {
    
    public static int sum(int arr[] , int start_index){
        if(start_index == arr.length - 1)
        return arr[start_index];

        return arr[start_index] + sum(arr, start_index+1);
    }
    public static void main(String args[]){
       int arr[] = {1,2,3,4,5,6};
       System.out.println(sum(arr, 0));
    }
}
