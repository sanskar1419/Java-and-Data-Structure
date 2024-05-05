import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int base = s.nextInt();
        int power = s.nextInt();
        int result = 1;

        while(power != 0){
            result = result * base;
            power--;
        }

        System.out.println(result);

        s.close();
    }
}
