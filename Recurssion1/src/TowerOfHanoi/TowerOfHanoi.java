package TowerOfHanoi;
public class TowerOfHanoi {
    public static void TOH(int n , char s , char h , char d){
        if(n == 1){
            System.out.println(s + " " + d);
            return;
        }

        TOH(n-1, s, d, h);
        System.out.println(s + " " + d);
        TOH(n-1, h, s, d);
    }
    
    public static void main(String args[]){
       TOH(4, 's', 'h', 'd');
    }
}
