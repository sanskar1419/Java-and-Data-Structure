import java.util.Scanner;

public class BinaryToDecimal {
     public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        int binaryNum = s.nextInt();
        
        int decimalNum = 0;
        int i = 0;

        while(binaryNum>0){
           int lastDigit = binaryNum%10;
           if(lastDigit == 1){
            decimalNum += Math.pow(2, i);
           }

           binaryNum /= 10;
           i++;
        }

        System.out.println(decimalNum);
        
        s.close();
    }
}
