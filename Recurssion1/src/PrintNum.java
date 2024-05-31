public class PrintNum {
    public static void print(int n){
      if(n == 1){
        System.out.println(1);
      } else {
        print(n-1);
        System.out.println(n);
      }
    }
    public static void main(String args[]){
      print(6);
    }
}
