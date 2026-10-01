package be.vdab.jpfhfdst24;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamVerzamelenVoorbeeld {

    public static List<String> gesorteerdeGroenten() {
        return Stream.of("sla", "wortel", "kool", "biet")
                     .sorted()
                     .toList();
    }

    void main() {
        IO.println(gesorteerdeGroenten());

        var groenten = Stream.of(
                "sla", "wortel", "sla", "kool", "biet"
        );

        var uniekeGroenten = groenten.collect(
                Collectors.toSet()
        );

        IO.println(uniekeGroenten);

        var groentenPerLengte =
                Stream.of("sla", "kool", "wortel", "biet")
                      .collect(
                              Collectors.groupingBy(
                                      groente -> groente.length()
                              )
                      );

        IO.println(groentenPerLengte);

        /*entrySet() возвращает Set<Map.Entry<Integer, List<String>>>.
stream() создаёт поток из этих пар.
forEach() обрабатывает каждую пару.
getKey() получает длину слова, а getValue() — соответствующий список овощей.*/

        groentenPerLengte.entrySet()
                         .stream()
                         .forEach(entry -> {
                             IO.print(entry.getKey() + ": ");

                             entry.getValue()
                                  .forEach(groente ->
                                                   IO.print(groente + " "));

                             IO.println();
                         });


        var resultaat =
                Stream.of("sla", "wortel", "kool", "biet")
                      .collect(Collectors.joining(", "));

        IO.println(resultaat);
    }
}
