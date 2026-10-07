package be.vdab.herhalingsoefeningen.kasbon;

import java.math.BigDecimal;

public abstract class Kasbon {
    protected final BigDecimal beginwaarde;
    protected final int jaren;
    protected final BigDecimal intrest;

    public Kasbon(BigDecimal beginwaarde,
                  int jaren,
                  BigDecimal intrest) {
        this.beginwaarde = beginwaarde;
        this.jaren = jaren;
        this.intrest = intrest;
    }

    public abstract BigDecimal getEindWaarde();
}
