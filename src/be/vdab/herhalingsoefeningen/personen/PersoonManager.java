package be.vdab.herhalingsoefeningen.personen;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class PersoonManager {
    private static final Path PATH =
            Path.of("D:/opleiding/data/personen.dat");


    public void save(Personen personen) {
        try (
                var stream =
                        new ObjectOutputStream(
                                Files.newOutputStream(PATH))) {

            stream.writeObject(personen);

        }
        catch (IOException ex) {
            IO.println(ex);
        }
    }

    public Personen load() {
        try (
                var stream =
                        new ObjectInputStream(
                                Files.newInputStream(PATH))) {

            return (Personen) stream.readObject();

        }
        catch (Exception ex) {
            IO.println(ex);
            return null;
        }
    }


}
