package ProgrammingProject;

public class Asiakas {

    private static int latestId = 1;
    private int id;
    private long start, end;

    public Asiakas() {
        this.id = latestId++;
        this.start = setter();
    }

    long getter() {
        return System.currentTimeMillis();
    }

    long setter() {
        return System.currentTimeMillis();
    }

    void kulutettuAika() {
        this.end = getter();
        System.out.printf("Client %s used time %s\n", this.id, (this.end - this.start));
    }

    public static void main(String[] args) {
        Asiakas asiakas = new Asiakas();
        Asiakas asiakas1 = new Asiakas();
        asiakas.kulutettuAika();
        asiakas1.kulutettuAika();
    }

}
