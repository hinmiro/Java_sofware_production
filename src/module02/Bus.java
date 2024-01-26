package module02;

import java.util.LinkedList;

public class Bus extends Car3 {
    private static int passangerId = 1;
    private LinkedList<Passanger> passangers = new LinkedList<>();
    public Bus(String typeName) {
        super(typeName);
    }

    public void passangerEnter() {
        passangers.add(new Passanger("Robert", passangerId++));

    }

    public void passangerExit() {
        Passanger obj = passangers.poll();
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

