package module01;

import java.util.Scanner;


public class SubarraySum {
    static Scanner scanner = new Scanner(System.in);

    static int maxSum = Integer.MIN_VALUE;
    static int currentSum, start, end, start2;

    public static void main(String[] args) {

        System.out.print("Enter size of an array: ");
        int size = Integer.parseInt(scanner.nextLine());

        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.printf("Enter integer %s: ", i + 1);
            numbers[i] = scanner.nextInt();
        }


        for (int i = 0; i < size; i++) {
            currentSum += numbers[i];

            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = start2;
                end = i;
            }

            if (currentSum < 0) {
                currentSum = 0;
                start2 = i + 1;
            }
        }

        System.out.printf("Maximum sum: %s\n", maxSum);
        System.out.printf("Integers: %s-%s", start + 1, end + 1);
    }
}
