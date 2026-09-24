package be.vdab.jpfhfdst13;

import be.vdab.jpfhfdst13.Voertuig;

public class Personenwagen extends Voertuig implements Vervuiler {
    private int aantalDeuren = 4;
    private int aantalPassagiers = 5;

    public Personenwagen() {
        super();
    }

    public Personenwagen(String polishouder, float kostprijs, int pk,
                         float gemVerbruik, String nummerplaat,
                         int aantalDeuren, int aantalPassagiers) {
        super(polishouder, kostprijs, pk, gemVerbruik, nummerplaat);
        setAantalDeuren(aantalDeuren);
        setAantalPassagiers(aantalPassagiers);
    }

    public int getAantalDeuren() {
        return aantalDeuren;
    }

    public void setAantalDeuren(int aantalDeuren) {
        if (aantalDeuren >= 0) {
            this.aantalDeuren = aantalDeuren;
        }
    }

    public int getAantalPassagiers() {
        return aantalPassagiers;
    }

    public void setAantalPassagiers(int aantalPassagiers) {
        if (aantalPassagiers >= 0) {
            this.aantalPassagiers = aantalPassagiers;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ";" + aantalDeuren + ";" + aantalPassagiers;
    }

    @Override
    public void toon() {
        IO.println("--- Personenwagen ---");
        super.toon();
        IO.println("Aantal deuren: " + aantalDeuren);
        IO.println("Aantal passagiers: " + aantalPassagiers);
    }

    @Override
    public double getKyotoScore() {
        if (aantalPassagiers == 0) {
            return 0;
        }

        return (double) getGemVerbruik() * getPk() / aantalPassagiers;
    }

    @Override
    public double berekenVervuiling() {
        return getKyotoScore() * 5;
    }
}
