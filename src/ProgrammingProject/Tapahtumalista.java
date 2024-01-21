package ProgrammingProject;

import java.util.PriorityQueue;

public class Tapahtumalista {

    private static PriorityQueue<Tapahtuma> lista = new PriorityQueue<>();

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
        tapahtumat.lisaaTapahtuma(new Tapahtuma("Event 1"));
        tapahtumat.lisaaTapahtuma(new Tapahtuma("Event 2"));
        tapahtumat.lisaaTapahtuma(new Tapahtuma("Event 3"));
        tapahtumat.lisaaTapahtuma(new Tapahtuma("Event 4"));
        tapahtumat.lisaaTapahtuma(new Tapahtuma("Event 5"));

        while (!tapahtumat.isEmpty()) {
            Tapahtuma seuraava = tapahtumat.seuraava();
            System.out.printf("Seuraava tapahtuma: %s, tapahtuman aika: %s\n", seuraava.getName(), seuraava.getTime());
        }
    }
}

