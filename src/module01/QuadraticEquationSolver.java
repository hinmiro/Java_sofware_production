package module01;

import java.util.Scanner;

public class QuadraticEquationSolver {
    static int a, b, c;
    static double x1, x2;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Type number for a char: ");
        a = Integer.parseInt(scanner.nextLine());
        System.out.print("Type number for b char: ");
        b = Integer.parseInt(scanner.nextLine());
        System.out.print("Type number for c char: ");
        c = Integer.parseInt(scanner.nextLine());

        x1 = (-b + (Math.sqrt(Math.pow(b, 2) - 4 * a * c))) / 2 * a;
        x2= (-b - (Math.sqrt(Math.pow(b, 2) - 4 * a * c))) / 2 * a;
        double d = Math.pow(b, 2) - 4 * a * c;


        if (d > 0) {
            System.out.printf("Roots are %s and %s", (int)x1, (int)x2);
        }
        else {
            System.out.println("No real roots");
        }

    }
}
