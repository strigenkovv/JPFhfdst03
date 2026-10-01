package be.vdab.jpfhfdst24;

import java.math.BigDecimal;
import java.util.stream.Stream;

public class ReduceVoorbeeld {
    void main() {
        var som = Stream.of(
                BigDecimal.valueOf(1.1),
                BigDecimal.valueOf(0.9),
                BigDecimal.valueOf(0.5)
        ).reduce(
                BigDecimal.ZERO,
                (vorigeSom, getal) -> {
                    var nieuweSom = vorigeSom.add(getal);

                    IO.println(vorigeSom + " + "
                               + getal + " = " + nieuweSom);

                    return nieuweSom;
                }

        );

        IO.println("Totaal: " + som);

//
        Stream.of(
                      BigDecimal.valueOf(1.1),
                      BigDecimal.valueOf(0.9),
                      BigDecimal.valueOf(0.5)
              )
              .reduce((vorigeSom, getal) -> {
                  var nieuweSom = vorigeSom.add(getal);

                  IO.println(vorigeSom + " + "
                             + getal + " = " + nieuweSom);

                  return nieuweSom;
              })
              .ifPresent(som2 -> IO.println("Totaal: " + som2));

    }
}
