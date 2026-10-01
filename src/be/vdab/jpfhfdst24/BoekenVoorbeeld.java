package be.vdab.jpfhfdst24;

import java.util.Arrays;
import java.util.stream.Stream;

public class BoekenVoorbeeld {
    void main() {
        Stream.of("The lord of the rings", "The hobbit")
              .map(titel -> titel.split(" "))
              .flatMap(array -> Arrays.stream(array))
              .map(woord -> woord.toLowerCase())
              .distinct()
              .sorted()
              .forEach(woord -> IO.println(woord));
    }
}
