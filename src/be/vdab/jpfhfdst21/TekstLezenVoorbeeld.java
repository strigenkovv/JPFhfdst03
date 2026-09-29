package be.vdab.jpfhfdst21;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TekstLezenVoorbeeld {

    void main() {
        var bestand = Path.of("D:/opleiding/data/insecten1.csv");

        try {
            // Read all lines into memory.
            var regels = Files.readAllLines(bestand);

            // Print every line.
            for (var regel : regels) {
                IO.println(regel);
            }

            IO.println("Number of lines: " + regels.size());

        } catch (IOException ex) {
            IO.println("Error: " + ex.getMessage());
        }

        var bestand1 = Path.of("D:/opleiding/data/insecten1.csv");

        try {
            var reader = Files.newBufferedReader(bestand1);

            try {
                String regel;

                // Read one line at a time until the end of the file.
                while ((regel = reader.readLine()) != null) {
                    IO.println(regel);
                }

            } finally {
                // Close the file even if reading fails.
                reader.close();
            }

        } catch (IOException ex) {
            IO.println("Error: " + ex.getMessage());
        }
    }
}
