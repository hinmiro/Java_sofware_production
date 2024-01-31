package module03.VechichleInterfaces;

public class VehicleDemo {

    public static void main(String[] args) {
        Car car = new Car("Car", "Petrol", "Red");
        Bus bus = new Bus("Bus", "Diesel", 45);
        Motorcycle mc = new Motorcycle("Motorcycle", "Gasoline", "Black");
        ElectricCar tesla = new ElectricCar("Car", "Electric", "Purple");
        ElectricMotorcycle em = new ElectricMotorcycle("Motorcycle", "Electric", "Blue");
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
        tesla.start();
        tesla.stop();
        System.out.println(tesla.getInfo());
        System.out.println("\n");
        em.charge();
        car.charge();
    }
}