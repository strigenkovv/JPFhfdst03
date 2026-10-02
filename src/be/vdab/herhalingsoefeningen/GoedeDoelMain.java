package be.vdab.herhalingsoefeningen;

import java.math.BigDecimal;

public class GoedeDoelMain {
    public static void main(String[] args) {
        var goedeDoel = new GoedeDoel("Rode Kruis");

        while (true) {
            var bedrag = new BigDecimal(IO.readln("Bedrag: "));

            goedeDoel.storten(bedrag);

            if (bedrag.compareTo(BigDecimal.ZERO) == 0) { break;}
        }

        IO.println("Het totaal gestorte bedrag = " + goedeDoel.getTotaalGestort());

    }
}
