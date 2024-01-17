package module01;

import java.util.Scanner;

public class obsolete_measures {

    static int gram, leiviskä, naula;
    static double luoti;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Weight (g): ");
        gram = Integer.parseInt(scanner.nextLine());

        luoti = gram / 13.28;
        naula = (int) luoti / 32;
        leiviskä = naula / 20;

        System.out.printf("%s grams is %s leiviskä, %s naula, and %.2f luoti.", gram, leiviskä,
                (naula - (leiviskä * 20)), (luoti - (naula * 32)));

    }
}
