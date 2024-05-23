public class StringBasic {
    public static void main(String args[]){
        String str = "Sanskar";
        System.out.println(str.length());
        System.out.println(str.charAt(3));
        System.out.println(str.codePointAt(1));
        System.out.println(str.codePointBefore(7));
        System.out.println(str.codePointCount(0, 7));

        String str2 = "Sanska";
        System.out.println(str2.compareTo(str));
        System.out.println(str2.compareToIgnoreCase(str));

        String str3 = " Gupta";
        System.out.println("concat() : " + str.concat(str3));

        System.out.println(str3.contains("ptg"));
        System.out.println(str3.contentEquals(str3));

        System.out.println(str.equals(str2));

        String str4 = "Hello";
        byte[] result = str4.getBytes();

        for(int i = 0 ; i<result.length ; i++){
            System.out.print(result[i] + " ");
        }
        System.out.println();

        char[] myArray = {'0','1','2','3','4','5','6','7','8','9'};
        str4.getChars(0, 4 , myArray, 4);
        for(int i = 0 ; i<myArray.length ; i++){
            System.out.print(myArray[i]);
        }

        System.out.println();
            
        System.out.println("Hash Code : "+str4.hashCode());
        System.out.println(str.replace('a','p' ));
        System.out.println(str.replace("Sa","ba" ));

        String myStr = "Split a string by spaces, and also punctuation.";
        String regex = "[,\\.\\s]";
        String[] arr = myStr.split(regex);
        for(int i = 0 ; i<arr.length ; i++){
            System.out.println(arr[i]);
        }


        String str5 = "Sanskar";
        String str6 = new String("Sanskar");

        System.out.println(str == str5);
        System.out.println(str == str6);

    }
}
