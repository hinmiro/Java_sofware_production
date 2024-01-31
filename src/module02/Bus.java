package module02;

import java.util.LinkedList;

public class Bus extends Car3 {
    private static int passangerId = 1;
    private LinkedList<Passenger> passengers = new LinkedList<>();
    public Bus(String typeName) {
        super(typeName);
    }

    public void passangerEnter() {
        passengers.add(new Passenger("Robert", passangerId++));

    }

    public void passangerExit() {
        Passenger obj = passengers.poll();
        System.out.printf("\n%s, id: %s has left the bus.", obj.getName(), obj.getId());
    }

    public static void main(String[] args) {
        Bus bus = new Bus("Small bus");
        bus.passangerEnter();
        bus.passangerEnter();
        bus.passangerEnter();
        bus.passangerEnter();
        bus.passangerExit();
        bus.passangerExit();

    }
}

