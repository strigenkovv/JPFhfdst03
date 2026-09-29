package be.vdab.jpfhfdst21;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TekstSchrijvenVoorbeeld {

    void main() {
        var bestand = Path.of("D:/opleiding/data/naam.txt");

        try (var writer = Files.newBufferedWriter(bestand)) {
            writer.write("Jean");
            writer.newLine();
            writer.write("Viktoriia");

        } catch (IOException ex) {
            IO.println(ex.getMessage());
        }
    }
}