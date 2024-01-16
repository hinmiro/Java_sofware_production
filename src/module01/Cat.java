package module01;

public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public void meow() {
        System.out.println("The cat named " + name + " says: Meow!");
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Whiskers");
        Cat cat2 = new Cat("Rex");
        for (int i = 1; i <= 2; i++) {
            cat.meow();
        }
        cat2.meow();
        cat.meow();
    }
}
