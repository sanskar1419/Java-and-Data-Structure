public class KthBitSetOrNot {
    public static void main(String args[]){
        int n = 500, k=3;

        int x = 1<<(k-1);

        if((n&x) != 0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

/* 
// Option 1
 public class KthBitSetOrNot {
    public static void main(String args[]){
        int n = 5, k=1 , x=1;

        // Finding Kth Set bit number
        for(int i= 1 ; i<k-1;i++){
            x= x*i;
        }

        if((n&x) != 0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
 */

 /* 
  * Option 2
  public class KthBitSetOrNot {
    public static void main(String args[]){
        int n = 12, k=3;

        // Finding Kth Set bit number
        for(int i= 0 ; i<k-1;i++){
            n=n/2;
        }

        if((n&1) != 0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
  */

  /* 
   * Option 3
   public class KthBitSetOrNot {
    public static void main(String args[]){
        int n = 12, k=3;

        int x = 1<<(k-1);

        if((n&x) != 0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
   */