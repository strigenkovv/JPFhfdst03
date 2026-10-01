package be.vdab.jpfhfdst24;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamVoorbeeld {

    void main() {
        var groenten = new String[] {
                "tomaat", "sla", "ui", "prei"
        };

        var stream = Arrays.stream(groenten);

        stream.forEach(groente -> IO.println(groente));

        var heiligeGetallen = new LinkedHashSet<Integer>();
        heiligeGetallen.add(1);
        heiligeGetallen.add(3);
        heiligeGetallen.add(4);
        heiligeGetallen.add(7);
        heiligeGetallen.stream()
                       .forEach(getal -> IO.println(getal));


        var talen = new LinkedHashMap<String, String>();

        talen.put("NL", "Nederlands");
        talen.put("FR", "Frans");

        talen.entrySet()
             .stream()
             .forEach(entry ->
                              IO.println(entry.getKey() + ": " + entry.getValue()));


        "Lambdafun".chars()
                   .forEach(unicode -> IO.println((char) unicode));


        var path = Path.of("D:/opleiding/data/languages.txt");

        try (var stream1 = Files.lines(path)) {
            stream1.forEach(regel -> IO.println(regel));
        }
        catch (IOException ex) {
            System.err.println(ex.getMessage());
        }


        var path2 = Path.of("D:/opleiding/data");

        try (var stream2 = Files.list(path2)) {
            stream2.forEach(entry ->
                                    IO.println(entry.getFileName()));
        }
        catch (IOException ex) {
            System.err.println(ex.getMessage());
        }


        Stream.of("Adam", "Eva")
              .forEach(naam -> IO.println(naam));

        Stream.iterate(1, vorigGetal -> vorigGetal + 2)
              .limit(10)
              .forEach(onevenGetal -> IO.println(onevenGetal));


        IntStream.rangeClosed(1, 10)
                 .forEach(getal -> IO.println(getal));

        IntStream.range(1, 10)
                 .forEach(getal -> IO.println(getal));

    }
}