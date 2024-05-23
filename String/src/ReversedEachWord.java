public class ReversedEachWord {
   public static String reversed_string(String str){
    String rev_String = "";
    int start_index = 0;
   
    for(int i = 0 ; i< str.length() ; i++){
      if(str.charAt(i) == ' '){
        int end_index = i-1;
        for(int j = end_index ; j>= start_index ; j--){
          rev_String += str.charAt(j);
        }

        rev_String += ' ';
        start_index = i + 1;
      }
    }

    for(int i = start_index ; i< str.length() ; i++){
      rev_String += str.charAt(i);
    }

    return rev_String;
   }
    public static void main(String args[]){
      String str = "abc def ghi";
      System.out.println(reversed_string(str));
    }
}
