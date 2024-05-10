import java.util.Scanner;

public class DecimalToBinary {
     public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        int decimalNum = s.nextInt();
        
        long binaryNum = 0;
        long pow = 1;

        while(decimalNum>0){
         int lastDigit = decimalNum%2;
         binaryNum = binaryNum + lastDigit*pow;
         pow = pow*10;
        decimalNum = decimalNum/2;
        }

        System.out.println(binaryNum);
       
        s.close();
    }
}
