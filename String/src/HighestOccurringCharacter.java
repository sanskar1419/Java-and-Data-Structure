public class HighestOccurringCharacter {
   public static char highest_occurring_character(String str){
    int frequency[] = new int[256];
    int max = Integer.MIN_VALUE;


    for(int i=0 ; i< str.length() ; i++){
      frequency[(str.charAt(i))]++;
     max = Math.max(max, frequency[str.charAt(i)]);
    }

    char answer = '\0';
    for(int i = 0 ; i< str.length()  ; i++){
      if(frequency[str.charAt(i)] == max){
      answer = str.charAt(i);
      break;
      }
    }

    
    return answer;
   }
    public static void main(String args[]){
      String str1 = "sssssssssaabccbaabbbcccccccddddddd";
      System.out.println(highest_occurring_character(str1));
    }
}
