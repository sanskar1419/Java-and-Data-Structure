import java.util.Scanner;

public class SumOfTwoNumber {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        System.out.println("The Sum of a and b is : " + (a+b));
        s.close();
    }
}
