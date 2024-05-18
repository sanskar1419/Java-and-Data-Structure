import java.util.Scanner;

public class RowWiseSum {
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

    public static void rowWiseSum(int arr[][]){
    for(int i = 0; i<arr.length;i++){
        int sum = 0;
        for(int j = 0 ; j < arr[0].length ; j++){
            sum += arr[i][j];
        }
        System.out.print(sum + " ");
    }
    }

    public static void main(String args[]){
      int arr[][] = TakeInput();
      rowWiseSum(arr);
    }
}
