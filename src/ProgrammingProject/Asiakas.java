package ProgrammingProject;

public class Asiakas {

    private static int latestId = 1;
    private int id;
    private long start, end;

    public Asiakas() {
        this.id = latestId++;
    }

    long getTime() {
        return System.currentTimeMillis();
    }

    public void setTime(long time) {
        start = time;
    }

    public long kulutettuAika() {
        this.end = getTime();
        return this.end - this.start;
    }
}
