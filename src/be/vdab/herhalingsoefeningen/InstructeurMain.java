package be.vdab.herhalingsoefeningen;

import java.math.BigDecimal;

public class InstructeurMain {
    static void main() {
        var gebouw = new Gebouw(BigDecimal.valueOf(1500));

        var instructeur = new Instructeur(
                BigDecimal.valueOf(3000),
                BigDecimal.valueOf(50),
                80
        );

        Kost[] kosten = {gebouw, instructeur};

        BigDecimal totaleKost = BigDecimal.ZERO;


        for (Kost k: kosten) {
            totaleKost = totaleKost.add(k.getKost());
        }

        IO.println(totaleKost);
    }
}
