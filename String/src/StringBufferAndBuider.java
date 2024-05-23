public class StringBufferAndBuider {
   
    public static void main(String args[]){
      StringBuffer str = new StringBuffer("abc");
      System.out.println(str);
      str.setCharAt(1, 'd');
      System.out.println(str);

    }
}
