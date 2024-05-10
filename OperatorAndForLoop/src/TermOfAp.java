import java.util.Scanner;

public class TermOfAp {
     public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        
        int i=1;
        while(n>0){
            if((3*i + 2) % 4 == 0 ){
              i++;
              continue;
            } else {
                System.out.print((3*i + 2) + " ");
                i++;
                n--;
            }
        }
        
        s.close();
    }
}
