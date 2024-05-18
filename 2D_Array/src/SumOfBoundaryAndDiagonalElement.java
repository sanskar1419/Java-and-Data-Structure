
public class SumOfBoundaryAndDiagonalElement {

    public static int boundaryAndDiagonalSum(int arr[][]){
      int sum = 0;
      int N = arr.length;

       //   Boundary Row Sum
      for(int i = 0 ; i<N ; i++){
        sum += arr[0][i];
        sum += arr[N-1][i];
      }

       //   Boundary col Sum
       for(int i = 1 ; i<N-1 ; i++){
        sum += arr[i][0];
        sum += arr[i][N-1];
      }

    //   Diagonal Sum

    for(int i = 1 ; i <N-1 ; i++){
        sum += arr[i][i];
        sum += arr[i][N-1-i];
    }

    if(N%2 != 0){
        sum -= arr[N/2][N/2];
    }

    return sum;

    }

    public static void main(String args[]){
      int arr[][] = {{1,2,3,4,5},{4,5,6,7,8},{2,4,6,8,10},{10,11,12,13,14},{0,1,8,56,6}};
      System.out.println(boundaryAndDiagonalSum(arr));;

    }
}
