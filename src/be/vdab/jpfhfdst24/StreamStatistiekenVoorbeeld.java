package be.vdab.jpfhfdst24;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamStatistiekenVoorbeeld {

    void main() {
        long aantal = Stream.of(
                "sla", "wortel", "kool", "biet"
        ).count();

        IO.println(aantal);


        var stream = IntStream.of(1, 3, 4, 7);

        IO.println(stream.sum());
        // IO.println(stream.count()); // IllegalStateException

        IntStream.of(1, 3, 4, 7)
                 .min()
                 .ifPresent(kleinste -> IO.println(kleinste));


        IntStream.of(1, 3, 4, 7)
                 .max()
                 .ifPresent(grootste -> IO.println(grootste));

        IntStream.of(1, 3, 4, 7)
                 .average()
                 .ifPresent(gemiddelde -> IO.println(gemiddelde));

        int totaal = Stream.of("sla", "wortel", "kool", "biet")
                           .mapToInt(groente -> groente.length())
                           .sum();

        IO.println(totaal);


        var groenten = List.of("sla", "wortel", "kool", "biet");

        long aantal2 = groenten.stream().count();

        Stream.of("sla", "wortel", "kool", "biet")
              .mapToInt(groente -> groente.length())
              .min()
              .ifPresent(minste -> IO.println(minste));

        Stream.of("sla", "wortel", "kool", "biet")
              .mapToInt(groente -> groente.length())
              .average()
              .ifPresent(average -> IO.println(average));


    }
}
