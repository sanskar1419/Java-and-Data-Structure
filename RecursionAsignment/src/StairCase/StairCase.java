package StairCase;
public class StairCase {
    public static int staircase(int n){
       if(n == 0){
        return 1;
       } 

       if(n<1){
        return 0;
       }

       return (staircase(n-1) + staircase(n-2) + staircase(n-3));
    }

   
    
    public static void main(String args[]){
        System.out.println(staircase(4));
    }
}
