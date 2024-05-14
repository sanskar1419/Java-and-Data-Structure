
public class FindUnique {

    public static int ReturnUnique(int arr[]){
        int result = 0;
        for(int i=0; i<arr.length ; i++){
            result = result ^ arr[i];
        }
        
        return result;
    }

   
    public static void main(String args[]){
       int arr[] = {2,3,1,6,3,6,2};
       System.out.println(ReturnUnique(arr));
     
    }
}
