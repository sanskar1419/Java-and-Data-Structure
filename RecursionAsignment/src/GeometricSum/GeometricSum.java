package GeometricSum;
public class GeometricSum {
    public static double GP(int k){
      if(k == 0){
        return 1.0;
      }

      return (1/Math.pow(2, k)) + GP(k-1);
    }
    
    public static void main(String args[]){
        System.out.println(GP(4));
    }
}
