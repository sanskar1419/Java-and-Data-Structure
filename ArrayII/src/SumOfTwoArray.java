public class SumOfTwoArray {
    public static void FindSum(int arr1[], int arr2[], int output[]){
       int i = arr1.length-1;
       int j = arr2.length -1;
       int k = output.length -1;
       int reminder = 0;
       while(i>=0 && j>=0){
        int sum = arr1[i]+arr2[j] +reminder;
        output[k] = sum%10;
        reminder = sum/10;
        i--;
        j--;
        k--;
       }

       while (i>=0) {
        int sum = arr1[i] +reminder;
        output[k] = sum%10;
        reminder = sum/10;
        k--;
        i--;
       }

       while (j>=0) {
        int sum = arr2[j] +reminder;
        output[k] = sum%10;
        reminder = sum/10;
        k--;
        j--;
       }

       output[0] =reminder;
    }

    public static void PrintArray(int arr[]){
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " " );
        }
    }
    public static void main(String args[]){
        int arr1[]={6,9,8};
        int arr2[] ={5,9,2};
        int output[] = new int[Math.max(arr1.length, arr2.length) + 1];
        FindSum(arr1,arr2,output);
        PrintArray(output);
    }
}
