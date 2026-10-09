package be.vdab.personeel;

import java.util.ArrayList;
import java.util.List;

public class Bedrijf {

    private final List<Werknemer> bedrijfslijst = new ArrayList<>();


    public List<Werknemer> getBedrijfslijst() {
        return bedrijfslijst;
    }

    public void voegWerknemerToe(Werknemer werknemer) {
        if (!bedrijfslijst.contains(werknemer)) {
            bedrijfslijst.add(werknemer);
        }
    }

    public void printLijst(List<Werknemer> werknemers) {
        werknemers.forEach(IO::println);
    }

    public List<Werknemer> gesorteerdeLijst() {
        return bedrijfslijst.stream()
                            .sorted()
                            .toList();
    }

    public List<Werknemer> lijstVanArbeiders() {
        return bedrijfslijst.stream()
                            .filter(werknemer -> werknemer instanceof Arbeider)
                            .toList();
    }

    public double percentageMannelijkeWerknemers() {
        if (bedrijfslijst.isEmpty()) {
            return 0;
        }

        long aantalMannen = bedrijfslijst.stream()
                                         .filter(werknemer -> werknemer.getGeslacht() == Geslacht.M)
                                         .count();

        return (double) aantalMannen / bedrijfslijst.size() * 100;
    }
}
