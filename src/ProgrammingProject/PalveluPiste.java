package ProgrammingProject;

import java.util.Random;
import java.util.LinkedList;

public class PalveluPiste {

    private static LinkedList<Asiakas> jono = new LinkedList<>();
    private static Random rand = new Random();
    private String name;
    private long average;

    public PalveluPiste(String name) {
        this.name = name;
    }

    void lisaaJonoon(Asiakas a) {
        jono.add(a);
    }

    void poistaJonosta(Asiakas a) {
            average += a.kulutettuAika();
            System.out.printf("\nAsiakkaan kulutettuaika %s", a.kulutettuAika());
    }

    void palvele() {
        while(!jono.isEmpty()) {
            Asiakas asiakas = jono.poll();
            if (asiakas != null) {
                int sleepTime = rand.nextInt(1000);
                try {
                    Thread.sleep(sleepTime);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                poistaJonosta(asiakas);
            }
        }
    }

    public static void main(String[] args) {
        PalveluPiste kassa = new PalveluPiste("Lidl kassa");
        for (int i = 0; i < 16; i++) {
            kassa.lisaaJonoon(new Asiakas());
        }
        kassa.palvele();
        System.out.printf("\nKeskimääräinen kulutettu aika: %s", kassa.average/16);

    }
}
