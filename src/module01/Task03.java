package module01;
import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give the first number:");
        int first = Integer.parseInt(scanner.nextLine());

        System.out.print(("Give the second number:"));
        int second = Integer.parseInt(scanner.nextLine());

        System.out.print("Give the third number:");
        int third = Integer.parseInt(scanner.nextLine());

        float sum = first+second+third; //convert to float to get the average

        System.out.printf("\nThe sum of numbers is %s", (first+second+third));

        System.out.printf("\nThe average of numbers is %s", (sum/3)); //average

        System.out.printf("\nThe product of numbers is %s", (first*second*third)); //product
    }
}
