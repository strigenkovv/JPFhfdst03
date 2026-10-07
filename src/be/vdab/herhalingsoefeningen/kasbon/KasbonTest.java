package be.vdab.herhalingsoefeningen.kasbon;

import java.math.BigDecimal;

public class KasbonTest {
    static void main() {
        var kasbon1 = new NietKapitaliseerbareKasbon(
                BigDecimal.valueOf(10_000), 3, BigDecimal.valueOf(0.1));
        IO.println(kasbon1.getEindWaarde());
// output: 13000.0 (10.000 + 3 keer 10% op 10.000)
        var kasbon2 = new KapitaliseerbareKasbon(
                BigDecimal.valueOf(10_000), 3, BigDecimal.valueOf(0.1));
        IO.println(kasbon2.getEindWaarde());
// output: 13310.000 = beginkapitaal + intrest jaar 1 + intrest jaar 2 + intrest jaar 3
// intrest jaar 1: 1000 (10% op 10.000)
// intrest jaar 2: 1000 (10% op 10.000) + 100 (10% op intrest vorige jaren: 1000)=1100
// intrest jaar 3: 1000 (10% op 10.000) + 210 (10% op intrest vorige jaren: 2100)=1210
        var klant = new Klant();
        klant.add(kasbon1);
        klant.add(kasbon2);
        IO.println(klant.getEindWaarde()); // 26310.000
    }
}
