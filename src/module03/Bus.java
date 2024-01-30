package module03;

public class Bus implements Vehicle {
    private String type, fuel;
    private int capacity;

    public Bus(String type, String fuel, int capacity) {
        this.type = type;
        this.fuel = fuel;
        this.capacity = capacity;
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
        return String.format("Type: %s\nFuel: %s\nCapacity: %s", this.type, this.fuel, this.capacity);
    }
}
