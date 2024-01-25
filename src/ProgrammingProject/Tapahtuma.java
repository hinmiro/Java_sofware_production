package ProgrammingProject;

import java.util.Random;

public class Tapahtuma implements Comparable<Tapahtuma> {
    private static final Random rand = new Random();
    private final String name;
    private final long time;
    private TapahtumanTyyppi type;


    public enum TapahtumanTyyppi {
        SAAPUMINEN,
        POISTUMINEN
    }

    public Tapahtuma(String name, TapahtumanTyyppi type) {
        int randomTime = rand.nextInt(10000) + 1;
        this.name = name;
        this.time = System.currentTimeMillis() + randomTime;
        this.type = type;
    }

    public TapahtumanTyyppi getType() {
        return type;
    }

    public void setType(TapahtumanTyyppi type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public long getTime() {
        return time;
    }

    public int compareTo(Tapahtuma sec) {
        return Long.compare(this.time, sec.time);
    }
}

