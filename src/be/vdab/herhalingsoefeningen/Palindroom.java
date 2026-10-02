package be.vdab.herhalingsoefeningen;

public class Palindroom {
    public static void main(String[] args) {
        var woord = IO.readln("Geef een woord: ");

        var newWoord = new StringBuilder(woord);

        if (woord.equals(newWoord.reverse().toString())) {
            IO.println("YES");
        }
        else {
            IO.println("NO");
        }

        IO.println(
                new StringBuilder(woord).reverse().toString().equals(woord) ?
                        "palindroom" : "geen palindroom");

    }
}
