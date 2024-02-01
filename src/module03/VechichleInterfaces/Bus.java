package module03.VechichleInterfaces;

public class Bus extends AbstractVehicle {
    private int capacity;

    public Bus(String type, String fuel, int capacity) {
        super(type, fuel);
        this.capacity = capacity;
    }

    @Override
    public String getInfo() {
        return String.format("Type: %s\nFuel: %s\nCapacity: %s", this.type, this.fuel, this.capacity);
    }

    @Override
    public void charge(){
        System.out.println("You cant charge this vehicle");
    }
}
