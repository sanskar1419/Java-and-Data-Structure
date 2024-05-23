public class AllSubstring {
    public static void printSubString(String str){
       int start = 0 ; 
       int end = str.length() - 1;

       while(start<=end){
        for(int i = start; i <= end ; i++){
            System.out.println(str.substring(start,i+1));
        }
        start++;
       }
    }
    public static void main(String args[]){
        String str = "pqrs";
        printSubString(str);

    }
}
