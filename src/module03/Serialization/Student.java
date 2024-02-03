package module03.Serialization;

import java.io.Serializable;

public class Student implements Serializable {
    private static int idIncrement;
    private int id;
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = idIncrement++;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getId() {
        return this.id;
    }

}
