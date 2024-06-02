package ReplacePi;
public class ReplacePi {
    
    public static String replacePi(String str){
      if(str.length() <= 1 ){
         return str;
      }
      if(str.startsWith("pi") == true){
         return "3.14"+replacePi(str.substring(2));
      } else {
         return str.charAt(0) + replacePi(str.substring(1));
      }
    }
    public static void main(String args[]){
       String str = "SanskarpiGuptapi4";
       System.out.println(replacePi(str));
    }
}
