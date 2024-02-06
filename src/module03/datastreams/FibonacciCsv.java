package module03.datastreams;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;

public class FibonacciCsv {
    static ArrayList<BigInteger> sequence = new ArrayList<>();

    public static void main(String[] args) {
        sequence.add(BigInteger.ZERO);
        sequence.add(BigInteger.ONE);
        for (int i = 2; i < 100; i++) {
            BigInteger newFibonacci = sequence.get(i - 1).add(sequence.get(i - 2));
            sequence.add(newFibonacci);
        }
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("fiboNacci.csv"));
            bufferedWriter.write("Fibonacci Sequence");
            bufferedWriter.newLine();

            for (BigInteger bigInt : sequence) {
                bufferedWriter.write(String.valueOf(bigInt));
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            System.err.print(e);
        }
    }
}
