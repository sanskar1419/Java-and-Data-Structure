public class PrintName {
    public static void print(int n){
        if( n == 1 ){
            System.out.println("Sanskar");
        } else {
            System.out.println("Sanskar");
            print(n-1);
        }
    }
    public static void main(String args[]){
        print(10);
    }
}
