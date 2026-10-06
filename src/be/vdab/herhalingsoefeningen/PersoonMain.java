package be.vdab.herhalingsoefeningen;

import java.util.Comparator;

public class PersoonMain {

    static void main() {
        var personen = new Personen();

        personen.add(new Persoon("Joe", "Dalton"));
        personen.add(new Persoon("Sarah", "Bernhardt"));
        personen.add(new Persoon("Ive", "Aernhardt"));
        personen.add(new Persoon("Sarah", "Cernhardt"));
        personen.add(new Persoon("Sarah", "Fernhardt"));

        var manager = new PersonenManager();

        manager.save(personen);

        Personen personen2 = manager.load();

        IO.println(personen2);

        IO.println(personen.getPersonen().stream()
                           .sorted(Comparator.comparing(Persoon::getFamilienaam)
                                             .thenComparing(Persoon::getVoornaam))
        );

    }
}
