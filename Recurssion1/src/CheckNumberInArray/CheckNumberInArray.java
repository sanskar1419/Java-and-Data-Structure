package CheckNumberInArray;
public class CheckNumberInArray {
    
    public static boolean checkNumber(int arr[] , int start_index , int target){
       if(start_index == arr.length){
        return false;
       }

       if(arr[start_index] == target){
        return true;
       }
       
       return checkNumber(arr, start_index + 1, target);

    }
    public static void main(String args[]){
       int arr[] = {1,2,3,4,5,6};
       int target = 10;
       System.out.println(checkNumber(arr, 0 , target));
    }
}
