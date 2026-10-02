package be.vdab.herhalingsoefeningen;

public class BreukMain {
    static void main() {
        int teller = Integer.parseInt(IO.readln("Teller: "));
        int noemer = Integer.parseInt(IO.readln("Noemer: "));

        try {
            var k = new Breuk(teller, noemer);
            IO.println(k);

            // Выведи его на экран.
        } catch (IllegalArgumentException ex) {
            IO.println(ex.toString());
            // Выведи сообщение об ошибке.
        }
    }
}
