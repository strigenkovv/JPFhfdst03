package be.vdab.herhalingsoefeningen.woorden;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class WoordenTest {
    static void main() {
        var aantalPerWoord = new TreeMap<String, Integer>();

        // Почему Set<Integer>? Чтобы если слово два раза встретилось в одном предложении, номер предложения не дублировался.
        var zinnenPerWoord = new TreeMap<String, Set<Integer>>();

        var zinNummer = 0;

        while (true) {
            var zin = IO.readln("zin: ");

            if (zin.equalsIgnoreCase("stop")) {
                break;
            }

            var woorden = zin.split(" ");
            /*for (var woord : woorden) {
var aantal = woordenEnAantallen.get(woord);
if (aantal == null) {
woordenEnAantallen.put(woord, 1);
} else {
woordenEnAantallen.put(woord, aantal + 1);
}
}*/
            for (var woord : woorden) {
                aantalPerWoord.put(
                        woord,
                        aantalPerWoord.getOrDefault(woord, 0) + 1
                );
            }

            aantalPerWoord.forEach((woord, aantal) ->
                                           IO.println(woord + ": " + aantal));

            zinNummer++;

            /*for (String woord : woorden) {
var aantal = woordenEnAantallen.get(woord);
if (aantal == null) {
var value = new LinkedHashSet<Integer>();
value.add(zinIndex);
woordenEnAantallen.put(woord, value);
} else {
aantal.add(zinIndex);
}
}*/
            for (var woord : woorden) {
                zinnenPerWoord
                        .computeIfAbsent(woord,
                                         key -> new TreeSet<>()) //если такого слова ещё нет в Map, создай для него новый TreeSet<Integer>
                        .add(zinNummer);
            }
        }


        zinnenPerWoord.forEach((woord, zinnen) ->
                                       IO.println(woord + ": " + zinnen));

    }
}
