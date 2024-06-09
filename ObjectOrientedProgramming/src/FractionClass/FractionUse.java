package FractionClass;

public class FractionUse {
    public static void main(String args[]){
        Fraction f1 = new Fraction(2, 3);
        f1.print();
        // f1.increment();
        // f1.print();
        // f1.decrement();
        // f1.print();
        // f1.decrement();
        // f1.print();
        Fraction f2 = new Fraction(2, 6);
        f2.print();

        // f1.add(f2);
        Fraction f3 = Fraction.add(f1, f2);
        f3.print();


        Fraction f4 = new Fraction(1, 5);
        f4.print();
        Fraction f5 = new Fraction(2, 8);
        f5.print();

        // f4.subtract(f5);
        f4.multiply(f5);
        f4.print();
    }
}
