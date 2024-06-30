package Generic_Method;

public class Vehicle implements PrintInterface {
  int maxSpeed;
  String color;

  public Vehicle(int maxSpeed , String color){
    this.color = color;
    this.maxSpeed = maxSpeed;
  }

  public void print(){
    System.out.println(maxSpeed + " " + color);
  }
}
