package be.vdab.herhalingsoefeningen.landen;

import java.util.Map;
import java.util.TreeMap;

public class LandenMain {
    static void main() {
        Map<String, Long> landen = new TreeMap<>();

        while (true) {
            var landcode = IO.readln("Landcode: ");

            if (landcode.equalsIgnoreCase("stop")) {
                break;
            }

            var aantalInwoners =
                    Long.parseLong(IO.readln("Aantal inwoners: "));

            landen.put(landcode, aantalInwoners);
        }

        long totaalAantalInwoners = 0;

        for (var entry : landen.entrySet()) {
            IO.println(entry.getKey() + " " + entry.getValue());

            totaalAantalInwoners += entry.getValue();
        }

        IO.println("Totaal aantal inwoners: " + totaalAantalInwoners);

        landen.forEach((landcode, aantalInwoners) ->
                               IO.println(landcode + " " + aantalInwoners));

        totaalAantalInwoners = landen.values().stream()
                                          .mapToLong(aantal -> aantal)
                                          .sum();

        IO.println("Totaal aantal inwoners: " + totaalAantalInwoners);

        landen.entrySet().forEach(System.out::println);
    }
}
