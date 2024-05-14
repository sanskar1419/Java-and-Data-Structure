
public class FindDuplicate {

    public static int Duplicate(int arr[]){
        for(int i=0; i<arr.length-1 ; i++){
           for(int j = i+1; j<arr.length ; j++ ){
            if(arr[i] == arr[j]){
                return arr[i];
            }
           }
        }
        
        return -1;
    }

   
    public static void main(String args[]){
       int arr[] = {2,3,1,6,3,6,2};
       System.out.println(Duplicate(arr));
     
    }
}
