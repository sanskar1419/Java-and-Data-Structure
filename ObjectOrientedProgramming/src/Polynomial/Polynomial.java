package Polynomial;


public class Polynomial {
  private int dynamicArray[];
  private int nextMaxPower;


  public Polynomial(){
    this.dynamicArray = new int[5];
    this.nextMaxPower=0;
  }

  private Polynomial(int size){
   this.dynamicArray = new int[size + 1];
   this.nextMaxPower=size+1;
  }

  private void doubleArray(){
    int tempArray[] = new int[this.nextMaxPower*2];
    for(int i = 0; i< this.dynamicArray.length ; i++){
        tempArray[i] = this.dynamicArray[i];
    }
    this.dynamicArray = tempArray;
  }

  private void simplify(){
    if(nextMaxPower > 1){
        int gcd = 1;
    int maxCoefficient = 0;
    for(int i = 0 ; i<nextMaxPower ; i++){
        maxCoefficient = Math.max(maxCoefficient, dynamicArray[i]);
    }
    // System.out.println("Max Coefficient : " + maxCoefficient);

    int i = 2 ;
    while(i<=maxCoefficient){
        boolean isDivisible = true;
        int j = 0;
        while(j<nextMaxPower){
            if(dynamicArray[j] % i !=0){
              isDivisible = false;
              break;
            }

            if(isDivisible == true && j == nextMaxPower-1){
                gcd = Math.max(gcd, i);
            }
            j++;
        }
        i++;

    }

    for(int k = 0 ; k<nextMaxPower ; k++){
       dynamicArray[k] = dynamicArray[k]/gcd;
    }

    }

  }


  public void setCoefficient(int coefficient , int degree){
    
    if(degree >= dynamicArray.length){
        doubleArray();
    } 

        this.dynamicArray[degree] = coefficient;
        if(degree >= nextMaxPower){
            this.nextMaxPower = degree+1;
        }

        simplify();
    
  }

  public void print(){
    // System.out.println(this.nextMaxPower + " " + this.dynamicArray.length);
    for(int i = 0 ; i<this.nextMaxPower ; i++){
        if(this.dynamicArray[i] != 0){
            System.out.print(this.dynamicArray[i] + "x" + i + " ");
        }
    }
    System.out.println();
  }

  public static Polynomial add(Polynomial p1 , Polynomial p2){
    int tempNextMaxPower = Math.max(p1.nextMaxPower, p2.nextMaxPower);
    Polynomial result = new Polynomial();
    if(tempNextMaxPower > result.dynamicArray.length){
      result.doubleArray();
    }
    result.nextMaxPower = tempNextMaxPower;

    for(int i = 0 ; i < p1.nextMaxPower ; i++){
      result.dynamicArray[i] = p1.dynamicArray[i];
    }


    for(int i = 0 ; i < p2.nextMaxPower ; i++){
      result.dynamicArray[i] += p2.dynamicArray[i];
    }

    // System.out.print(result);

    result.simplify();

    return result;
  }


  public static Polynomial multiply(Polynomial p1 , Polynomial p2){
    Polynomial result = new Polynomial(p1.nextMaxPower - 1 + p2.nextMaxPower - 1);
    System.out.println(result.nextMaxPower + " " + result.dynamicArray.length); 

    
    for(int i=0 ; i < p1.nextMaxPower ; i++){
      for(int j = 0 ; j<p2.nextMaxPower ; j++){
        int product = p1.dynamicArray[i] * p2.dynamicArray[j];
        int degree = i+j;
        // System.out.println(p1.dynamicArray[i] + " * " +  p1.dynamicArray[j] + " = " +product + "----->" + degree);
        result.dynamicArray[degree] += product;
      }
    }

    result.simplify();

    return result;

  }

}
