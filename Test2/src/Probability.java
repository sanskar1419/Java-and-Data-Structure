import java.util.Scanner;

public class Probability {
    public static int factorial(int n){
      int fact = 1;
      int i =2;
      while(i<=n){
        fact=fact*i;
        i++;
      }
      return fact;
    }

    public static double ncr(int n , int r){
        double result = factorial(n)/(factorial(r)*factorial(n-r));
        return result;
    }

     public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int x = s.nextInt();

        double probability = (ncr(4, x)*ncr(4, n-x))/ncr(8, n);
        System.out.println((int)(probability*100));
        

        s.close();
    }
}
