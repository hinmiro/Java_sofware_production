package module03;

public class Motorcycle implements Vehicle {
    private String type, fuel, color;

    public Motorcycle(String type, String fuel, String color) {
        this.type = type;
        this.fuel = fuel;
        this.color = color;
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
        return String.format("Type: %s\nFuel: %s\nColor: %s", this.type, this.fuel, this.color);
    }
}
