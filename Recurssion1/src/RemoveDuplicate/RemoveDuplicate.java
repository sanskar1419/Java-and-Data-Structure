package RemoveDuplicate;
public class RemoveDuplicate {
    
    public static String removeDuplicate(String str , String ch){
      if(str.length() == 0 ){
         return ch;
      }
      String tempString = str.substring(0,1);
      if(tempString.equals(ch)){
         return removeDuplicate(str.substring(1), ch);
      } else {
         return ch  + removeDuplicate(str.substring(1), str.substring(0,1));
      }

    }
    public static void main(String args[]){
       String str = "aabccba";
       System.out.println(removeDuplicate(str , str.substring(0,1)));
    }
}
