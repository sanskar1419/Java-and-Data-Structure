import java.util.Scanner;

public class Pattern {
     public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
       int i = 1;
       while(i<=n){
        int j = 1;
        while(j <= n-i){
            System.out.print(n-j+1);
            j++;
        }

        System.out.print('*');

        int dec = i-1;
        while(dec>0){
            System.out.print(dec);
            dec--;
        }

        System.out.println();
        i++;
       }

        s.close();
    }
}
