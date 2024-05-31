package ReplacedCharacter;
public class ReplacedCharacter {
    
    public static String replace(String str, char char_to_replaced, char replacement_char){
      if(str.length() == 0 ){
         return "";
      }
      if(str.charAt(0) == char_to_replaced){
         return replacement_char + replace(str.substring(1), char_to_replaced, replacement_char);
      } else {
         return str.charAt(0) + replace(str.substring(1), char_to_replaced, replacement_char);
      }
    }
    public static void main(String args[]){
       String str = "Sanskar";
       char char_to_replaced = 'a';
       char replacement_char = 'b';
       System.out.println(replace(str, char_to_replaced, replacement_char));
    }
}
