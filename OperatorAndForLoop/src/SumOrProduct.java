import java.util.Scanner;

public class SumOrProduct {
     public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int choice = s.nextInt();
       

        switch(choice){
            case 1 :
            int sum = 0; 
            for(int i= 1 ; i<=n ; i++){
                sum += i;
            }
            System.out.println(sum);
            break;

            case 2 : 
            int product = 1; 
            for(int i= 1 ; i<=n ; i++){
                product *= i;
            }
            System.out.println(product);
            break;

            default :
            System.out.println(-1);

        }
        
        s.close();
    }
}
