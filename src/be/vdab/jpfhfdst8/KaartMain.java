package be.vdab.jpfhfdst8;

public class KaartMain {

    void main() {
        var kaart1 = new Kaart();
        var kaart2 = new Kaart();

        IO.println("Kaart 1:");
        kaart1.printKaart();

        IO.println("Kaart 2:");
        kaart2.printKaart();

        if (kaart1.isHogerDan(kaart2)) {
            IO.println("Kaart 1 is hoger dan kaart 2.");
        } else {
            IO.println("Kaart 1 is niet hoger dan kaart 2.");
        }
    }
}
