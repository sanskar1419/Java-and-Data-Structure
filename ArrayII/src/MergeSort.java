public class MergeSort {
    public static int[] mergeSort(int arr1[],int arr2[]){
       int n = arr1.length;
       int m = arr2.length;
       int arr3[] = new int[n+m];
       int i = 0, j=0, k=0 ;
       while(i<n && j<m){
        if(arr1[i] > arr2[j]){
            arr3[k] = arr2[j];
            j++;
            k++;
           
        } else {
            arr3[k] = arr1[i];
            i++;
            k++;
           
        }
       }

       while(i<n){
        arr3[k] = arr1[i];
        i++;
        k++;
       }

       while(j<m){
        arr3[k] = arr2[j];
        j++;
        k++;
       }

       return arr3;
    }

    public static void PrintArray(int arr[]){
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " " );
        }
    }
    public static void main(String args[]){
        int arr1[]={1,4,10,12,13};
        int arr2[] = {2,3,5,7,11,14,20};
        int arr3[]=mergeSort(arr1,arr2);
        PrintArray(arr3);
    }
}
