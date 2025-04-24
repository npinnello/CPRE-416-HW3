// Motorcycle.java
public class Motorcycle extends Vehicle {
    public Motorcycle(int speed, double fuelLevel) {
        super(speed, fuelLevel);
    }

    @Override
    public void start() {
        System.out.println("Motorcycle is starting...");
    }
}
