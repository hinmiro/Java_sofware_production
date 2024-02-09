package module05;

import java.math.BigInteger;
import java.util.ArrayList;

public class ParallelNumberSummation extends Thread {
    private int sumOfAllNums;
    private ArrayList<Integer> nums = new ArrayList<>();
    private final int begin, stop;

    ParallelNumberSummation(ArrayList<Integer> numbers, int start, int stop) {
        this.nums = numbers;
        this.begin = start;
        this.stop = stop;
    }

    @Override
    public void run() {
        for (int i = begin; i <= stop; i++) {
            sumOfAllNums += nums.get(i);
        }
    }

    public int getSum() {
        return sumOfAllNums;
    }
}

class Main {
    static int result;
    static int times = 30000;
    static final private ArrayList<Integer> nums = new ArrayList<>();
    static final private ArrayList<ParallelNumberSummation> threads = new ArrayList<>();

    public static void main(String[] args) {
        for (int i = 1; i <= times; i++) {
            nums.add(i * 10);
        }
        int cores = Runtime.getRuntime().availableProcessors();
        int d = times / cores;
        for (int i = 0; i < cores; i++) {
            int begin = i * d;
            int stop = (i + 1) * d - 1;
            if (i == cores - 1) {
                stop = times - 1;
            }
            threads.add(new ParallelNumberSummation(nums, begin, stop));
        }
        long start = System.nanoTime();
        for (ParallelNumberSummation thread : threads) {
            thread.start();
        }

        for (ParallelNumberSummation thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            result += thread.getSum();
        }
        long finish = System.nanoTime();
        System.out.printf("\nSum of all numbers is: %s\nTime elapsed: %.6f ms", result, (double)(finish-start)/10e6);

    }

}
