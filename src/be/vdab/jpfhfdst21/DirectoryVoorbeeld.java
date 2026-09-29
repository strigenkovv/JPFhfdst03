package be.vdab.jpfhfdst21;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DirectoryVoorbeeld {

    void main() {
        var afbeeldingen = Path.of("D:/opleiding/data/afbeeldingen");

        var origineel = afbeeldingen.resolve("duimop.jpg");
        var kopie = afbeeldingen.resolve("thumbup.jpg");
        var hernoemd = afbeeldingen.resolve("thumb.jpg");

        try {
            // 21.3.1 Get the file size in bytes.
            IO.println("Original size: " + Files.size(origineel));

            // 21.3.2 Copy the original image.
            Files.copy(origineel, kopie);
            IO.println("Copy exists: " + Files.exists(kopie));

            // 21.3.3 Rename the copied image.
            Files.move(kopie, hernoemd);
            IO.println("Renamed file exists: " + Files.exists(hernoemd));

            // 21.3.4 Delete ONLY the renamed copy.
            Files.delete(hernoemd);
            IO.println("Deleted copy: " + Files.notExists(hernoemd));

        } catch (IOException ex) {
            IO.println("Error: " + ex.getMessage());
        }
    }
}
