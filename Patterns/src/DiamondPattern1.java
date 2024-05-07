import java.util.Scanner;

public class DiamondPattern1 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int n1 = n/2 +1;
        int i = 1;
        while(i<=n1){
            int space = 1;
            while(space<=n1-i){
              System.out.print(" ");
              space++;
            }

            int j = 1;
            while(j<= 2*i-1){
                System.out.print('*');
                j++;
            }
            System.out.println();
            i++;
        }

        int n2 = n-n1;
        i = n2;
        while(i>0){
            int space = 1;
            while(space<=n2-i+1){
              System.out.print(" ");
              space++;
            }

            int j = 1;
            while(j<=2*i-1){
                System.out.print('*');
                j++;
            }
            System.out.println();
            i--;
        }
        
        s.close();
    }
}
