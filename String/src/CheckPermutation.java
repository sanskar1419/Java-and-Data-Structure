public class CheckPermutation {
   public static boolean check_permutation(String str1 , String str2){
    if(str1.length() != str2.length()){
      return false;
    }
    int frequency[] = new int[256];

    for(int i=0 ; i< str1.length() ; i++){
      frequency[(int)(str1.charAt(i))]++;
    }

    for(int i=0 ; i< str2.length() ; i++){
      frequency[(int)(str2.charAt(i))]--;
    }

    for(int i=0 ; i< frequency.length ; i++){
      if(frequency[i] != 0){
        return false;
      }
    }

    return true;

   }
    public static void main(String args[]){
      String str1 = "abcde";
      String str2 = "baedc";
      System.out.println(check_permutation(str1,str2));
    }
}
