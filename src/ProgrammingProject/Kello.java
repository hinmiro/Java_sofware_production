package ProgrammingProject;
public class Kello {
    private long time;
    private static Kello INSTANCE = null;
    private Kello() {}

    public static Kello getINSTANCE() {
        if (INSTANCE == null) {
            INSTANCE = new Kello();
        }
        return INSTANCE;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long newTime) {
        time = newTime;
    }
}
