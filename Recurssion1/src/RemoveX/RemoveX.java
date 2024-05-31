package RemoveX;
public class RemoveX {
    
    public static String replace(String str, char char_to_remove){
      if(str.length() == 0 ){
         return "";
      }
      if(str.charAt(0) == char_to_remove){
         return replace(str.substring(1), char_to_remove);
      } else {
         return str.charAt(0) + replace(str.substring(1), char_to_remove);
      }
    }
    public static void main(String args[]){
       String str = "Sanskar";
       char char_to_remove = 'a';
       System.out.println(replace(str, char_to_remove));
    }
}
