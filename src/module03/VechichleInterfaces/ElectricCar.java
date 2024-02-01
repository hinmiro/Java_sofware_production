package module03.VechichleInterfaces;

public class ElectricCar extends AbstractVehicle{
    private String color;

    public ElectricCar(String type, String fuel, String color) {
        super(type, fuel);
        this.color = color;
    }

    public String getInfo() {
        return String.format("Type: %s\nFuel: %s\nColor: %s", this.type, this.fuel, this.color);
    }


    @Override
    public String efficiencyCalculator(double distance, double consumption) {
        return String.format("Electric consumption is %.2f kW/km", distance/consumption);
    }
}
