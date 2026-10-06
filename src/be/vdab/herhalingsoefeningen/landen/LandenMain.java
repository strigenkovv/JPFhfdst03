package be.vdab.herhalingsoefeningen.landen;

import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

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


        var landen1 = new TreeSet<Land>();

        for (String code; !(code = IO.readln()).equals("stop"); ) {
            var aantalInwoners = Integer.parseInt(IO.readln());
            landen1.add(new Land(code, aantalInwoners));
        }
        int totaal = 0;
        for (var land : landen1) {
            IO.println(land.getCode() + ':' + land.getAantalInwoners());
            totaal += land.getAantalInwoners();
        }
        IO.println(totaal);
    }

}
