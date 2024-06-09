package FractionClass;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator , int denominator){
      if(denominator == 0 && numerator !=0){
        System.out.println("Denominator cannot be Zero!!!!!!!!!!");
        return;
      }

      this.denominator = denominator;
      this.numerator = numerator;
      Simplify();
    }
    private int GCD(int num1 , int num2){
        int gcd = 1;
        int smaller = Math.min(num1, num2);
        for(int i = 2 ; i<= smaller ; i++){
            if(num1%i == 0 && num2%i == 0){
                gcd = i;
            }
        }
        return gcd;
    }

    private int LCM(int gcd,int num1 , int num2){
        return (num1*num2)/gcd;
    }

    private void Simplify(){
        int gcd = GCD(this.denominator , this.numerator);
        this.denominator /= gcd;
        this.numerator /= gcd;
    }

    public void print(){
        System.out.println(this.numerator + "/" + this.denominator);
    }

    public void increment(){
        this.numerator = this.numerator + this.denominator;
        Simplify();
    }

    public void decrement(){
        this.numerator = this.numerator - this.denominator;
        Simplify();
    }

    public void add(Fraction f){
     int gcd = GCD(this.denominator, f.denominator);
     int lcm = LCM(gcd, this.denominator, f.denominator);

     this.denominator = lcm;
     this.numerator = this.numerator * (lcm/this.denominator) + f.numerator*(lcm/f.denominator);
     Simplify();

    }

    // Method to subtract f2 from f1
    public void subtract(Fraction f){
        int gcd = GCD(this.denominator, f.denominator);
        int lcm = LCM(gcd, this.denominator, f.denominator);
   
        this.numerator = this.numerator * (lcm/this.denominator) - f.numerator*(lcm/f.denominator);
        this.denominator = lcm;
        Simplify();
    }

    public void multiply(Fraction f){
        this.numerator = this.numerator * f.numerator;
        this.denominator = this.denominator * f.denominator;
        Simplify();
    }

    public static Fraction add(Fraction f1 , Fraction f2){
        int gcd = 1;
        int smaller = Math.min(f1.denominator, f2.denominator);
        for(int i = 2 ; i<= smaller ; i++){
            if(f1.denominator%i == 0 && f2.denominator%i == 0){
                gcd = i;
            }
        }
     int lcm = (f1.denominator * f2.denominator)/gcd;

     int newDenominator = lcm;
     int newNumerator = f1.numerator * (lcm/f1.denominator) + f2.numerator*(lcm/f2.denominator);

     Fraction f = new Fraction(newNumerator, newDenominator);
     return f;
    }



}
