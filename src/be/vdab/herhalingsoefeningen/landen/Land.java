package be.vdab.herhalingsoefeningen.landen;

public class Land implements Comparable<Land> {
    private final String code;
    private int aantalInwoners;

    public Land(String code, int aantalInwoners) {
        this.code = code;
        this.aantalInwoners = aantalInwoners;
    }

    public String getCode() {
        return code;
    }

    public int getAantalInwoners() {
        return aantalInwoners;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Land)) {
            return false;
        }
        return code.equalsIgnoreCase(((Land) object).code);
    }

    @Override
    public int hashCode() {
        return code.toUpperCase().hashCode();
    }

    @Override
    public int compareTo(Land land) {
        return code.compareTo(land.code);
    }
}
