import java.util.Scanner;

public class CheckAp {
     public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int firstTerm = s.nextInt();
        int secondTerm = s.nextInt();
        int diff = secondTerm-firstTerm;
        int count = 3, current;

        while(count<=n){
            current = s.nextInt();
            count++;
            if((current-secondTerm) != diff){
                System.out.println(false);
                s.close();
                return;
            }
            secondTerm = current;
        }
        System.out.println(true);

        s.close();
    }
}
