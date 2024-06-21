package DynamicArray;

public class DynamicArrayUse {
    public static void main(String args[]){
        DynamicArray d = new DynamicArray();
        System.out.println(d.size());
        System.out.println(d.isEmpty());
        d.add(10);
        d.add(20);
        d.add(10);
        d.add(20);
        d.add(10);
        d.add(20);
        d.print();
        d.set(5, 50);
        d.print();
        d.removeLastElement();
        d.print();
        d.removeLastElement();
        d.print();
        d.removeLastElement();
        d.print();
        d.removeLastElement();
        d.print();
        d.removeLastElement();
        d.print();
        d.removeLastElement();
        d.print();
        d.removeLastElement();
        d.print();
    }
}
