package ProgrammingProject;
public class Kello {
    private int time;
    private static Kello INSTANCE = null;
    private Kello() {}

    public static Kello getINSTANCE() {
        if (INSTANCE == null) {
            INSTANCE = new Kello();
        }
        return INSTANCE;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int newTime) {
        time = newTime;
    }
}
