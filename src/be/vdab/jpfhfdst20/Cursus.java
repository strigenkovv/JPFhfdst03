package be.vdab.jpfhfdst20;

public class Cursus implements Comparable<Cursus> {

    private final int nummer;
    private final String naam;
    private final int prijs;

    public Cursus(int nummer, String naam, int prijs) {
        this.nummer = nummer;
        this.naam = naam;
        this.prijs = prijs;
    }

    public int getNummer() {
        return nummer;
    }

    public int getPrijs() {
        return prijs;
    }

    @Override
    public int compareTo(Cursus other) {
        return Integer.compare(nummer, other.nummer);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Cursus other)) {
            return false;
        }
        return nummer == other.nummer;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(nummer);
    }

    @Override
    public String toString() {
        return nummer + " - " + naam + " - €" + prijs;
    }
}
