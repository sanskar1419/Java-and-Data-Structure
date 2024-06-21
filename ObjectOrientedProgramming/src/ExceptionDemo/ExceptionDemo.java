package ExceptionDemo;

public class ExceptionDemo {

    public static int divide(int a , int b) throws DivideByZeroException{
        if(b == 0){
            // Checked Exception new to handle
            throw new DivideByZeroException();
            // unchecked Exception
            // throw new ArithmeticException(); 
        }
        return a/b;
    }

    /* 
      public static void main(String args[]) throws DivideByZeroException{
      System.out.println(divide(4,0));
      System.out.println("After Exception Execution");
    }
     */

    public static void main(String args[]) {
        try {
           System.out.println(divide(4,0));
           System.out.println("Within Try");
        } catch (DivideByZeroException e) {
            // TODO: handle exception
            System.out.println("Divide By Zero Exception ");
            e.printStackTrace();
            return;
        } finally{
            System.out.println("Finally Statement");
        }

      System.out.println("After Exception Execution");
    }

}
