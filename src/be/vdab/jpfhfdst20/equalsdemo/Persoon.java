package be.vdab.jpfhfdst20.equalsdemo;

public class Persoon {
    private final String naam;

    public Persoon(String naam) {
        this.naam = naam;
    }

    @Override
    public String toString() {
        return naam;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Persoon other)) {
            return false;
        }
        return naam.equals(other.naam);
    }

    @Override
    public int hashCode() {
        return naam.hashCode();
    }
}
