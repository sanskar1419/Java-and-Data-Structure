public class EquilibriumIndex {
    public static void findEquilibriumIndex(int arr[]){
        int sum = 0;
        for(int i=0 ; i<arr.length ; i++){
            sum += arr[i];
        }

        int leftSum = 0;
        int rightSum = sum;
        for(int i = 0 ; i<arr.length;i++){
          rightSum = rightSum - arr[i];
          leftSum = sum - arr[i] - rightSum;

          if(rightSum == leftSum){
            System.out.println("Equilibrium INdex : " +  i);
            return;
          }
        }
    }

    public static void PrintArray(int arr[]){
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " " );
        }
    }
    public static void main(String args[]){
        int arr[]={2,3,10,-10,4,2,9};
        findEquilibriumIndex(arr);
    }
}
