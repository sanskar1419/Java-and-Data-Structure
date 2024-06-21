package Inheritance;

public class Vehicle {
    String color;
    double maxSpeed;
    double minSpeed;
    int wheel;
    private int number;

    public Vehicle(int n){
        System.out.println("Vehicle's Constructor is called");
    }

    void set(int number){
        this.number = number;
    }
    int get(){
        return number;
    }

     public void print(){
        System.out.println("Vehicle's print method is called");
    }
}
