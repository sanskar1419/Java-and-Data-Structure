package Pattern;
public class Pattern {
    public static void approach1(int n){
        int total_length = 2*n - 1;

       for(int i = 0 ; i<n ; i++){
        for(int j = 0 ; j<=i ; j++){
            System.out.print(n-j);
        }

        for(int j = 0 ; j < n-1-i ; j++){
            System.out.print(n-i);
        }

        for(int j = 0 ; j < n-1-i ; j++){
            System.out.print(n-i);
        }

        for(int j = 0 ; j < i ; j++){
            System.out.print(n+1-i+j);
        }

        System.out.println();
       }

       for(int i = 0 ; i < n - 1 ; i++){
        for(int j = 0 ; j < n-1-i ; j++ ){
            System.out.print(n-j);
        }

        for(int j = 0 ; j <=i ; j++ ){
            System.out.print(i+2);
        }

        for(int j = 0 ; j <=i ; j++ ){
            System.out.print(i+2);
        }

        for(int j = 0 ; j < n-2-i ; j++){
            System.out.print(i+3+j);
        }


        System.out.println();
       }
    }

    public static void main(String args[]){
       int n = 2;
       approach1(n);
    }
}
