package be.vdab.jpfhfdst5;

public class Invoer {
    void main() {
        var getal = Integer.parseInt(IO.readln("Geef een getal: "));
        var getal2 = Integer.parseInt(IO.readln("Geef nog een getal: "));
        var som = getal + getal2;

        IO.println("De som is: " + som);
    }
}
