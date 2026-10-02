package be.vdab.herhalingsoefeningen;

public class Politieker extends Persoon {

    PolitiekePartij partij;

    public Politieker(String aVoornaam, String aFamilienaam) {
        super(aVoornaam, aFamilienaam);
    }

    @Override
    public String toString() {
        return getNaam() + " - "
               + partij.getNaam() + " - "
               + partij.getLeden();
    }
}
