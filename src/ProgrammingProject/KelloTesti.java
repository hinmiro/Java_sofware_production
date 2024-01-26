package ProgrammingProject;

public class KelloTesti {
    public static void main(String[] args) {
        Kello KELLO = Kello.getINSTANCE();
        KELLO.setTime(6);
        System.out.println(KELLO.getTime());
    }
}
