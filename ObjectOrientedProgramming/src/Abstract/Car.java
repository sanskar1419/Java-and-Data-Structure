package Abstract;

public abstract class Car extends Vehicle {
    int noDoors;

    public Car(){
        super(20);
        System.out.println("Car's Constructor is called");
    }

    public void printDoors(){
        System.out.println(noDoors);
    }

    public void print(){
        System.out.println("Car's print method is called");
    }

    public boolean isMotorized(){
        return true;
    }
}
