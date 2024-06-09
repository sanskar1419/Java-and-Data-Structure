package ComplexNumber;

public class ComplexNumber {
    private int real;
    private int imaginary;

    // Constructor
    public ComplexNumber(int real , int imaginary){
      this.real = real;
      this.imaginary = imaginary;
    }

    // Getter function to return to print complex number
    public void print(){
        if(this.imaginary <0){
            System.out.println(this.real + " - "  + Math.abs(this.imaginary) + "i");
        } else {
            System.out.println(this.real + " + "  + this.imaginary + "i");
        }
    }

    // Setter method to set the real part
    public void setReal(int real){
        this.real = real;
    }
    // Setter method to set the imaginary part
    public void setImaginary(int imaginary){
        this.imaginary = imaginary;
    }


    // Method to add to complexNumber
    public void add(ComplexNumber c){
        this.real = this.real + c.real;
        this.imaginary = this.imaginary + c.imaginary;
    }
    // Static method to add two complex number
    public static ComplexNumber add(ComplexNumber c1 , ComplexNumber c2){
        int tempReal = c1.real + c2.real;
        int tempImaginary = c1.imaginary + c2.imaginary;

        ComplexNumber c = new ComplexNumber(tempReal, tempImaginary);
        return c;
    }

    // Method to multiply to complex number
    public void multiply(ComplexNumber c){
        int tempReal = this.real*c.real - this.imaginary*c.imaginary;
        int tempImaginary = this.real*c.imaginary + this.imaginary*c.real;

        this.real = tempReal;
        this.imaginary = tempImaginary;
    }
}
