package be.vdab.jpfhfdst16;

public class IsbnTest {
    void main() {
        try {
            var controle = new IsbnControle();

            controle.setIsbn13("978-0-306-40615-7");

            IO.println("Geldig ISBN: " + controle.getIsbn13());

        } catch (Isbn13Exception ex) {
            IO.println(ex.getMessage());
        }
    }
}
