package be.vdab.herhalingsoefeningen.lokaal;

import java.util.ArrayList;
import java.util.List;

public class Lokaal {

    private final int nummer;
    private final Trainer trainer;
    private final List<Cursist> cursisten = new ArrayList<>();

    public Lokaal(int nummer, Trainer trainer) {
        this.nummer = nummer;
        this.trainer = trainer;
    }

    public void cursistToevoegen(Cursist cursist) {
        cursisten.add(cursist);
    }

    @Override
    public String toString() {
        var resultaat = new StringBuilder();

        resultaat.append("Lokaal ")
                 .append(nummer)
                 .append(" ")
                 .append(trainer)
                 .append(System.lineSeparator());

        resultaat.append(cursisten.size())
                 .append(" cursisten:")
                 .append(System.lineSeparator());

        for (Cursist cursist : cursisten) {
            resultaat.append(cursist)
                     .append(System.lineSeparator());
        }

        return resultaat.toString();
    }
}