package be.vdab.jpfhfdst12;

public class RekenaarMain {
    void main() {

        var rekenaar = new Rekenaar();

        rekenaar.bereken("17 + 38 * 2 - 22");
        IO.println("Resultaat: " + rekenaar.getResultaat());

        var expressie = IO.readln("Geef een expressie: ");

        rekenaar.bereken(expressie);
        IO.println("Resultaat: " + rekenaar.getResultaat());
    }
}
