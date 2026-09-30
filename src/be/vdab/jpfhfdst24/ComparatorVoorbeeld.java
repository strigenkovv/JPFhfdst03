package be.vdab.jpfhfdst24;

import java.util.Arrays;

public class ComparatorVoorbeeld {

    void main() {
        var groenten = new String[]{
                "tomaat", "sla", "ui", "prei"
        };

        Arrays.sort(
                groenten,
                (groente1, groente2) ->
                        -groente1.compareTo(groente2)
        );

        IO.println(Arrays.toString(groenten));

        Arrays.sort(
                groenten,
                (groente1, groente2) ->
                        groente1.length() - groente2.length()
        );

        IO.println(Arrays.toString(groenten));
    }
}
