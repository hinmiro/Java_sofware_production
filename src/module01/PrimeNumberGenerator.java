package module01;

import java.util.Scanner;

public class PrimeNumberGenerator {
    static int start, end;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Type in starting point of prime generator: ");
        start = Integer.parseInt(scanner.nextLine());
        System.out.print("Type in ending point of prime generator: ");
        end = Integer.parseInt(scanner.nextLine());


        while (start <= end) {

            if (start > 2) {
                boolean isPrime = true;
                for (int i = 2; i <= start; i++) {
                    if (start % i == 0 && start != i) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.printf("%s is prime\n", start);
                }
            }
            start++;
        }
    }
}

