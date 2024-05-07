import java.util.Scanner;

public class SumPattern {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i=1;

        while(i<=n){
          int sum = 0;
          int j = 1;
          while(j<=i)
          {
            sum = sum +j;
            System.out.print(j);
            if(i==j){
              System.out.print('=');
            } else {
              System.out.print('+');
            }
              j++;
          }

          System.out.print(sum);

          System.out.println();
          i++;
        }
        s.close();
    }
}
