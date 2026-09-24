package be.vdab.jpfhfdst10;

public class TestProgramma {
    void main() {

        var vrachtwagen1 = new Vrachtwagen();

        var vrachtwagen2 = new Vrachtwagen(
                "Transport NV",
                80_000F,
                450,
                25F,
                "1-ABC-123",
                20_000F
        );

        var personenwagen1 = new Personenwagen();

        var personenwagen2 = new Personenwagen(
                "Jan Peeters",
                35_000F,
                150,
                6.5F,
                "2-XYZ-456",
                5,
                5
        );

        IO.println("=== toString ===");
        IO.println(vrachtwagen1.toString());
        IO.println(vrachtwagen2.toString());
        IO.println(personenwagen1.toString());
        IO.println(personenwagen2.toString());

        IO.println("\n=== toon() ===");
        vrachtwagen1.toon();
        vrachtwagen2.toon();
        personenwagen1.toon();
        personenwagen2.toon();

        IO.println("\n=== Kyoto score ===");
        IO.println("Vrachtwagen 1: " + vrachtwagen1.getKyotoScore());
        IO.println("Vrachtwagen 2: " + vrachtwagen2.getKyotoScore());
        IO.println("Personenwagen 1: " + personenwagen1.getKyotoScore());
        IO.println("Personenwagen 2: " + personenwagen2.getKyotoScore());

        Voertuig[] voertuigen = {
                vrachtwagen1,
                vrachtwagen2,
                personenwagen1,
                personenwagen2
        };

        IO.println("\n=== Array met toString() ===");

        for (var voertuig : voertuigen) {
            IO.println(voertuig.toString());
        }

        IO.println("\n=== Array met toon() ===");

        for (var voertuig : voertuigen) {
            voertuig.toon();
            IO.println();
        }
    }
}
