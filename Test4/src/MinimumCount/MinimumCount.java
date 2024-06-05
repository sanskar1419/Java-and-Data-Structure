package MinimumCount;

public class MinimumCount {

   public static int minCount(int n){
     if(n <= 3)
     return n;

     int res = n;
     for(int i = 1 ; i <= n ; i++){
      int sq = i*i;
      if(sq > n){
        break;
      }

      res = Math.min(res, minCount(n-sq)+1);
     }

     return res;

     
   }

    public static void main(String args[]){
      System.out.println(minCount(12));
    }
}
