package ProgrammingProject;

import eduni.distributions.*;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Saapumisprosessi {

    private Pascal satunnaislukugeneraattori = new Pascal(0.32, 4);
    private Tapahtuma.TapahtumanTyyppi type = Tapahtuma.TapahtumanTyyppi.SAAPUMINEN;

    public Saapumisprosessi() {

    }

    public void lisaaTapahtuma(Tapahtumalista lista) {
        lista.lisaaTapahtuma(new Tapahtuma("Event", type));
    }

    public static void main(String[] args) {
        Kello KELLO = Kello.getINSTANCE();
        Saapumisprosessi saapumisprosessi = new Saapumisprosessi();
        Tapahtumalista tapahtumalista = new Tapahtumalista();
        for (int i = 0; i < 10; i++) {
            saapumisprosessi.lisaaTapahtuma(tapahtumalista);
            KELLO.setTime(saapumisprosessi.satunnaislukugeneraattori.sample());
            System.out.printf("Clock set to: %s\n",KELLO.getTime());
        }
        System.out.println("\n");
        while (!tapahtumalista.isEmpty()) {
            Tapahtuma t = tapahtumalista.seuraava();
            System.out.printf("Name: %s\nTime: %s\nType: %s\n-------------\n", t.getName(), t.getTime(), t.getType());
        }
    }
}
