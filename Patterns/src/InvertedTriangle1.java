import java.util.Scanner;

public class InvertedTriangle1 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i=1;

        while(i<=n){
          int star = 1;
          while(star <= n-i+1){
            System.out.print('*');
            star++;
          }
            System.out.println();
            i++;
        }
        s.close();
    }
}
