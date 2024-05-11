import java.util.Scanner;

public class Palindrome {
     public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        
        int temp = num;
        int revNumber = 0;
    
        while(temp>0){
         int lastDigit = temp%10;
         revNumber = revNumber*10 +lastDigit;
         temp = temp/10;
        }

        if(revNumber == num){
            System.out.println("true");
        } else {
            System.out.println(false);
        }
       
        
        s.close();
    }
}
