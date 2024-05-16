public class SecondLargestElement {
    public static int secondLargestElement(int arr[]){
       int firstLargest = Integer.MIN_VALUE;
       int secondLargest = Integer.MIN_VALUE;
       for(int i = 0 ; i<arr.length ; i++){
        if(arr[i]>firstLargest){
            secondLargest = firstLargest;
            firstLargest = arr[i];
        } else{
            if(arr[i] < firstLargest && arr[i]>secondLargest){
                secondLargest = arr[i];
            }
        } 
        
       }
       return secondLargest;
    }

    public static void PrintArray(int arr[]){
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " " );
        }
    }
    public static void main(String args[]){
        int arr[]={4,3,10,10,9,2};
        System.out.println(secondLargestElement(arr));
    }
}
