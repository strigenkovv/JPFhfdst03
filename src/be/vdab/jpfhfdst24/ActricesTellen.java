package be.vdab.jpfhfdst24;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;

public class ActricesTellen {
    private static final Path PATH =
            Path.of("D:/opleiding/data/acteurs-actrices.csv");

    void main() {
        try (var stream = Files.lines(PATH)) {
          /*  IO.println(stream
                    .map(regel -> regel.split(";", 3))
                    .filter(onderdelen -> onderdelen.length == 3
                                          && onderdelen[2].trim().equals("F"))
                    .count());
*/

            IO.println(
                    stream
                            .map(regel -> regel.split(";")[0])
                            .anyMatch(naam -> "Vicki".equals(naam))
            );


        }
        catch (IOException ex) {
            ex.printStackTrace();
        }


    }
}
