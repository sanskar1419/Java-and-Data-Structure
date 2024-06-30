public class Split_Array {
public static boolean splitArray(int arr[]){
    int sum = 0;
    for(int i = 0 ; i< arr.length ; i++){
        sum += arr[i];
    }

    if(sum % 2 == 0){
        return helper(arr, 0 , 0 , 0);
    } else {
        return false;
    }
}
public static boolean helper(int arr[] , int start_index , int left_sum , int right_sum){
    if(start_index == arr.length)
    return left_sum == right_sum;

    if(arr[start_index]%5==0){
      left_sum += arr[start_index];
    } else if(arr[start_index]%3 == 0){
      right_sum += arr[start_index];
    } else {
      return helper(arr, start_index+1, left_sum+arr[start_index], right_sum) || helper(arr, start_index+1, left_sum, right_sum+arr[start_index]);
    }

    return helper(arr, start_index+1, left_sum, right_sum);
}
public static void main(String args[]){
  int arr[] = {1,4,3};
  System.out.println(splitArray(arr));
}
}
