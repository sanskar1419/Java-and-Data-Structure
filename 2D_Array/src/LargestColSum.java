import java.util.Scanner;

public class LargestColSum {
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

    public static int largestColSum(int arr[][]){
        int cols = arr[0].length;
        int rows = arr.length;
        int max= Integer.MIN_VALUE;
        for(int j = 0; j<cols;j++){
        int sum = 0;
        for(int i = 0 ; i < rows ; i++){
            sum += arr[i][j];
        }
        if(sum > max){
            max = sum;
        }
    }
    return max;
    }

    public static void main(String args[]){
      int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
      System.out.println(largestColSum(arr));
    }
}
