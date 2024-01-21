package ProgrammingProject;
import java.util.Random;
public class Tapahtuma implements Comparable<Tapahtuma>{
    private static Random rand = new Random();
    private String name;
    private long time;
    public Tapahtuma(String name){
        int randomTime = rand.nextInt(10000)+1;
        this.name = name;
        this.time = System.currentTimeMillis()+randomTime;
    }
    public String getName() { return name;
    }

    public long getTime() {
        return time;
    }

    public int compareTo(Tapahtuma sec) {
        return Long.compare(this.time, sec.time);
    }
}

