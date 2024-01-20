package ProgrammingProject;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;

public class Asiakas {

    private static int latestId = 1;
    private int id;
    private long start, end;

    public Asiakas() {
        this.id = latestId++;
        this.start = setter();

    }

    long getter() {
        return System.currentTimeMillis();
    }

    long setter() {
        return System.currentTimeMillis();
    }

    public long kulutettuAika() {
        this.end = getter();
        return this.end - this.start;
    }

    public static void main(String[] args) {
        int userInput = 0;

        Scanner scanner = new Scanner(System.in);
        LinkedList<Object> jono = new LinkedList<Object>();
        while (true) {
            System.out.println("Lisää jonoon (1)\nPoista jonosta(2)\nLopeta(3)");
            userInput = Integer.parseInt(scanner.nextLine());

            if (userInput == 1) {
                Asiakas asiakas = new Asiakas();
                jono.add(asiakas);
            }

            else if (userInput == 2) {
                Object obj = jono.poll();

                Asiakas asiakas = (Asiakas) obj;
                long time = asiakas.kulutettuAika();
                System.out.printf("\nKulutettu aika %s\n", time);

            }

            else if (userInput == 3) {

                break;
            }
        }
    }

}
