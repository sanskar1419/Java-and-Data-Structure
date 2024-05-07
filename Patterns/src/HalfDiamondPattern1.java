import java.util.Scanner;

public class HalfDiamondPattern1 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println('*');
        if(n != 0){
             int rows = 2*n -1;;
        int n1 = rows/2 +1;
        int i = 1;
        while(i<=n1){
            System.out.print('*');
            int inc = 1;
            while(inc<=i){
                System.out.print(inc);
                inc++;
            }
            int dec = i-1;
            while(dec>0){
                System.out.print(dec);
                dec--;
            }
            System.out.print('*');
            System.out.println();
            i++;
        }

        int n2 = rows-n1;
        i=n2;
        while(i>0){
            System.out.print('*');
            int inc = 1;
            while(inc<=i){
                System.out.print(inc);
                inc++;
            }
            int dec = i-1;
            while(dec>0){
                System.out.print(dec);
                dec--;
            }
            System.out.print('*');
            System.out.println();
            i--;
        }
        }
        System.out.println('*');
        
        s.close();
    }
}
