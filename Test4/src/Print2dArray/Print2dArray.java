package Print2dArray;
public class Print2dArray {

   public static void print(int arr2d[][] ,int i, int n){
      while(n>0){
         for(int j = 0 ; j< arr2d[0].length ; j++){
            System.out.print(arr2d[i][j] + " ");
         }
         System.out.println();
         n--;
      }
   }
    
    public static void printArray(int arr2d[][]){
     int n = arr2d.length;
     int m = arr2d[0].length;

     for(int i = 0 ; i<n ; i++){
      print(arr2d, i, n-i);
     }

    }
    public static void main(String args[]){
       int arr2d[][] = {{1,2,3},{4,5,6},{7,8,9}};
       printArray(arr2d);
    }
}
