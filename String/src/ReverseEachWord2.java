public class ReverseEachWord2 {
   public static String remove_duplicate(String str1){
    String reversed_String = "";
    int start_index = 0 ;

    for(int i=0 ; i<str1.length() ; i++){
      if(str1.charAt(i) == ' '){
        int end_index = i-1;
        for(int j = end_index ; j>=start_index ; j--){
          reversed_String += str1.charAt(j);
        }

        reversed_String += ' ';
        start_index = i+1;
      }
    }

   for(int i = str1.length()-1 ; i>=start_index ; i--){
    reversed_String += str1.charAt(i);
   }
   

    return reversed_String;
   }
    public static void main(String args[]){
      String str1 = "the second test case is a collection of palindromes";
      System.out.println(remove_duplicate(str1));
    }
}
