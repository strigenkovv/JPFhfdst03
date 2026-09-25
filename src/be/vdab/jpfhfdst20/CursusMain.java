package be.vdab.jpfhfdst20;

import java.util.Comparator;
import java.util.TreeSet;

public class CursusMain {

    void main() {

        var cursussen = new TreeSet<Cursus>();

        cursussen.add(new Cursus(5, "Word", 100));
        cursussen.add(new Cursus(3, "Excel", 110));
        cursussen.add(new Cursus(1, "Windows", 110));
        cursussen.add(new Cursus(4, "Access", 120));
        cursussen.add(new Cursus(2, "PowerPoint", 80));

        IO.println("Sorteren op nummer:");

        for (var cursus : cursussen) {
            IO.println(cursus);
        }

        // Andere sortering: prijs, daarna nummer
        var opPrijs = new TreeSet<Cursus>(
                Comparator.comparingInt(Cursus::getPrijs)
                          .thenComparingInt(Cursus::getNummer)
        );

        opPrijs.addAll(cursussen);

        IO.println("\nSorteren op prijs:");

        for (var cursus : opPrijs) {
            IO.println(cursus);
        }
    }
}