package module01;
import java.util.Scanner;

public class RemovingDuplicates {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter size of an array: ");
        int[] numbers = new int[scanner.nextInt()];

        System.out.println("Enter integers to array:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("Enter integer %s: ", i + 1);
            numbers[i] = scanner.nextInt();
        }

        int[] newNumbers = new int[numbers.length];
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            boolean isDuplicate = false;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                newNumbers[index++] = numbers[i];
            }
        }

        for (int num : newNumbers) {
            System.out.print(num);
        }
    }
}
