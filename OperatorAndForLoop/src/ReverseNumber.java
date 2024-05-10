import java.util.Scanner;

public class ReverseNumber {
     public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        
        int revNumber = 0;
        while(n>0){
            int lastDigit = n%10;
            revNumber = revNumber*10 + lastDigit;
            n = n/10;
        }

        System.out.println(revNumber);
        
        s.close();
    }
}
