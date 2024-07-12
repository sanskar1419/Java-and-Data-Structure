import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class practice{
      public static int simpleArraySum(List<Integer> ar) {
      // Write your code here
        if(ar.isEmpty()){
            return 0;
        }
      int sum = 0 ;
      for(int i = 0 ; i < ar.size() ; i++){
          sum += ar.get(i);
      }
        return sum;
    }

    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        int start = 0;
        int current = 0;
        int pairs = 0;
        int currentElement=ar.get(0);
        while(current < n){
          if(currentElement != ar.get(current)){
            pairs += (current - start)/2;
            start = current;
            currentElement = ar.get(current);
          }
          current++;
        }

        if(start != n){
        pairs += (n - start)/2;
        }
        return pairs;
    }

    public static void main(String[] args) {
        Scanner s = new  Scanner(System.in);
        LinkedList<Integer> arr = new LinkedList<>();
        LinkedList<Integer> temp = new LinkedList<>();
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            arr.add(s.nextInt());
        }
        System.out.println(arr);
        Collections.sort(arr);
        System.out.println(arr);
        System.err.println(sockMerchant(arr.size(), arr));

    }
}


