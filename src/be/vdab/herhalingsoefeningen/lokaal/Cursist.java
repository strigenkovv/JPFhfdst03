package be.vdab.herhalingsoefeningen.lokaal;

public class Cursist {
    private final String voornaam;
    private final String familienaam;
    private final Traject traject;

    public Cursist(String voornaam, String familienaam, Traject traject) {
        this.voornaam = voornaam;
        this.familienaam = familienaam;
        this.traject = traject;
    }

    @Override
    public String toString() {
        return voornaam + " " + familienaam
               + " volgt " + traject.getNaam();
    }
}
