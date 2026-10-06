package be.vdab.herhalingsoefeningen;

import java.util.Objects;

public class Persoon {
    private final String voornaam;

    private final String familienaam;

    public Persoon(String aVoornaam, String aFamilienaam) {
        voornaam = aVoornaam;
        familienaam = aFamilienaam;
    }

    public String getNaam() {
        return voornaam + " " + familienaam;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public String getFamilienaam() {
        return familienaam;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (!(object instanceof Persoon persoon)) {
            return false;
        }

        return getVoornaam().equals(persoon.getVoornaam())
               && getFamilienaam().equals(persoon.getFamilienaam());
    }

    @Override
    public int hashCode() {
        return Objects.hash(voornaam, familienaam);
    }

    @Override
    public String toString() {
        return voornaam + " " + familienaam;
    }
}
