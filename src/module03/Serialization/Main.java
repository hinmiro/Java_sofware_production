package module03.Serialization;

import java.io.*;

public class Main {
    private static final String FILENAME = "serializeTest.dat";
    public static void main(String[] args) {
        Student st1 = new Student("Tom", 23);
        Course course = new Course("QWERTY", "Programming", "Obama");
        Enrollment enrollSt1 = new Enrollment("03.02.2023", st1, course);
        File f = new File(FILENAME);

        try (
                FileOutputStream outputStream = new FileOutputStream(FILENAME);
                ObjectOutputStream objects = new ObjectOutputStream(outputStream)) {
            objects.writeObject(enrollSt1);
        } catch (Exception e) {
            System.err.print(e);
        }

        if (f.exists() && f.isFile()) {
            try (
                    FileInputStream inputStream = new FileInputStream(FILENAME);
                    ObjectInputStream objects = new ObjectInputStream(inputStream)) {
                    enrollSt1 = (Enrollment) objects.readObject();
            } catch (Exception e) {
                System.err.print(e);
            }
        }

        System.out.println(enrollSt1.getDate());
    }
}
