package be.vdab.jpfhfdst8;

public class Main {
    void main() {
        double standSpaarrekening;

        var spaar1 = new Spaarrekening("BE12 3456 7890 1234", 1.5);
        var spaar2 = new Spaarrekening("BE98 7654 3210 9876", 1.5);

        spaar1.storten(100.0);

        standSpaarrekening = spaar1.getSaldo();
        IO.println("Saldo van spaarrekening 1: " + standSpaarrekening);

        IO.println("Saldo van spaarrekening 2: " + spaar2.getSaldo());

        spaar1.overschrijven(spaar2, 25.0);

        IO.println("Saldo van spaarrekening 1 "
                   + spaar1.getRekeningNummer()
                   + " is " + spaar1.getSaldo());

        IO.println("Saldo van spaarrekening 2 "
                   + spaar2.getRekeningNummer()
                   + " is " + spaar2.getSaldo());

        spaar2.afhalen(5.0);

        IO.println("Saldo van spaarrekening 2 "
                   + spaar2.getRekeningNummer()
                   + " is " + spaar2.getSaldo());
    }
}
