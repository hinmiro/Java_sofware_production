package module05;


public class MultipleThreads {

    public static void main(String[] args) {
        Runnable thread1 = new NumCounter(true);
        Runnable thread2 = new NumCounter(false);
        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        t1.start();
        t2.start();

    }
}

class NumCounter implements Runnable {
    boolean even;

    public NumCounter(boolean even) {
        this.even = even;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 120; i++) {
                switch (i % 2) {
                    case 0:
                        if (even)
                            System.out.println("Even thread: " + i);
                        break;
                    case 1:
                        if (!even)
                            System.out.println("Odd thread: " + i);
                }
                Thread.sleep(25);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
            return;
        }
    }
}