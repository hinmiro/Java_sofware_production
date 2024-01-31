package module03.VechichleInterfaces;

public class VehicleDemo {

    public static void main(String[] args) {
        Car car = new Car("Car", "Petrol", "Red");
        Bus bus = new Bus("Bus", "Diesel", 45);
        Motorcycle mc = new Motorcycle("Motorcycle", "Gasoline", "Black");
        car.start();
        car.stop();
        System.out.println(car.getInfo());
        System.out.println("\n");
        bus.start();
        bus.stop();
        System.out.println(bus.getInfo());
        System.out.println("\n");
        mc.start();
        mc.stop();
        System.out.println(mc.getInfo());
    }
}