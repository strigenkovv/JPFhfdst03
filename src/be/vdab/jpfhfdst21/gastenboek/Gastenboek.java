package be.vdab.jpfhfdst21.gastenboek;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Gastenboek implements Serializable {

    private static final long serialVersionUID = 1L;

    private final List<GastenboekEntry> entries = new ArrayList<>();

    public void voegToe(GastenboekEntry entry) {
        entries.add(entry);
    }

    @Override
    public String toString() {
        if (entries.isEmpty()) {
            return "Het gastenboek is leeg.";
        }

        var resultaat = new StringBuilder();

        // Display newest entries first.
        for (int i = entries.size() - 1; i >= 0; i--) {
            resultaat.append(entries.get(i))
                     .append("\n--------------------\n");
        }

        return resultaat.toString();
    }
}
