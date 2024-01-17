package module01;
import java.util.Scanner;

public class BinaryValues {
    static int decimal;
    static String binary;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Type in binary to convert it to number: ");
        binary = scanner.nextLine();
        decimal = Integer.parseInt(binary, 2);
        System.out.printf("%s binary is %s", binary, decimal);
    }

}
