import java.util.Scanner;

public class Factors {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int i = 2;
        boolean isFactorExist = false;

        while(i<=num/2){
            if(num%i == 0){
                System.out.print(i+ " ");
                isFactorExist = true;
            }
            i++;
        }

        if(isFactorExist == false){
            System.out.print(-1);
        }
        s.close();
    }
}
