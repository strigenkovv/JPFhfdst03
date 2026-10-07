package be.vdab.herhalingsoefeningen.kasbon;

import java.math.BigDecimal;

public class NietKapitaliseerbareKasbon extends Kasbon {

    public NietKapitaliseerbareKasbon(BigDecimal beginwaarde,
                                      int jaren,
                                      BigDecimal intrest) {
        super(beginwaarde, jaren, intrest);
    }

    @Override
    public BigDecimal getEindWaarde() {
        var intrestPerJaar = beginwaarde.multiply(intrest);

        return beginwaarde.add(
                intrestPerJaar.multiply(BigDecimal.valueOf(jaren))
        );
    }
}
