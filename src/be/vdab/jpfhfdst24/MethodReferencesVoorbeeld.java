package be.vdab.jpfhfdst24;

import java.util.stream.Stream;

public class MethodReferencesVoorbeeld {

    private static String omgekeerd(StringBuilder builder) {
        return builder.reverse().toString();
    }

    void main() {
        Stream.of("repel", "lepel")
              .map(StringBuilder::new)
              .map(MethodReferencesVoorbeeld::omgekeerd)
              .map(String::toLowerCase)
              .forEach(System.out::println);
    }
}
