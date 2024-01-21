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

    public long kulutettuAika() {
        this.end = getter();
        return this.end - this.start;
    }
}
