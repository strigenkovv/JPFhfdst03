package be.vdab.jpfhfdst24;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class LandnamenSorteren {
    void main() {
        var pad = Path.of("landcodes.txt");

        try (var landen = Files.lines(pad)) {
            landen
                    .sorted()
                    .forEach(IO::println);
        } catch (IOException ex) {
            IO.println(ex.getMessage());
        }
    }
}
