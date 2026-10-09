package be.vdab.personeel;

import java.math.BigDecimal;

import be.vdab.util.WerknemerException;
import be.vdab.util.WerknemersDatum;

public class Arbeider extends Werknemer {
    private BigDecimal uurloon;

    public Arbeider(int personeelsnummer,
                    String naam,
                    Geslacht geslacht,
                    WerknemersDatum datumInDienst,
                    BigDecimal uurloon) throws WerknemerException {
        super(personeelsnummer, naam, geslacht, datumInDienst);

        setUurloon(uurloon);
    }


    public BigDecimal getUurloon() {
        return uurloon;
    }

    public void setUurloon(BigDecimal aUurloon) throws WerknemerException {

        if (uurloon == null
            || uurloon.compareTo(BigDecimal.valueOf(9.76)) < 0) {
            throw new WerknemerException(
                    "Het uurloon moet minstens 9,76 euro zijn."
            );
        }

        uurloon = aUurloon;
    }

    @Override
    public String toString() {
        return super.toString() + "\t" + uurloon;
    }
}
