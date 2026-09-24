package be.vdab.jpfhfdst12;

public class Palindroom {
    public boolean isPalindroom(String tekst, boolean hoofdletterGevoelig) {

        var omgekeerd = new StringBuilder(tekst)
                .reverse()
                .toString();

        if (hoofdletterGevoelig) {
            return tekst.equals(omgekeerd);
        }

        return tekst.equalsIgnoreCase(omgekeerd);
    }
}
