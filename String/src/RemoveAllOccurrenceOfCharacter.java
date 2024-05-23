public class RemoveAllOccurrenceOfCharacter {
   public static String remove_all_occurrence(String str1, char ch){
    String result_String = "";
    
    for(int i = 0 ; i< str1.length() ; i++){
      if(str1.charAt(i) != ch){
        result_String+=str1.charAt(i);
      }
    }
   

    return result_String;
   }
    public static void main(String args[]){
      String str1 = "aabccbaa";
      char ch = 'a';
      System.out.println(remove_all_occurrence(str1,ch));
    }
}
