import java.util.Scanner;

public class BasicInput {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        char str = s.next().charAt(0);
        String str2 = s.next();
        String str3 = s.nextLine();
        
        System.out.println("Str1 : " + str);
        System.out.println("Str2 : " + str2);
        System.out.println("Str3 : " + str3);
        s.close();
    }
}
