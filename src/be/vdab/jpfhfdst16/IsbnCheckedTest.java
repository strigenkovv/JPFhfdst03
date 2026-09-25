package be.vdab.jpfhfdst16;

public class IsbnCheckedTest {

    void main() {
        var controle = new IsbnControleChecked();

        try {
            controle.controleer("");
            IO.println("ISBN is geldig");
        } catch (IsbnCheckedException ex) {
            IO.println("Fout: " + ex.getMessage());
        }
    }
}
