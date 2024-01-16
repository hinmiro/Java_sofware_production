package module01;
import java.util.Scanner;

public class Fahrenheit_to_celsius {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fahrenheit;

        System.out.println("Enter tempereture as fahrenheit: ");
        fahrenheit = Double.parseDouble(scanner.nextLine());

        System.out.printf("Temperature is %.1f degrees in celsius", (fahrenheit - 32) * 5 / 9);
    }
}
