package module03.VechichleInterfaces;

public class Car extends AbstractVehicle {
    private String color;

    public Car(String type, String fuel, String color) {
        super(type, fuel);
        this.color = color;

    }

    public String getInfo() {
        return String.format("Type: %s\nFuel: %s\nColor: %s", this.type, this.fuel, this.color);
    }
}