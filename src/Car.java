// Car.java
public class Car extends Vehicle {
    public Car(int speed, double fuelLevel) {
        super(speed, fuelLevel);
    }

    @Override
    public void start() {
        System.out.println("Car is starting...");
    }

    public void updateVehicleStatus(String message) { // Reduced stamp coupling to data coupling
        System.out.println("Car Status: " + message);
    }
}
