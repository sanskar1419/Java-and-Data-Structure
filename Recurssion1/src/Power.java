public class Power {
    public static int findPower(int base , int exp){
        if(exp == 1){
          return base;
        } else {
          return base * findPower(base, exp-1);
        }
    }
    public static void main(String args[]){
      System.out.println(findPower(2, 5));
    }
}
