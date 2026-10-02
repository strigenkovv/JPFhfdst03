package be.vdab.herhalingsoefeningen;

import java.math.BigDecimal;

public class Instructeur implements Kost, Opbrengst{

    private final BigDecimal maandwedde;
    private final BigDecimal uurPrijsPerLes;
    private final int aantalUrenLesAanWerknemers;

    public Instructeur(BigDecimal aMaandwedde, BigDecimal aUurPrijsPerLes, int aAantalUrenLesAanWerknemers) {
        maandwedde = aMaandwedde;
        uurPrijsPerLes = aUurPrijsPerLes;
        aantalUrenLesAanWerknemers = aAantalUrenLesAanWerknemers;
    }


    @Override
    public BigDecimal getKost() {
        return maandwedde;
    }

    @Override
    public BigDecimal getOpbrengst() {
        return uurPrijsPerLes.multiply(BigDecimal.valueOf(aantalUrenLesAanWerknemers));
    }
}
