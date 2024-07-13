package PreviousConcept;

public class merge2SortedArray {
    public static int[] mergeArray(int arr1[], int arr2[]) {
        int m = arr1.length;
        int n = arr2.length;
        int i = 0, j = 0, k = 0;
        int resultArr[] = new int[m + n];

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

    public static void main(String args[]) {
        int arr1[] = { 1, 4, 8, 10 };
        int arr2[] = { 2, 6, 8, 9, 11 };
        int result[] = mergeArray(arr1, arr2);

        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
