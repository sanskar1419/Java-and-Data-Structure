import java.util.Scanner;

public class Spiral {
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

    public static void spiralPrint(int arr[][]){
        int nRows = arr.length;
        if(nRows == 0){
            return;
        }
        int nCols = arr[0].length;
        int total_element = nRows*nCols;
        int row_lower = 0 ;
        int col_lower = 0;
        int row_upper = nRows-1;
        int col_upper = nCols-1;

        while(total_element>0){
            // Printing Left to Right
        for(int i = col_lower ; i<=col_upper ; i++){
            System.out.print(arr[row_lower][i] + " ");
            total_element--;
        }

        row_lower++;

        // Printing Top to Bottom
        for(int i = row_lower; i<= row_upper ; i++){
            System.out.print(arr[i][col_upper] + " ");
            total_element--;
        }

        col_upper--;

        // Printing Right to Left
        for(int i = col_upper; i>=col_lower ; i--){
            System.out.print(arr[row_upper][i] + " ");
            total_element--;
        }

        row_upper--;

        // Printing Bottom to top
        for(int i = row_upper ; i>=row_lower ; i--){
            System.out.print(arr[i][col_lower] + " ");
            total_element--;
        }

        col_lower++;
        }

        System.out.println();

    }

    public static void main(String args[]){
        int arr[][] = {{1,2,3,4},{14,15,16,5},{13,20,17,6},{12,19,18,7},{11,10,9,8}};
      spiralPrint(arr);
      
    }
}
