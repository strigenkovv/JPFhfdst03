package be.vdab.jpfhfdst21;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;

public class GetallenSchrijvenVoorbeeld {

    void main() {
        var bestand = Path.of("D:/opleiding/data/getallen.txt");

        IO.println("Tik getallen. Tik 0 om te stoppen:");

        try (var writer = new PrintWriter(
                Files.newBufferedWriter(bestand))) {

            for (int getal;
                 (getal = Integer.parseInt(IO.readln())) != 0;) {

                writer.println(getal);
            }

        } catch (IOException ex) {
            IO.println(ex.getMessage());
        }
    }
}