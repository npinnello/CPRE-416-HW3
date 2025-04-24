// ElectricCar.java
public class ElectricCar extends Vehicle implements ElectricVehicle {
    private int batteryLevel;

    public ElectricCar(int speed, double fuelLevel, int batteryLevel) {
        super(speed, fuelLevel);
        this.batteryLevel = batteryLevel;
    }

    @Override
    public void start() {
        System.out.println("Electric Car is starting...");
    }

    @Override
    public void chargeBattery() {
        batteryLevel = 100;
        System.out.println("Battery fully charged.");
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }
}
