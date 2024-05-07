import java.util.Scanner;

public class IsoscelesTriangle3 {
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
                System.out.print(i+star-1);
                star++;
            }

            int dec=i-1;
            int decValue = 2*(i-1);
            while(dec>0){
                System.out.print(decValue);
                dec--;
                decValue--;
            }
            
            System.out.println();
            i++;
        }
        s.close();
    }
}
