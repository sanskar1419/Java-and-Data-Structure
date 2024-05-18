public class Basic2dArray {
    public static void PrintArray(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        int arr2d[][] = new int[4][];
        // System.out.println(arr2d.length);
        // System.out.println(arr2d[0].length);
        for(int i = 0 ; i<arr2d.length ; i++){
            int j = i + 5;
            arr2d[i] = new int[j];
            System.out.println(j);
        }
        System.out.println(arr2d.length);
        PrintArray(arr2d);
    }
}
