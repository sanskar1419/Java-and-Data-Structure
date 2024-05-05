import java.util.Scanner;

public class loops {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int i =1;
        int j = num;

        System.out.println("Increasing Order : ");
        while(i<=num){
            System.out.println(i);
            i++;
        }

        System.out.println("Decreasing Order : ");
        while(j>=0){
            System.out.println(j);
            j--;
        }
        s.close();
    }
}
