public class CompressString {
   public static String compress_string(String str){
    int count = 0;
    char ch = str.charAt(0);
    String result_String = "";
    result_String += ch;

    for(int i= 0 ;i<str.length(); i++){
      if(str.charAt(i) == ch){
        count++;
      } else {
        if(count != 1){
          result_String += count;
        }
        count = 1;
        ch = str.charAt(i);
        result_String += ch;
      }
    }
    if(count != 1){
      result_String += count;
    }


    return result_String;
   }
    public static void main(String args[]){
      String str1 = "phqghumeaylnlfdxfircvscxggbwkfnqduxwfnfozvsrtkjprepggxrpnrvystmwcysyycqpevikeffmznimkkasvwsrenzkycxf";
      System.out.println(compress_string(str1));
    }
}

