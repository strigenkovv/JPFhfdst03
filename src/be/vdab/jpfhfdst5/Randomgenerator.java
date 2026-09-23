package be.vdab.jpfhfdst5;

public class Randomgenerator {
    void main() {
        var aantallen = new int[100];

        for (var i = 0; i < 10_000; i++) {
            var getal = (int) (Math.random() * 100) + 1;
            aantallen[getal - 1]++;
        }

        for (var i = 0; i < aantallen.length; i++) {
            IO.println((i + 1) + " werd " + aantallen[i] + " keer gegenereerd.");
        }
    }
}
