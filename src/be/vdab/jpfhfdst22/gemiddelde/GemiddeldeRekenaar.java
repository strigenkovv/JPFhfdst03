package be.vdab.jpfhfdst22.gemiddelde;

public class GemiddeldeRekenaar implements Runnable {

    private final double[] getallen;
    private final int van;
    private final int tot;

    private double gemiddelde;

    public GemiddeldeRekenaar(double[] getallen, int van, int tot) {
        this.getallen = getallen;
        this.van = van;
        this.tot = tot;
    }

    @Override
    public void run() {
        double som = 0;

        // Calculate the sum of the assigned array section.
        for (int i = van; i < tot; i++) {
            som += getallen[i];
        }

        gemiddelde = som / (tot - van);
    }

    public double getGemiddelde() {
        return gemiddelde;
    }
}