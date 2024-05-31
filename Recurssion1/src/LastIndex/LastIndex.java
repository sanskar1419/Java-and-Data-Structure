package LastIndex;
public class LastIndex {
    
    public static int checkNumber(int arr[] , int start_index , int target){
       if(start_index == arr.length){
        return -1;
       }
       
       int ans = checkNumber(arr, start_index + 1, target);
 
       if(ans != -1){
         return ans;
       }

       if(arr[start_index] == target){
         return start_index;
        } else {
         return -1;
        }

    }
    public static void main(String args[]){
       int arr[] = {9,8,10,8,5,6,8,10};
       int target = 8;
       System.out.println(checkNumber(arr, 0 , target));
    }
}
