package be.vdab.jpfhfdst12;

public class PalindroomMain {
    void main() {

        var woord = IO.readln("Geef een woord: ");

        var palindroom = new Palindroom();

        IO.println(
                "Hoofdlettergevoelig: "
                + palindroom.isPalindroom(woord, true)
        );

        IO.println(
                "Niet hoofdlettergevoelig: "
                + palindroom.isPalindroom(woord, false)
        );
    }
}
