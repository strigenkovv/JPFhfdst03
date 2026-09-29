package be.vdab.jpfhfdst21.gastenboek;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GastenboekEntry implements Serializable {

    private static final long serialVersionUID = 1L;

    private final LocalDateTime datum;
    private final String schrijver;
    private final String boodschap;

    public GastenboekEntry(String schrijver, String boodschap) {
        this.datum = LocalDateTime.now();
        this.schrijver = schrijver;
        this.boodschap = boodschap;
    }

    @Override
    public String toString() {
        var formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        return datum.format(formatter)
               + " | " + schrijver
               + "\n" + boodschap;
    }
}
