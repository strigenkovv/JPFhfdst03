package be.vdab.jpfhfdst21.gastenboek;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class GastenboekManager {

    private final Path bestand =
            Path.of("D:/opleiding/data/gastenboek.ser");

    // Serialize and save the guestbook.
    public void schrijf(Gastenboek gastenboek) throws IOException {
        try (var stream = new ObjectOutputStream(
                Files.newOutputStream(bestand))) {

            stream.writeObject(gastenboek);
        }
    }

    // Read and deserialize the guestbook.
    public Gastenboek lees()
            throws IOException, ClassNotFoundException {

        try (var stream = new ObjectInputStream(
                Files.newInputStream(bestand))) {

            return (Gastenboek) stream.readObject();
        }
    }

    public boolean bestaat() {
        return Files.exists(bestand);
    }
}