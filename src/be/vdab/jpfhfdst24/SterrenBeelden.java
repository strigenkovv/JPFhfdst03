package be.vdab.jpfhfdst24;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class SterrenBeelden {

void main(){
    var scanner = new Scanner(System.in);
    IO.println("Geef een woord:");
    var gezochtWoord = scanner.nextLine();

    var pad = Path.of("sterrenbeelden.txt");
    try (var regels = Files.lines(pad)) {
        regels.filter(regel -> regel.contains(gezochtWoord))
              .forEach(IO::println);
    } catch (IOException ex) {
        System.err.println(ex.getMessage());
    }

}
}
