package be.vdab.jpfhfdst20;

import java.util.HashSet;
import java.util.Set;

public class HashSetVoorbeeld {
    void main() {

        Set<Coordinaat> coordinaten = new HashSet<>();

        coordinaten.add(new Coordinaat(11, 20));
        coordinaten.add(new Coordinaat(13, 20));
        coordinaten.add(new Coordinaat(11, 20));

        IO.println(coordinaten.size()); // 2

        IO.println(
                coordinaten.contains(new Coordinaat(11, 20))
        ); // true
    }
}
