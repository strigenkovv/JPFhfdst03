package be.vdab.herhalingsoefeningen.lokaal;

public class Trainer {
    private final String voornaam;
    private final String familienaam;

    public Trainer(String voornaam, String familienaam) {
        this.voornaam = voornaam;
        this.familienaam = familienaam;
    }

    @Override
    public String toString() {
        return voornaam + " " + familienaam;
    }
}
