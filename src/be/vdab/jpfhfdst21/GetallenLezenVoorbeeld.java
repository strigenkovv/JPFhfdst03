package be.vdab.jpfhfdst21;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class GetallenLezenVoorbeeld {

    void main() {
        var bestand = Path.of("D:/opleiding/data/getallen.txt");

        try (var reader = Files.newBufferedReader(bestand)) {

            for (String line;
                 (line = reader.readLine()) != null;) {

                IO.println(Integer.parseInt(line.trim()));
            }

        } catch (IOException ex) {
            IO.println(ex.getMessage());
        }
    }
}