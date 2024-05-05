import java.util.Scanner;

public class EvenAndOddSum {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int oddSum = 0;
        int evenSum = 0;
        
        while(num != 0){
            int reminder = num%10;
            if(reminder % 2 == 0){
                evenSum += reminder;
            } else {
                oddSum += reminder;
            }
            num = num/10;
        }

        System.out.println(evenSum + " " + oddSum);
        s.close();
    }
}
