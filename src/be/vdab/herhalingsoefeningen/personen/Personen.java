package be.vdab.herhalingsoefeningen.personen;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Personen implements Serializable {

    private static final long serialVersionUID = 1L;

    private final List<Persoon> personen = new ArrayList<>();

    public void add(Persoon persoon) {
        personen.add(persoon);
    }

    @Override
    public String toString() {
        var builder = new StringBuilder();

        for (var persoon : personen) {
            builder.append(persoon.getNaam())
                   .append(System.lineSeparator());
        }

        return builder.toString();
    }
}