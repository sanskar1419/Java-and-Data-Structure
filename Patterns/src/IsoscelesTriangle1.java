import java.util.Scanner;

public class IsoscelesTriangle1 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i=1;

        while(i<=n){
            // Printing Spaces
            int space = 1;
            while(space<=n-i){
                System.out.print(" ");
                space++;
            }

            int star = 1;
            while(star<=i){
                System.out.print(star);
                star++;
            }

            int dec=i-1;
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
