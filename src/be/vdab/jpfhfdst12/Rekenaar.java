package be.vdab.jpfhfdst12;

public class Rekenaar {
    private int resultaat;

    public void bereken(String expressie) {
        var delen = expressie.split(" ");

        resultaat = Integer.parseInt(delen[0]);

        for (var i = 1; i < delen.length; i += 2) {
            var bewerking = delen[i];
            var getal = Integer.parseInt(delen[i + 1]);

            switch (bewerking) {
                case "+" -> resultaat += getal;
                case "-" -> resultaat -= getal;
                case "*" -> resultaat *= getal;
                case "/" -> resultaat /= getal;
            }
        }
    }

    public int getResultaat() {
        return resultaat;
    }
}
