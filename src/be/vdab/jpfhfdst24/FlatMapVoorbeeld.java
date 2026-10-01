package be.vdab.jpfhfdst24;

import java.util.stream.Stream;

public class FlatMapVoorbeeld {
    void main() {
        Stream.of(
                      Stream.of("Joe", "Jack"),
                      Stream.of("William", "Averell")
              )
              .flatMap(stream -> stream)
              .forEach(voornaam -> IO.println(voornaam));
    }
}
