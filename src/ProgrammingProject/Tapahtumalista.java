package ProgrammingProject;

import java.util.Scanner;
import java.util.PriorityQueue;

public class Tapahtumalista {
    private static final Scanner scanner = new Scanner(System.in);
    private static final PriorityQueue<Tapahtuma> lista = new PriorityQueue<>();

    public void lisaaTapahtuma(Tapahtuma tapahtuma) {
        lista.add(tapahtuma);
    }

    public Tapahtuma seuraava() {
        return lista.poll();
    }

    public boolean isEmpty() {
        return lista.isEmpty();
    }


    public static void main(String[] args) {
        Tapahtumalista tapahtumat = new Tapahtumalista();
        boolean onGoing = true;
        int userInput;

        while (onGoing) {
            System.out.println("1 Lisää listaan tapahtuma\n2 Poista seuraava tapahtuma listasta\n3 Tulosta lista");
            userInput = Integer.parseInt(scanner.nextLine());
            if (userInput == 1) {
                tapahtumat.lisaaTapahtuma(new Tapahtuma("Event", Tapahtuma.TapahtumanTyyppi.SAAPUMINEN));
            } else if (userInput == 2) {
                Tapahtuma seuraava = tapahtumat.seuraava();
                seuraava.setType(Tapahtuma.TapahtumanTyyppi.POISTUMINEN);
                String type = String.valueOf(seuraava.getType());
                System.out.printf("Seuraava tapahtuma: %s\nTapahtuman aika: %s\nTapahtuman tyyppi: %s\n\n",
                        seuraava.getName(), seuraava.getTime(), type);
            } else if (userInput == 3) {
                while (!tapahtumat.isEmpty()) {
                    Tapahtuma seuraava = tapahtumat.seuraava();
                    System.out.printf("Seuraava tapahtuma: %s\nTapahtuman aika: %s\nTapahtuman tyyppi: %s\n\n",
                            seuraava.getName(), seuraava.getTime(), seuraava.getType());
                }
                onGoing = false;
            }
        }


    }
}

