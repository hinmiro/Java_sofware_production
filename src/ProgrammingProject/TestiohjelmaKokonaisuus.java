package ProgrammingProject;

public class TestiohjelmaKokonaisuus {

    public static void main(String[] args) {
        Kello KELLO = Kello.getINSTANCE();
        Saapumisprosessi saapumisprosessi = new Saapumisprosessi();
        Tapahtumalista tapahtumalista = new Tapahtumalista();
        PalveluPiste pp = new PalveluPiste();
        for (int i = 0; i < 100; i++) {
            saapumisprosessi.lisaaTapahtuma(tapahtumalista);
        }
        while (!tapahtumalista.isEmpty()) {
            Tapahtuma t = tapahtumalista.seuraava();
            if (t.getType() == Tapahtuma.TapahtumanTyyppi.SAAPUMINEN) {
                Asiakas a = new Asiakas();
                a.setTime(t.getTime());
                pp.lisaaJonoon(a);
            }
        }
        long thisTime = KELLO.getTime();
        KELLO.setTime(thisTime += 5);

        pp.palvele();
        System.out.println("\n");
        System.out.printf("Keskimääräinen palvelupisteellä kulutettu aika: %d", pp.getAverage());
    }
}
