// Main.java - Driver class
public class Main {
    public static void main(String[] args) {
        Car car = new Car(100, 50);
        car.start();
        car.refuel(20);
        car.refuel(10);
        car.updateVehicleStatus("Car is in good condition");

        Motorcycle motorcycle = new Motorcycle(80, 15);
        motorcycle.start();

        ElectricCar electricCar = new ElectricCar(120, 0, 50);
        electricCar.start();
        electricCar.chargeBattery();
        System.out.println("Battery Level: " + electricCar.getBatteryLevel() + "%");
    }
}
