import java.util.Scanner;

public class SumOfNaturalNumber {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int sum = 0;
        int i = 1;

        while(i<=num){
            sum += i;
            i++;
        }

        System.out.println(sum);
        s.close();
    }
}
