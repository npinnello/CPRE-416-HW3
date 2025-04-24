// Vehicle.java - Abstract base class
public abstract class Vehicle {
    protected int speed;
    protected double fuelLevel;

    public Vehicle(int speed, double fuelLevel) {
        this.speed = speed;
        this.fuelLevel = fuelLevel;
    }

    public abstract void start(); // Abstract method for polymorphism

    public void setSpeed(int speed) { // Data coupling
        this.speed = speed;
    }

    // Method Overloading (Polymorphism)
    public void refuel(double amount) {
        fuelLevel += amount;
        System.out.println("Refueled: " + amount + " liters. Current fuel level: " + fuelLevel);
    }

    public void refuel(int percentage) {
        fuelLevel += (fuelLevel * percentage) / 100;
        System.out.println("Refueled: " + percentage + "% of current fuel. New fuel level: " + fuelLevel);
    }
}
