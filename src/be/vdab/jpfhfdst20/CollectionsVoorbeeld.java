package be.vdab.jpfhfdst20;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionsVoorbeeld {
    void main() {

        List<String> namen = new ArrayList<>();

        namen.add("Anna");
        namen.add("Maria");
        namen.add("Olga");

        namen.add(1, "Viktoriia");

        IO.println(namen.getFirst());
        IO.println(namen.getLast());
        IO.println(namen.size());

        for (var naam : namen) {
            IO.println(naam);
        }

        List<String> andereNamen = new LinkedList<>();

        andereNamen.add("Tom");
        andereNamen.add("Eric");

        IO.println(andereNamen);
    }
}
