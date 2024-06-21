package Polynomial;

public class PolynomialUse {
    public static void main(String args[]){
        Polynomial p = new Polynomial();
        p.setCoefficient(10, 0);
        p.setCoefficient(5, 2);
        // p.setCoefficient(20, 0);
        p.print();

        Polynomial p2 = new Polynomial();
        p2.setCoefficient(5, 0);
        p2.setCoefficient(4, 1);
        p2.setCoefficient(7, 4);
        p2.print();

        // Polynomial p3 = Polynomial.add(p, p2);
        // p3.print();  
        
        Polynomial p4 = Polynomial.multiply(p, p2);
        p4.print();
    }
}
