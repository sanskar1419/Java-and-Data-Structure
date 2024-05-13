import java.util.Scanner;

public class MaximumNumber {

     public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        int max_number = Integer.MIN_VALUE;
        while(i<=1000){
          int temp = (n/(i*10)*i) + n%i ;
          i=i*10;
          if(temp>max_number){
            max_number =temp;
          } 
        }
        System.out.println(max_number);
        

        s.close();
    }
}
