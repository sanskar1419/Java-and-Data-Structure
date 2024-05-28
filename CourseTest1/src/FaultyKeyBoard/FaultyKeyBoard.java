package FaultyKeyBoard;

public class FaultyKeyBoard {
    public static boolean approach1(String original_string , String faulty_string){
        boolean isFaulty = true; 
        int i = 0, j = 0;

        while(i<original_string.length() && j< faulty_string.length()){
            if(original_string.charAt(i) == faulty_string.charAt(j)){
                i++;
                j++;
            } else if(i>0 && original_string.charAt(i-1) == faulty_string.charAt(j)){
                j++;
            } else {
                return false;
            }
        }

        while(j<faulty_string.length()){
            if(original_string.charAt(i-1) != faulty_string.charAt(j)){
                return false;
            }
            j++;
        }

        return isFaulty;
    }

    public static void main(String args[]){
        String original_string = "code";
        String faulty_string1 = "coodeee";
        String faulty_string2 = "hheeeloo";

        System.out.println(approach1(original_string,faulty_string1));
        System.out.println(approach1(original_string,faulty_string2));
    }
}
