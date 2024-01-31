package module03;

import module03.VechichleInterfaces.Vehicle;

public abstract class AbstractVehicle implements Vehicle {
    String type, fuel;

    public AbstractVehicle(String type, String fuel) {
        this.type = type;
        this.fuel = fuel;
    }


    @Override
    public void start() {
        System.out.printf("%s is starting...\n", this.type);
    }

    @Override
    public void stop() {
        System.out.printf("%s is stopping...\n", this.type);
    }

    @Override
    public String getInfo() {
        return String.format("Type: %s\nFuel: %s\nColor: %s\n");
    }
}
