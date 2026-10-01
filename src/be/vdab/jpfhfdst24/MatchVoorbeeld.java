package be.vdab.jpfhfdst24;

import java.util.stream.Stream;

public class MatchVoorbeeld {
    void main() {
        boolean resultaat =
                Stream.of("sla", "wortel", "kool", "biet")
                      .allMatch(groente -> groente.length() == 4);

        IO.println(resultaat);


        boolean resultaat2 =
                Stream.of("sla", "wortel", "kool", "biet")
                      .anyMatch(groente -> groente.length() == 4);

        IO.println(resultaat2);
    }
}
