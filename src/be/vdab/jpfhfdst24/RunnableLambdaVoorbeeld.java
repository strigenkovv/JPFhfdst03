package be.vdab.jpfhfdst24;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedHashSet;

public class RunnableLambdaVoorbeeld {

    private static final Path DATA =
            Path.of("D:/opleiding/data");

    private static final Path COUNTRIES_PATH =
            DATA.resolve("countries.txt");

    private static final Path COUNTRIES_BACKUP_PATH =
            DATA.resolve("countries.bak");

    private static final Path LANGUAGES_PATH =
            DATA.resolve("languages.txt");

    private static final Path LANGUAGES_BACKUP_PATH =
            DATA.resolve("languages.bak");

    // Remove empty lines from countries.txt.
    private static void legeRegelsVerwijderen() {
        try {
            Files.deleteIfExists(COUNTRIES_BACKUP_PATH);
            Files.move(COUNTRIES_PATH, COUNTRIES_BACKUP_PATH);

            try (
                    var reader = Files.newBufferedReader(COUNTRIES_BACKUP_PATH);
                    var writer = Files.newBufferedWriter(COUNTRIES_PATH)
            ) {
                for (String regel;
                     (regel = reader.readLine()) != null;) {

                    if (!regel.isBlank()) {
                        writer.write(regel);
                        writer.newLine();
                    }
                }
            }

        } catch (IOException ex) {
            ex.printStackTrace(System.err);
        }
    }

    // Remove duplicate languages while preserving insertion order.
    private static void dubbelsVerwijderen() {
        var uniekeTalen = new LinkedHashSet<String>();

        try {
            Files.deleteIfExists(LANGUAGES_BACKUP_PATH);
            Files.move(LANGUAGES_PATH, LANGUAGES_BACKUP_PATH);

            try (var reader =
                         Files.newBufferedReader(LANGUAGES_BACKUP_PATH)) {

                for (String regel;
                     (regel = reader.readLine()) != null;) {

                    uniekeTalen.add(regel);
                }
            }

            try (var writer = Files.newBufferedWriter(LANGUAGES_PATH)) {
                for (var taal : uniekeTalen) {
                    writer.write(taal);
                    writer.newLine();
                }
            }

        } catch (IOException ex) {
            ex.printStackTrace(System.err);
        }
    }

    void main() {
        new Thread(() -> legeRegelsVerwijderen()).start();
        new Thread(() -> dubbelsVerwijderen()).start();
    }
}