package module01;
import java.util.Scanner;
public class Triangles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;

        System.out.println("Type the first side of the triangle: ");
        a = Integer.parseInt(scanner.nextLine());

        System.out.println("Type the second side of the triangle: ");
        b = Integer.parseInt(scanner.nextLine());

        System.out.printf("Hypotenuse of the triangle is: %.2f", (Math.sqrt(Math.pow(a, 2)+(Math.pow(b, 2)))));
    }
}
