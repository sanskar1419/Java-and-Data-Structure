import java.util.Scanner;

public class Wave {
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

    public static void wavePrint(int arr[][]){
        int rows = arr.length;
		
		if(rows==0)
		{
			return;
		}
		int cols = arr[0].length;
				
	    for(int i = 0 ; i<cols ; i++)
	    {
	    	if(i%2 == 0)
	    	{
	    		for(int j = 0 ; j<rows ; j++)
	    		{
	    			System.out.print(arr[j][i]+" ");
	    		}
	    	}
	    	else
	    	{
	    		for(int j = rows-1 ; j>=0;j--)
	    		{
	    			System.out.print(arr[j][i]+" ");
	    		}
	    	}
	    }
    }

    public static void main(String args[]){
        int arr[][] = {{1,2,3,4,5},{4,5,6,7,8},{2,4,6,8,10},{10,11,12,13,14},{0,1,8,56,6}};
      wavePrint(arr);
    }
}
