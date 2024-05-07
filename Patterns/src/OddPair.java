import java.util.Scanner;

public class OddPair {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i=1;

        while(i<=n){
          int j =1;
          int p = 2*i - 1;
          while(j<=n-i+1){
            System.out.print(p);
            j++;
            p += 2;
          }

          j= 1;
          p=1;
          while(j<=i-1){
            System.out.print(p);
            p += 2;
            j++;
          }

          System.out.println();
          i++;
        }
        s.close();
    }
}
