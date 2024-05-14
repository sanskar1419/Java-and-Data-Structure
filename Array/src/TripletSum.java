import java.util.Scanner;

public class TripletSum {

    public static int Sum(int arr[],int x){
        int count = 0;
       for(int i = 0 ; i<arr.length-2 ; i++){
        for(int j = i+1 ; j< arr.length-1 ; j++){
           for(int k=j+1; k<arr.length; k++){
            if(arr[i]+arr[j]+arr[k] == x){
                count++;
             }
           }
        }
       }
        
     return count;
    }

   
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
       int arr1[] = {1, 2, 3, 4, 5, 6, 7 };
       int x = s.nextInt();
       System.out.println(Sum(arr1,x));
            
    }
}
