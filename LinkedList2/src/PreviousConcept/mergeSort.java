package PreviousConcept;

public class mergeSort {
    public static int[] merge(int resultArr[], int arr1[], int arr2[]) {
        int m = arr1.length;
        int n = arr2.length;
        int i = 0, j = 0, k = 0;

        while (i < m && j < n) {
            if (arr1[i] <= arr2[j]) {
                resultArr[k] = arr1[i];
                k++;
                i++;
            } else {
                resultArr[k] = arr2[j];
                k++;
                j++;
            }
        }

        while (i < m) {
            resultArr[k] = arr1[i];
            i++;
            k++;
        }

        while (j < n) {
            resultArr[k] = arr2[j];
            k++;
            j++;
        }

        return resultArr;
    }

    public static void ms(int arr[]) {
        if (arr.length <= 1) {
            return;
        }

        int mid = arr.length / 2;
        int b[] = new int[mid];
        int c[] = new int[arr.length - mid];

        for (int i = 0; i < mid; i++) {
            b[i] = arr[i];
        }

        for (int i = mid; i < arr.length; i++) {
            c[i - mid] = arr[i];
        }

        ms(b);
        ms(c);
        merge(arr, b, c);
    }

    public static void main(String args[]) {

        int arr[] = { 1, 3, 2, 4, 8, 3, 5 };
        ms(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
