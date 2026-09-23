package be.vdab.jpfhfdst5;

public class ProgrammaVerloopOef {
    void main() {
        var getal = Integer.parseInt(IO.readln("Geef een getal: "));

        if (getal % 2 == 0) {
            IO.println("Het getal is even.");
        } else {
            IO.println("Het getal is oneven.");
        }

        var resultaat = getal >= 10 ? "groot" : "klein";
        IO.println("Het getal is " + resultaat);

        var dag = IO.readln("Geef een dag van de week: ");

        switch (dag) {
            case "maandag", "dinsdag", "woensdag", "donderdag", "vrijdag" ->
                    IO.println("Werkdag");
            case "zaterdag", "zondag" ->
                    IO.println("Weekend");
            default ->
                    IO.println("Onbekende dag");
        }
    }
}
