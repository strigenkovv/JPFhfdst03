package be.vdab.herhalingsoefeningen;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class PersonenManager {
    private static final Path PATH =
            Path.of("D:/opleiding/data/personen.txt");

    public void save(Personen personen) {
        try {
            Files.writeString(PATH, personen.toString());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public Personen load() {
        var personen = new Personen();

        try (var regels = Files.lines(PATH)) {
            regels.forEach(regel -> {
                var onderdelen = regel.split(" ", 2);

                if (onderdelen.length == 2) {
                    personen.add(
                            new Persoon(
                                    onderdelen[0],
                                    onderdelen[1]
                            )
                    );
                }
            });
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return personen;
    }
}
