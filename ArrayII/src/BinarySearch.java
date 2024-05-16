public class BinarySearch {
    public static int BS(int arr[],int x){
        int start = 0;
        int end = arr.length - 1;

        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid] == x){
                return mid;
            }
            if(x < arr[mid]){
                end = mid - 1;
            } else {
                start = mid+1;
            }
            
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6};
        int x = 10;
        System.out.println(BS(arr,x));
    }
}
