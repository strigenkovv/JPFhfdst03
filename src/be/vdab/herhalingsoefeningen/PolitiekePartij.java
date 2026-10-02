package be.vdab.herhalingsoefeningen;

public class PolitiekePartij {
    private final String naam;

    private final  int leden;


    public PolitiekePartij(String aNaam, int aLeden) {
        naam = aNaam;
        leden = aLeden;
    }

    public String getNaam() {
        return naam;
    }

    public int getLeden() {
        return leden;
    }
}
