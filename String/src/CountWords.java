public class CountWords {
    public static int printChars(String str){
        if(str.isEmpty()){
            return 0;
        }

        int count = 0;
        for(int i = 0 ; i < str.length() ; i++){
            if(str.charAt(i) == ' ')
            count++;
        }
        return count + 1;
    }
    public static void main(String args[]){
        String str = "It's a wonderful day";
        System.out.println(printChars(str));

    }
}
