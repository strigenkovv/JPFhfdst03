package be.vdab.jpfhfdst24;

import java.math.BigDecimal;
import java.util.stream.Stream;

public class BigDecimalStatistiekenVoorbeeld {

    void main() {
        Stream.of(
                      BigDecimal.valueOf(1.1),
                      BigDecimal.valueOf(0.9),
                      BigDecimal.valueOf(0.5)
              )
              .min((getal1, getal2) ->
                           getal1.compareTo(getal2))
              .ifPresent(kleinste -> IO.println(kleinste));


        Stream.of(
                      BigDecimal.valueOf(1.1),
                      BigDecimal.valueOf(0.9),
                      BigDecimal.valueOf(0.5)
              )
              .max(BigDecimal::compareTo)
              .ifPresent(kleinste -> IO.println(kleinste));
    }
}
