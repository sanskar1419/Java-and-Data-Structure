import java.util.Scanner;

public class PrimeCheck {

    public static boolean isPrime(int num){
       int i = 2;
       while(i<=Math.sqrt(num)){
        if(num%i == 0){
            return false;
        }
        i++;
       }
       return true;
    }
     public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

       System.out.println(isPrime(n));


        s.close();
    }
}
