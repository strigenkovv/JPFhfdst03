package be.vdab.jpfhfdst21;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class PuntSchrijven {

    void main() {
        var bestand = Path.of("D:/opleiding/data/punt.ser");

        try (var stream = new ObjectOutputStream(
                Files.newOutputStream(bestand))) {

            // Serialize the object.
            stream.writeObject(new Punt(10, 20));

            IO.println("Object saved successfully.");

        } catch (IOException ex) {
            IO.println(ex.getMessage());
        }
    }
}