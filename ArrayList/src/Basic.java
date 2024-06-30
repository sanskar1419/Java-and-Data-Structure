import java.util.ArrayList;

public class Basic {
 public static void main(String args[]){
    ArrayList<Integer> arr = new ArrayList<>();
    arr.add(5);
    arr.add(10);
    arr.add(5,20);
    System.out.println(arr.size());
    // arr.set(4,15);
        for(int i = 0 ; i<arr.size() ; i++){
        System.out.print(arr.get(i) + " ");
    }
 }
}
