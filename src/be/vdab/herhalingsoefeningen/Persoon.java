package be.vdab.herhalingsoefeningen;

public class Persoon {
    private final String voornaam;

    private final  String familienaam;

    public Persoon(String aVoornaam, String aFamilienaam) {
        voornaam = aVoornaam;
        familienaam = aFamilienaam;
    }

    public String getNaam(){
        return voornaam + " " + familienaam;
    }


}
