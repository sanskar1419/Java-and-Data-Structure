package CheckAB;
public class CheckAB {
    public static boolean abCheck(String str){
     if(str.length() == 0)
     return true;

     if(str.charAt(0) == 'a'){
      if(str.substring(1).length()>1 && str.substring(1,3).equals("bb"))
      return abCheck(str.substring(3));
      else 
      return abCheck(str.substring(1));
     } 

     return false;
    }

   
    
    public static void main(String args[]){
        System.out.println(abCheck("abbaabb"));
    }
}
