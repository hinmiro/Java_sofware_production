package ProgrammingProject;

import java.util.Random;
import java.util.LinkedList;

public class PalveluPiste {
    private int asiakkaat = 0;

    private static LinkedList<Asiakas> jono = new LinkedList<>();
    private static Random rand = new Random();
    private long average;

    public PalveluPiste() {
    }

    void lisaaJonoon(Asiakas a) {
        jono.add(a);
        asiakkaat++;
    }

    void poistaJonosta(Asiakas a) {
        average += a.kulutettuAika();
        System.out.printf("\nAsiakkaan kulutettuaika %s", a.kulutettuAika());
    }

    public void palvele() {
        while (!jono.isEmpty()) {
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

    public long getAverage() {
        return average/asiakkaat;
    }

 /*   public static void main(String[] args) {
        PalveluPiste kassa = new PalveluPiste();
        for (int i = 0; i < 16; i++) {
            kassa.lisaaJonoon(new Asiakas());
        }
        kassa.palvele();
        System.out.printf("\nKeskimääräinen kulutettu aika: %s", kassa.average/16);

    } */
}
