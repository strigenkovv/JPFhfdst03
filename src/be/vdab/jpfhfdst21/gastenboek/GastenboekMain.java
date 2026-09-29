package be.vdab.jpfhfdst21.gastenboek;

import java.io.IOException;
import java.util.Locale;

public class GastenboekMain {

    void main() {
        var manager = new GastenboekManager();
        Gastenboek gastenboek;

        // Load existing data or start with an empty guestbook.
        try {
            gastenboek = manager.bestaat()
                    ? manager.lees()
                    : new Gastenboek();

        } catch (IOException | ClassNotFoundException ex) {
            IO.println("Kan het gastenboek niet lezen: "
                       + ex.getMessage());
            return;
        }

        String keuze;

        do {
            IO.println("\nT - Tonen");
            IO.println("S - Schrijven");
            IO.println("E - Eindigen");

            keuze = IO.readln("Jouw keuze: ")
                      .trim()
                      .toUpperCase(Locale.ROOT);

            switch (keuze) {
                case "T" -> IO.println(gastenboek);

                case "S" -> {
                    var schrijver = IO.readln("Naam: ");
                    var boodschap = IO.readln("Boodschap: ");

                    var entry =
                            new GastenboekEntry(schrijver, boodschap);

                    gastenboek.voegToe(entry);

                    try {
                        manager.schrijf(gastenboek);
                        IO.println("Bericht opgeslagen.");

                    } catch (IOException ex) {
                        IO.println("Opslaan mislukt: "
                                   + ex.getMessage());
                    }
                }

                case "E" -> IO.println("Tot ziens!");

                default -> IO.println("Ongeldige keuze.");
            }

        } while (!keuze.equals("E"));
    }
}
