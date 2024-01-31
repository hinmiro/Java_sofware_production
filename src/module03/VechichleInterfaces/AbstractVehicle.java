package module03.VechichleInterfaces;

public abstract class AbstractVehicle implements Vehicle, ElectricVehicle {
    String type, fuel;
    public AbstractVehicle(String type, String fuel) {
        this.type = type;
        this.fuel = fuel;
    }



    public void start() {
        System.out.printf("%s is starting...\n", this.type);
    }

    public void stop() {
        System.out.printf("%s is stopping...\n", this.type);
    }

    public void charge() {
        System.out.println("You cant charge this vehicle");
    }

    @Override
    public String getInfo() {
        return String.format("Type: %s\nFuel: %s\n", this.type, this.fuel);
    }
    public String efficiencyCalculator(double distance, double consumption){
        double mpg = (distance*0.63)/(consumption*0.26);
        return String.format("Fuel consumption for this vehicle is %.2f mpg or %.2f l/km", mpg, (distance/consumption));
    }
}
