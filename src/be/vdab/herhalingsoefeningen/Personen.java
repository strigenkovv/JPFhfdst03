package be.vdab.herhalingsoefeningen;

import java.util.HashSet;
import java.util.Set;

public class Personen {

    private final Set<Persoon> personen = new HashSet<>();

    public void add(Persoon persoon) {
        personen.add(persoon);
    }

    @Override
    public String toString() {
        var resultaat = new StringBuilder();

        for (Persoon persoon : personen) {
            resultaat.append(persoon).append(System.lineSeparator());
        }

        return resultaat.toString();
    }

    public Set<Persoon> getPersonen() {
        return personen;
    }
}
