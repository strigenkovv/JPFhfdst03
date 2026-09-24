package be.vdab.jpfhfdst10;

public class Vrachtwagen  extends Voertuig {
    private float maxLading = 10_000;

    public Vrachtwagen() {
        super();
    }

    public Vrachtwagen(String polishouder, float kostprijs, int pk,
                       float gemVerbruik, String nummerplaat,
                       float maxLading) {
        super(polishouder, kostprijs, pk, gemVerbruik, nummerplaat);
        setMaxLading(maxLading);
    }

    public float getMaxLading() {
        return maxLading;
    }

    public void setMaxLading(float maxLading) {
        if (maxLading >= 0) {
            this.maxLading = maxLading;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ";" + maxLading;
    }

    @Override
    public void toon() {
        IO.println("--- Vrachtwagen ---");
        super.toon();
        IO.println("Maximale lading: " + maxLading + " kg");
    }

    @Override
    public double getKyotoScore() {
        if (maxLading == 0) {
            return 0;
        }

        double ladingInTon = maxLading / 1000.0;
        return getGemVerbruik() * getPk() / ladingInTon;
    }
}