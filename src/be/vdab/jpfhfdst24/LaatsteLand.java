package be.vdab.jpfhfdst24;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class LaatsteLand {
    private static final Path PATH =
            Path.of("D:/opleiding/data/landcodes.txt");


    void main() {
        try (var stream = Files.lines(PATH)) {
            stream
                    .map(regel -> regel.split(" ", 2)[1].trim())
                    .max((land1, land2) ->
                                 land1.compareTo(land2))
                    .ifPresent(land -> IO.println(land));


            stream.map(regel -> regel.substring(regel.indexOf(' ') + 1))
                  .max((naam1, naam2) -> naam1.compareToIgnoreCase(naam2))
                  .ifPresent(grootsteNaam -> IO.println(grootsteNaam));


        }
        catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }
}
