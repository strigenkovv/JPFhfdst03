package be.vdab.jpfhfdst21;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class BinaireBestandenVoorbeeld {

    void main() {
        var afbeeldingen = Path.of(
                "D:/opleiding/data/afbeeldingen");

        var origineel = afbeeldingen.resolve("duimop.jpg");
        var kopie = afbeeldingen.resolve("thumbup.jpg");

        try (
                var input = Files.newInputStream(origineel);
                var output = Files.newOutputStream(kopie)
        ) {
            // Read and write one byte at a time.
            for (int eenByte;
                 (eenByte = input.read()) != -1;) {

                output.write(eenByte);
            }

            IO.println("Image copied!");

        } catch (IOException ex) {
            IO.println(ex.getMessage());
        }
    }
}