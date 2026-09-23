package be.vdab.jpfhfdst8;

public class Kaart {
    private static final String[] KLEUREN = {
            "harten", "ruiten", "klaveren", "schoppen"
    };

    private static final String[] RANGEN = {
            "2", "3", "4", "5", "6", "7", "8",
            "9", "10", "boer", "vrouw", "heer", "aas"
    };

    private int kleur;
    private int rang;

    public Kaart() {
        kleur = (int) (Math.random() * KLEUREN.length);
        rang = (int) (Math.random() * RANGEN.length);
    }

    public void printKaart() {
        IO.println(KLEUREN[kleur] + " " + RANGEN[rang]);
    }

    public boolean isHogerDan(Kaart andereKaart) {
        if (kleur > andereKaart.kleur) {
            return true;
        }

        if (kleur == andereKaart.kleur && rang > andereKaart.rang) {
            return true;
        }

        return false;
    }
}
