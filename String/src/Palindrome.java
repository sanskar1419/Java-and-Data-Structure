public class Palindrome {
    public static String reverse(String str){
       String reversed_string = "";
       for(int i = 0 ; i<str.length() ; i++){
        reversed_string = str.charAt(i) + reversed_string;
       }
       return reversed_string;
    }

    public static boolean isPalindrome(String str){
        int i = 0;
        int j = str.length() - 1;
        while(i<=j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String args[]){
        String str = "abcba";
        // Approach 1
        /* String reversed_string = reverse(str);
        System.out.println(str.equals(reversed_string)); */

        // Approach 2
        System.out.println(isPalindrome(str));
    }
}
