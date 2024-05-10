import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int prev = 1, current = 1,temp;

        while(n-2>=0){
          temp  = prev + current;
           prev = current;
           current = temp;
           n--;
        }

        System.out.println(prev);
        s.close();
    }
}
