import java.util.Scanner;

public class FibonacciMember {

    public static boolean MemberCheck(int num){
       if(num == 1 || num == 0){
        return true;
       }
       int prev = 1;
       int current = 1;
       while(current<=num){
        int temp = current+prev;
        prev = current;
        current = temp;
        if(current == num){
            return true;
        }
       }
       return false;
    }
     public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

       System.out.println(MemberCheck(n));


        s.close();
    }
}
