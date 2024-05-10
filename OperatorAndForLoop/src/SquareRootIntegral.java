import java.util.Scanner;

public class SquareRootIntegral {
     public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        int num = s.nextInt();
        int output = 0;

        while(output*output <= num){
            output++;
        }

        System.out.println(output-1);
       
        s.close();
    }
}
