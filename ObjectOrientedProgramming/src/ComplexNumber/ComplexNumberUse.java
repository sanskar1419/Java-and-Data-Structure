package ComplexNumber;

public class ComplexNumberUse {
    public static void main(String args[]){
        ComplexNumber c1 = new ComplexNumber(2,5);
        ComplexNumber c2 = new ComplexNumber(2,-5);
        // c1.print();
        // c2.print();

        // c1.setReal(4);
        // c1.setImaginary(10);
        // c1.print();

        // c1.add(c2);
        // c1.print();

        // c1.multiply(c2);
        // c1.print();

        ComplexNumber c3 = ComplexNumber.add(c1, c2);
        c1.print();
        c2.print();
        c3.print();

    }
}
