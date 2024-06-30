package Generics;

public class PairUse {
    public static void main(String args[]){
        // Pair p = new Pair();
        // System.out.println(p.getFirst() + " " + p.getSecond());

        Pair<String , Integer> pi = new Pair<>();
        System.out.println(pi.getFirst() + " " + pi.getSecond());

        Pair<Pair<String,Integer> , Integer> p = new Pair<>();
        p.setSecond(5);
        p.setFirst(pi);
        p.getFirst().setFirst("abcd");
        System.out.println(p.getFirst()+" "+ p.getFirst().getFirst() + " " + p.getFirst().getSecond() + " " + p.getSecond());
    }

}
