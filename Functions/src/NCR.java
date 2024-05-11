import java.util.Scanner;

public class NCR {

    public static int factorial(int num){
        int fact = 1;
        int i = 2;
        while(i<=num){
            fact *= i;
            i++;
        }
        return fact;
    }
     public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
       int r = s.nextInt();

       int combination = factorial(n) / (factorial(r)*factorial(n-r));
       System.out.println(combination);


        s.close();
    }
}
