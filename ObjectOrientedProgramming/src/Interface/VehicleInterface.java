package Interface;

public interface VehicleInterface extends CarInterface, CharSequence {

    double PI = 3.14;

    boolean isMotorized();
    String getCompanyName();
}
