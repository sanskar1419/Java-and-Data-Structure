public class ReversedWordWise {
   public static String reversed_string(String str){
    String rev_String = "";
    int start_index = 0;
   
    for(int i = 0 ; i< str.length() ; i++){
      if(str.charAt(i) == ' '){
        int end_index = i-1;
        rev_String = str.substring(start_index, end_index+1) + rev_String;

        rev_String = ' ' + rev_String;
        start_index = i + 1;
      }
    }

    rev_String = str.substring(start_index, str.length()) + rev_String;

    return rev_String;
   }
    public static void main(String args[]){
      String str = "Welcome to Coding Ninjas";
      System.out.println(reversed_string(str));
    }
}
