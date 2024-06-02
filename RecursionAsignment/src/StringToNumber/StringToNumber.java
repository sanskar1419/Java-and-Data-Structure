package StringToNumber;
public class StringToNumber {
    public static int convertStringToInt(String str){
      if(str.length() == 0){
        return 0;
      }
 
      int current_num = str.charAt(0) - '0';
      return current_num*(int)Math.pow(10, str.length()-1) + convertStringToInt(str.substring(1, str.length()));
      
    }
    
    public static void main(String args[]){
        System.out.println(convertStringToInt("0001234056"));
    }
}
