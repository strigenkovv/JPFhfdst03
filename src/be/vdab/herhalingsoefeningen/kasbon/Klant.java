package be.vdab.herhalingsoefeningen.kasbon;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Klant {

    private final List<Kasbon> kasbons = new ArrayList<>();

    public void add(Kasbon kasbon) {
        kasbons.add(kasbon);
    }

    public BigDecimal getEindWaarde() {
        var totaal = BigDecimal.ZERO;

        for (var kasbon : kasbons) {
            totaal = totaal.add(kasbon.getEindWaarde());
        }

        return totaal;
    }
}
