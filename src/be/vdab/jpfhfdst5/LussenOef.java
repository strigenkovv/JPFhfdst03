package be.vdab.jpfhfdst5;

public class LussenOef {
    void main() {
        var getallen = new int[5];

        for (var i = 0; i < getallen.length; i++) {
            getallen[i] = i + 20;
        }

        for (var i = 0; i < getallen.length; i++) {
            IO.println("Element " + i + ": " + getallen[i]);
        }

        for (var getal : getallen) {
            IO.println(getal);
        }
    }
}
