package module03.VechichleInterfaces;

public class Motorcycle extends AbstractVehicle {
    private String color;

    public Motorcycle(String type, String fuel, String color) {
        super(type, fuel);
        this.color = color;
    }

    @Override
    public void charge(){
        System.out.println("You cant charge this vehicle");
    }
    public String getInfo() {
        return String.format("Type: %s\nFuel: %s\nColor: %s", this.type, this.fuel, this.color);
    }
}
