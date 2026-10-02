package be.vdab.herhalingsoefeningen;

import java.math.BigDecimal;

public class GoedeDoel {
    private final String naam;
    private BigDecimal totaalGestort;

    public GoedeDoel(String naam) {
        this.naam = naam;
        this.totaalGestort = BigDecimal.ZERO;
    }

    public void storten(BigDecimal bedrag) {
        totaalGestort = totaalGestort.add(bedrag);
    }

    public String getNaam() {
        return naam;
    }

    public BigDecimal getTotaalGestort() {
        return totaalGestort;
    }
}
