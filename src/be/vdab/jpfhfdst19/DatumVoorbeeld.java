package be.vdab.jpfhfdst19;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class DatumVoorbeeld {

    void main() {

        var vandaag = LocalDate.now();
        var afspraak = LocalDate.of(2026, 9, 29);

        var dagen = ChronoUnit.DAYS.between(
                vandaag,
                afspraak
        );

        IO.println("Dagen tot afspraak: " + dagen);

        var formatter = DateTimeFormatter.ofPattern(
                "dd MMMM yyyy",
                Locale.forLanguageTag("nl-BE")
        );

        IO.println(afspraak.format(formatter));

        var brussel = ZoneId.of("Europe/Brussels");

        var afspraakMetTijdzone = ZonedDateTime.of(
                2026, 9, 29,
                10, 30, 0, 0,
                brussel
        );

        IO.println(afspraakMetTijdzone);
    }
}
