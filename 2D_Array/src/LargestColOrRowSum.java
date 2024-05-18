import java.util.Scanner;

public class LargestColOrRowSum {
    public static int[][] TakeInput(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int rows=s.nextInt();
        System.out.println("Enter number rof cols : ");
        int cols=s.nextInt();
        int[][]arr=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.println("Enter the element at "+i+" row "+j+" column");
                arr[i][j]=s.nextInt();
            }
        }
        return arr;
    }

    public static void PrintArray(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void largestColOrRowSum(int arr[][]){
        int cols = arr[0].length;
        int rows = arr.length;
        if(rows == 0){
            System.out.println("row 0 " + Integer.MIN_VALUE);
            return;
        }

        int colMax = Integer.MIN_VALUE;
        int col_max_index = 0;
        int row_max = Integer.MIN_VALUE;
        int row_max_index = 0;

        // Finding max row sum
        for(int i = 0; i<rows;i++){
            int sum = 0;
            for(int j = 0 ; j < cols ; j++){
                sum += arr[i][j];
            }
            if(sum > row_max){
                row_max = sum;
                row_max_index = i;
            }
        }


        // Finding Max Col value
        for(int j = 0; j<cols;j++){
            int sum = 0;
            for(int i = 0 ; i < rows ; i++){
                sum += arr[i][j];
            }
            if(sum > colMax){
                colMax = sum;
                col_max_index = j;
            }
        }

        if(row_max>=colMax){
            System.out.println("row " + row_max_index + " " +row_max);
        } else {
            System.out.println("column " + col_max_index + " " +colMax);
        }

    }

    public static void main(String args[]){
      int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
      largestColOrRowSum(arr);
    }
}
