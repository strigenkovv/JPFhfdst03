package be.vdab.jpfhfdst24;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Optional;

public class LandcodesVoorbeeld {

    private static final Path BESTAND =
            Path.of("D:/opleiding/data/landcodes.txt");

    private static Optional<String> zoekLand(String landcode)
            throws IOException {

        try (var reader = Files.newBufferedReader(BESTAND)) {

            for (String regel;
                 (regel = reader.readLine()) != null;) {

                var onderdelen = regel.split(" ");

                if (onderdelen.length == 2
                    && onderdelen[0].trim()
                                    .equalsIgnoreCase(landcode)) {

                    return Optional.of(onderdelen[1].trim());
                }
            }
        }

        return Optional.empty();
    }

    void main() {
        try {
            zoekLand("BE").ifPresentOrElse(
                    land -> IO.println("Land: " + land),
                    () -> IO.println("Land niet gevonden")
            );

            zoekLand("XX").ifPresentOrElse(
                    land -> IO.println("Land: " + land),
                    () -> IO.println("Land niet gevonden")
            );

        } catch (IOException ex) {
            IO.println(ex.getMessage());
        }
    }
}