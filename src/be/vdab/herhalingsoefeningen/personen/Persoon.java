package be.vdab.herhalingsoefeningen.personen;

import java.io.Serializable;

public class Persoon implements Serializable, Comparable<Persoon> {

    private static final long serialVersionUID = 1L;

    private final String voornaam;
    private final String familienaam;

    public Persoon(String voornaam, String familienaam) {
        this.voornaam = voornaam;
        this.familienaam = familienaam;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public String getFamilienaam() {
        return familienaam;
    }

    public String getNaam() {
        return voornaam + " " + familienaam;
    }

    @Override
    public int compareTo(Persoon ander) {
        var familienaamVergelijking = familienaam.compareTo(ander.familienaam);
        if (familienaamVergelijking == 0) {
            return voornaam.compareTo(ander.voornaam);
        }
        return familienaamVergelijking;
    }
}
