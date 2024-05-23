public class ReversedString {
    public static String reverse(String str){
       String reversed_string = "";
       for(int i = 0 ; i<str.length() ; i++){
        reversed_string = str.charAt(i) + reversed_string;
       }
       return reversed_string;
    }
    public static void main(String args[]){
        String str = "It's a wonderful day";
        System.out.println(reverse(str));

    }
}
