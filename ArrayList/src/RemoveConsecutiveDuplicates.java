import java.util.ArrayList;

public class RemoveConsecutiveDuplicates {
    public static ArrayList<Integer> removeDuplicate(int arr[]){
        ArrayList<Integer> result_arr = new ArrayList<>();
        int current_element = arr[0];
        result_arr.add(current_element);

        int i = 1;
        while(i<arr.length){
            if(arr[i] == current_element){
                i++;
            } else {
                current_element = arr[i];
                result_arr.add(current_element);
                i++;
            }
        }

        return result_arr;
    }

    public static void printArray(ArrayList<Integer> arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
    public static void main(String args[]){
        int arr[] = {10,10,20,30,30,40,10,20};
        ArrayList<Integer> result_arr = removeDuplicate(arr);
        printArray(result_arr);

    }
}
