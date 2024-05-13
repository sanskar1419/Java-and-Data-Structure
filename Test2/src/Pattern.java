import java.util.Scanner;

public class Pattern {
     public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        while(i<=n){
            int j = 1;
            while(j<=n-i+1){
                System.out.print(j);
                j++;
            }
            int star = 1;
            while(star <= 2*(i-1)){
                System.out.print('*');
                star++;
            }

            int dec = n-i+1;
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
