package be.vdab.herhalingsoefeningen;

public class Breuk {
    private final int teller;
    private final int noemer;

    public Breuk(int teller, int noemer) {

        if (noemer == 0) {
            throw new IllegalArgumentException( "De noemer mag niet nul zijn.");
        }

        this.teller = teller;
        this.noemer = noemer;
    }

    @Override
    public String toString() {
        return teller + "/" + noemer;
    }
}
