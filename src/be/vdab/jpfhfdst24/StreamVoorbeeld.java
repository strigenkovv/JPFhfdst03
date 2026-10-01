package be.vdab.jpfhfdst24;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class StreamVoorbeeld {

    void main() {
        var groenten = new String[]{
                "tomaat", "sla", "ui", "prei"
        };

        var stream = Arrays.stream(groenten);

        stream.forEach(groente -> IO.println(groente));

        var heiligeGetallen = new LinkedHashSet<Integer>();
        heiligeGetallen.add(1);
        heiligeGetallen.add(3);
        heiligeGetallen.add(4);
        heiligeGetallen.add(7);
        heiligeGetallen.stream()
                .forEach(getal -> IO.println(getal));



    }
}