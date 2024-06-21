package Abstract;

public class VehicleUse {
  public static void main(String args[]){
   Vehicle v = new BMW();
   System.out.println(v.isMotorized());
   System.out.println(v.getCompanyName());
  }

}
