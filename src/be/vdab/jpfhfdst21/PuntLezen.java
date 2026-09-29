package be.vdab.jpfhfdst21;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class PuntLezen {

    void main() {
        var bestand = Path.of("D:/opleiding/data/punt.ser");

        try (var stream = new ObjectInputStream(
                Files.newInputStream(bestand))) {

            // Deserialize the saved object.
            var punt = (Punt) stream.readObject();

            IO.println(punt);

        } catch (IOException | ClassNotFoundException ex) {
            IO.println(ex.getMessage());
        }
    }
}