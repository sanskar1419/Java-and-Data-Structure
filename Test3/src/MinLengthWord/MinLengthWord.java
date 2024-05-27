package MinLengthWord;
public class MinLengthWord {
    public static void approach1(String str){
        /* 
         Time Complexity: O(n^2)
         Space Complexity: O(1)
         For Input Size n
         */
        int n = str.length();
        int start = 0;
        int end;
        int minStringLength = Integer.MAX_VALUE;
        int minStringStart = -1 , minStringEnd = -1;

        for(int i=0 ; i<n ; i++){
           if(str.charAt(i) == ' '){
            end = i-1; 
            int diff = end-start+1;
            if(diff < minStringLength){
                minStringLength = diff;
                minStringStart = start;
                minStringEnd = end;
            }

            start = i+1;
           }
        }

        if(n-start < minStringLength){
            minStringLength = n-start;
            minStringStart = start;
            minStringEnd = n-1;
        }

        System.out.println(str.substring(minStringStart, minStringEnd+1));
    }

    public static void main(String args[]){
        String str = "this is test string";
        approach1(str);
        
    }
}
