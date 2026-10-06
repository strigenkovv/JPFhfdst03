package be.vdab.herhalingsoefeningen.personen;

import java.util.Comparator;
import java.util.TreeSet;

import be.vdab.herhalingsoefeningen.Personen;
import be.vdab.herhalingsoefeningen.PersonenManager;

public class TestPerson {
    void main(){
        var personen1 = new TreeSet<Persoon>();
        personen1.add(new Persoon("Joe","Dalton"));
        personen1.add(new Persoon("Sarah","Bernhardt"));
        for (var persoon: personen1) {
            IO.println(persoon.getFamilienaam() + ' ' +
                       persoon.getVoornaam());
        }

        var personen = new be.vdab.herhalingsoefeningen.Personen();

        personen.add(new be.vdab.herhalingsoefeningen.Persoon("Joe", "Dalton"));
        personen.add(new be.vdab.herhalingsoefeningen.Persoon("Sarah", "Bernhardt"));
        personen.add(new be.vdab.herhalingsoefeningen.Persoon("Ive", "Aernhardt"));
        personen.add(new be.vdab.herhalingsoefeningen.Persoon("Sarah", "Cernhardt"));
        personen.add(new be.vdab.herhalingsoefeningen.Persoon("Sarah", "Fernhardt"));

        var manager = new PersonenManager();

        manager.save(personen);

        Personen personen2 = manager.load();

        IO.println(personen2);

        IO.println(personen.getPersonen().stream()
                           .sorted(Comparator.comparing(be.vdab.herhalingsoefeningen.Persoon::getFamilienaam)
                                             .thenComparing(be.vdab.herhalingsoefeningen.Persoon::getVoornaam))
        );
    }
}
