package be.vdab.jpfhfdst17;

import java.math.BigDecimal;

public class BigDecimalVoorbeeld {
    void main() {

        var totaal = BigDecimal.ZERO;
        var increment = BigDecimal.valueOf(0.01);

        for (var i = 0; i < 1000; i++) {
            totaal = totaal.add(increment);
        }

        IO.println(totaal);
    }
}
