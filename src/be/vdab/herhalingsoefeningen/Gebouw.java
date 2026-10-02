package be.vdab.herhalingsoefeningen;

import java.math.BigDecimal;

public class Gebouw implements Kost {

    private final BigDecimal huurprijs;

    public Gebouw(BigDecimal aHuurprijs) {
        huurprijs = aHuurprijs;
    }

    @Override
    public BigDecimal getKost() {
        return huurprijs;
    }

}
