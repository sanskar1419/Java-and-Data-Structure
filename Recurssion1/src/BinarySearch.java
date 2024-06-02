public class BinarySearch {
    public static int bs(int arr[] , int si , int e , int x){
        if(si>e){
            return -1;
        }

        int mid = (si + e)/2;
        if(arr[mid] == x){
            return mid;
        } else if(x < arr[mid]){
            return bs(arr, si, mid - 1, x);
        } else {
            return bs(arr, mid+1, e, x);
        }
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6};
        int x = 8;

        System.out.println(bs(arr, 0, arr.length - 1, x));
    }
}
