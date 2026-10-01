package be.vdab.jpfhfdst24;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class ArtiestenAlbums {

    private static final Path PATH =
            Path.of("D:/opleiding/data/albumsartists.txt");

    void main() {
        /*try (var regels = Files.lines(PATH)) {

            var albumsPerArtiest = regels
                    .map(regel -> regel.split(",", 2))
                    .filter(onderdelen -> onderdelen.length == 2)
                    .collect(Collectors.groupingBy(
                            onderdelen -> onderdelen[1].trim(),
                            TreeMap::new,
                            Collectors.mapping(
                                    onderdelen -> onderdelen[0].trim(),
                                    Collectors.toCollection(TreeSet::new)
                            )
                    ));

            albumsPerArtiest.forEach((artiest, albums) -> {
                IO.println("\n" + artiest);

                albums.forEach(album ->
                                       IO.println("  - " + album));
            });



        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }*/


        try (var stream = Files.lines(PATH)) {
            var albumsPerArtiest2 = stream.collect(
                    Collectors.groupingBy(
                            regel -> regel.substring(regel.indexOf(',') + 1)));

          //  IO.println(albumsPerArtiest2);

            albumsPerArtiest2.entrySet().stream()
                             .sorted((entry1, entry2) -> entry1.getKey().compareTo(entry2.getKey()))
                             .forEach(entry -> {
                                 IO.println(entry.getKey());

                                 entry.getValue().stream()
                                      .map(regel -> regel.substring(0, regel.indexOf(',')))
                                      .sorted()
                                      .forEach(album -> IO.println("\t" + album));
                             });
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
