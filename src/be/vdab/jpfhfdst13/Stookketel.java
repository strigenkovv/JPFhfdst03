package be.vdab.jpfhfdst13;

public class Stookketel implements Vervuiler {
    private float coNorm;

    public Stookketel(float coNorm) {
        setCoNorm(coNorm);
    }

    public float getCoNorm() {
        return coNorm;
    }

    public void setCoNorm(float coNorm) {
        if (coNorm >= 0) {
            this.coNorm = coNorm;
        }
    }

    @Override
    public double berekenVervuiling() {
        return coNorm * 100;
    }
}
