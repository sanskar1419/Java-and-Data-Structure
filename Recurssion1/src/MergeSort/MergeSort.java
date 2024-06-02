package MergeSort;
public class MergeSort {
    public static void merge(int a[] , int b[] , int c[]){
       int i = 0, j = 0 , k=0;
       while(i<b.length && j<c.length){
        if(b[i] <= c[j]){
            a[k] = b[i];
            k++;
            i++;
        } else {
            a[k] = c[j];
            j++;
            k++;
        }
       }

       while(i<b.length){
        a[k] = b[i];
        i++;
        k++;
       }

       while(j<c.length){
        a[k] = c[j];
        j++;
        k++;
       }
    }
    public static void ms(int a[]){
       if(a.length <= 1){
        return;
       }

       int b[] = new int[a.length/2];
       int c[] = new int[a.length - b.length];

       for(int i = 0 ; i< a.length/2 ; i++){
        b[i] = a[i];
       }

       for(int i = a.length/2; i<a.length ; i++){
        c[i-a.length/2] = a[i];
       }

       ms(b);
       ms(c);
       merge(a, b, c);

    }

    public static void printArray(int arr[]){
        for(int i = 0 ; i <arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String args[]){
       int arr[] = {38,27,43,10,9,48,20};
       ms(arr);
       printArray(arr);
    }
}
