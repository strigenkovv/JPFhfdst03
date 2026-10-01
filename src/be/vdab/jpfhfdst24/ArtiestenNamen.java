package be.vdab.jpfhfdst24;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ArtiestenNamen {
    void main() {
        var pad = Path.of("albumsartists.txt");

        try (var artiesten = Files.lines(pad)) {
            artiesten
                    .sorted()
                    .forEach(IO::println);
        } catch (IOException ex) {
            IO.println(ex.getMessage());
        }
    }
}
