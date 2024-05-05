import java.util.Scanner;

public class PrimeCheck {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int i = 2;

        while(i<= Math.sqrt(num)){
            if(num % i == 0){
                System.out.println(num + " is not a prime number.");
                s.close();
                return;
            }
            i++;
        }
        System.out.println(num + " is a prime number.");
        s.close();
    }
}
