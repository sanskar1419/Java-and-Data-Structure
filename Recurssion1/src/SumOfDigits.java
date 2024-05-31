public class SumOfDigits {
    public static int printSum(int n){
      if(n < 10){
        return n;
      } else {
        return n%10 + printSum(n/10);
      }
    }
    public static void main(String args[]){
        System.out.println(printSum(123456));
    }
}
