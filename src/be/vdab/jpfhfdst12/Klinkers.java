package be.vdab.jpfhfdst12;

public class Klinkers {
    void main() {
        var zin = IO.readln("Geef een zin: ");

        var aantal = 0;

        for (var i = 0; i < zin.length(); i++) {
            var letter = Character.toLowerCase(zin.charAt(i));

            if (letter == 'a' ||
                letter == 'e' ||
                letter == 'i' ||
                letter == 'o' ||
                letter == 'u') {

                aantal++;
            }
        }

        IO.println("Aantal klinkers: " + aantal);
    }
}
