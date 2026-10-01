package be.vdab.jpfhfdst24;

import java.util.ArrayList;
import java.util.Comparator;

public class OneveGetallen {
    void main() {
        var getallen = new ArrayList<Integer>();

        IO.println("Tik getallen. Tik 0 om te stoppen:");

        // Read numbers until the user enters 0.
        int getal;

        while ((getal = Integer.parseInt(IO.readln())) != 0) {
            getallen.add(getal);
        }

        // Keep odd numbers and sort them in descending order.
        getallen.stream()
                .filter(n -> n % 2 != 0)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .forEach(n -> IO.println(n));
    }
}
