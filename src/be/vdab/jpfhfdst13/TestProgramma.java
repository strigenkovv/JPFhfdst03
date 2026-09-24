package be.vdab.jpfhfdst13;

public class TestProgramma {
    void main() {

        var personenwagen = new Personenwagen(
                "Jan Peeters",
                35_000F,
                150,
                6.5F,
                "2-XYZ-456",
                5,
                5
        );

        var vrachtwagen = new Vrachtwagen(
                "Transport NV",
                80_000F,
                450,
                25F,
                "1-ABC-123",
                20_000F
        );

        var stookketel = new Stookketel(3.5F);

        Vervuiler[] vervuilers = {
                personenwagen,
                vrachtwagen,
                stookketel
        };

        IO.println("=== Vervuiling ===");

        for (var vervuiler : vervuilers) {
            IO.println(vervuiler.berekenVervuiling());
        }

        Privaat[] privateObjecten = {
                personenwagen,
                vrachtwagen
        };

        IO.println("\n=== Private data ===");

        for (var privaat : privateObjecten) {
            privaat.geefPrivateData();
            IO.println();
        }

        Milieu[] milieuObjecten = {
                personenwagen,
                vrachtwagen
        };

        IO.println("\n=== Milieu data ===");

        for (var milieu : milieuObjecten) {
            milieu.geefMilieuData();
            IO.println();
        }
    }
}
