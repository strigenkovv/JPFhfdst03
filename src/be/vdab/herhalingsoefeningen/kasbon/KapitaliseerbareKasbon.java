package be.vdab.herhalingsoefeningen.kasbon;

import java.math.BigDecimal;

public class KapitaliseerbareKasbon extends Kasbon {

    public KapitaliseerbareKasbon(BigDecimal beginwaarde, int jaren, BigDecimal intrest) {
        super(beginwaarde, jaren, intrest);
    }

    @Override
    public BigDecimal getEindWaarde() {
        var eindWaarde = beginwaarde;

        for (int jaar = 0; jaar < jaren; jaar++) {
            var intrestDitJaar = eindWaarde.multiply(intrest);
            eindWaarde = eindWaarde.add(intrestDitJaar);
        }

        return eindWaarde;
    }

}
