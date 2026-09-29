package be.vdab.jpfhfdst21;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DirectoryInhoudVoorbeeld {

    void main() {
        var data = Path.of("D:/opleiding/data");

        try (var stream = Files.newDirectoryStream(data)) {

            for (var path : stream) {
                IO.print(path);

                IO.println(
                        Files.isDirectory(path)
                                ? " :directory"
                                : " :bestand"
                );
            }

        } catch (IOException ex) {
            IO.println(ex.getMessage());
        }
    }
}