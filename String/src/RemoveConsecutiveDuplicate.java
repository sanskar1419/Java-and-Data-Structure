public class RemoveConsecutiveDuplicate {
   public static String remove_duplicate(String str1){
    String result_string = "";
    char ch = str1.charAt(0);
     result_string = result_string + ch;
    for(int i = 0 ; i< str1.length() ; i++){
      if(str1.charAt(i) != ch){
        ch = str1.charAt(i);
        result_string = result_string + ch;
      }
    }

    return result_string;
   }
    public static void main(String args[]){
      String str1 = "aaaaa";
      System.out.println(remove_duplicate(str1));
    }
}
