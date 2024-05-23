public class PrintAllCharacter {
    public static void printChars(String str){
        for(int i = 0 ; i < str.length() ; i++){
            System.out.println(str.charAt(i));
        }
    }
    public static void main(String args[]){
        String str = "Sanskar";
        printChars(str);

    }
}
