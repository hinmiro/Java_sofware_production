package module05;

import java.util.ArrayList;
import java.util.Random;

public class ArrayClass {
    ArrayList<String> list = new ArrayList<>();

    public ArrayClass() {
        this.list = list;
    }


    public synchronized void addList(String s) {
        System.out.println("Thread " + Thread.currentThread().getId() + " is trying to add to the list");
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        list.add(s);
        System.out.println("Thread " + Thread.currentThread().getId() + " has finished adding to the list");

    }


    public synchronized void removeFromList(String s) {
        System.out.println("Thread " + Thread.currentThread().getId() + " is trying to remove from the list");
        try {
            Thread.sleep(999);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (list.contains(s)) {
            list.remove(s);
        } else {
            System.out.println("No " + s + "element found on list.");
        }
    }

    public static void main(String[] args) {
        ArrayClass arraylist = new ArrayClass();
        Thread mat = new Thread(new User(arraylist));
        Thread timon = new Thread(new User(arraylist));
        Thread sam = new Thread(new User(arraylist));
        mat.start();
        timon.start();
        sam.start();
        try {
            mat.join(); timon.join(); sam.join();
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class User implements Runnable {
    static Random rand = new Random();
    private ArrayClass arrayClass;

    public User(ArrayClass a) {
        this.arrayClass = a;
    }

    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            this.arrayClass.addList(String.valueOf(rand.nextInt(15)+1));

        }
        this.arrayClass.removeFromList("5");
    }
}
